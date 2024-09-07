package com.edu.seiryo.servlet;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.json.JSONException;
import org.json.JSONObject;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;
import com.edu.seiryo.util.ExcelCreate;
import com.edu.seiryo.util.FileUtils;
import com.edu.seiryo.util.JSONStringObject;
import com.edu.seiryo.util.JSONUtil;
import com.edu.seiryo.util.JavaEmail;
import com.edu.seiryo.util.MD5;
import com.edu.seiryo.util.Pager;
import com.edu.seiryo.util.WordCreate;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImp();

    /**
     * Default constructor. 
     */
    public UserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String flag = request.getParameter("opt");
		if("checkUserName".equals(flag)){
			checkUserName(request,response);
		}else if("checkImage".equals(flag)){
			checkImage(request,response);
		}else if("checkPassword".equals(flag)){
			checkPassword(request,response);
		}else if("sendEmail".equals(flag)){
			sendEmail(request,response);
		}else if("checkNumber".equals(flag)){
			checkNumber(request,response);
		}else if("checkAll".equals(flag)){
			checkAll(request,response);
		}else if("checkLoginUserName".equals(flag)){
			checkLoginUserName(request,response);
		}else if("checkLoginAll".equals(flag)){
			checkLoginAll(request,response);
		}else if("queryAllUser".equals(flag)){
			queryAllUser(request,response);
		}else if("downloadExcel".equals(flag)){
			downloadExcel(request,response);
		}else if("downloadTxt".equals(flag)){
			downloadTxt(request,response);
		}else if("downloadWord".equals(flag)){
			downloadWord(request,response);
		}else if("main2".equals(flag)){
			main2(request,response);
		}
	}
	protected void checkUserName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		session.setAttribute("userName", userName);
		if (userName != null && !userName.equals("")) {
			boolean bo = userService.checkUserName(userName);
			if(bo){
				//���ڣ�����ע��
				pw.print(true);
			}else {
				pw.print(false);
			}
			pw.flush();
			pw.close();
		}else {
			//�û���Ϊ��
			pw.print(true);
			pw.flush();
			pw.close();
		}
		
	}
	protected void checkImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String image = request.getParameter("image");
		session.setAttribute("image", image);
		String rand = (String) session.getAttribute("rand");
		if(image.equals(rand)){
			pw.print(true);
		}else {
			pw.print(false);
		}
		pw.flush();
		pw.close();
	}
	protected void checkPassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String password = request.getParameter("password");
		session.setAttribute("password", password);
		if (password != null && !password.equals("")) {
				//��Ϊ�գ���ע��
				pw.print(true);
			pw.flush();
			pw.close();
		}else {
			//Ϊ�գ�����ע��
			pw.print(false);
			pw.flush();
			pw.close();
		}
	}
	protected void sendEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		session.setAttribute("email", email);
		Random random = new Random();
		int number = random.nextInt(9000)+1000;
		int res = JavaEmail.sendEmail("smtp.qq.com", email, "ltsbthqepzivbdch", email, new String[]{email}, "��֤�룺", String.valueOf(number), "text/html;charset=utf-8");
		if(res == 1){
			//���ͳɹ�
			session.setAttribute("number", number);
			pw.print(true);
			pw.flush();
			pw.close();
		}else {
			pw.print(false);
		}
	}
	protected void checkNumber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String num = request.getParameter("number");
		if(num != null && !num.equals("")){
			int inputNumber = Integer.parseInt(num);
			Integer number = (Integer) session.getAttribute("number");
			if(number == inputNumber){
				//������ȷ
				pw.print(true);
				pw.flush();
				pw.close();
			}else {
				pw.print(false);
				pw.flush();
				pw.close();
			}
		}
	}
	protected void checkAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		HttpSession session = request.getSession();
		String rand = (String) session.getAttribute("rand");
		String image = request.getParameter("image");
		String num = request.getParameter("number");
		if (userName != null && !userName.equals("") && password != null && !password.equals("") && email != null && !email.equals("") && num != null && !num.equals("")) {
			boolean bo = userService.checkUserName(userName);
			if(!bo){
				int inputNumber = Integer.parseInt(num);
				Integer number = (Integer) session.getAttribute("number");
				if(number == inputNumber){
					if(image.equals(rand)){
						MD5 MD5 = new MD5();
						String newPwd = MD5.getMD5ofStr(password);
						User user = new User(userName, newPwd, email);
						boolean bo2 = userService.regist(user);
						if(bo2){
							request.setAttribute("msg6", "ע��ɹ�");
							request.getRequestDispatcher("index.jsp").forward(request, response);
						}else {
							request.setAttribute("msg6", "ע��ʧ��");
							request.getRequestDispatcher("index.jsp").forward(request, response);
						}
					}else {
						request.setAttribute("msg6", "ͼƬ��֤�벻һ�£�ע��ʧ��");
						request.getRequestDispatcher("index.jsp").forward(request, response);
					}	
				}else {
					request.setAttribute("msg6", "������֤�벻һ�£�ע��ʧ��");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}	
			}else {
				request.setAttribute("msg6", "�û����Ѵ��ڣ�ע��ʧ��");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
				
			}else {
				request.setAttribute("msg6", "���벻��Ϊ�գ�ע��ʧ��");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
	}
	protected void checkLoginUserName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("userName");
		if (userName != null && !userName.equals("")) {
				//��Ϊ�գ��ɵ�¼
				pw.print(true);
			pw.flush();
			pw.close();
		}else {
			//Ϊ�գ����ܵ�¼
			pw.print(false);
			pw.flush();
			pw.close();
		}
	}
	protected void checkLoginAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String rand = (String) session.getAttribute("rand");
		String image = request.getParameter("image");
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);
		session.setAttribute("image", image);
		MD5 MD5 = new MD5();
		String newPwd = MD5.getMD5ofStr(password);
		if (userName != null && !userName.equals("") && password != null && !password.equals("") && image != null && !image.equals("")) {
			if(image.equals(rand)){
				User user = userService.login(userName, newPwd);
				if(user != null){
					request.setAttribute("userName", userName);
					request.getRequestDispatcher("main.jsp").forward(request, response);
				}else {
					request.setAttribute("msg4", "�˺Ż�������󣬵�¼ʧ��");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("msg4", "ͼƬ��֤�벻һ�£���¼ʧ��");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			//Ϊ�գ����ܵ�¼
			request.setAttribute("msg4", "���벻��Ϊ�գ���¼ʧ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	protected void queryAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		List<User> list = new ArrayList<User>();
		String username = request.getParameter("name");
		if(username != null && !username.equals("")){
			User user = userService.queryUserByName(username);
			if(user != null){
				list.add(user);
				try {
					pw.print(JSONObject.quote(JSONUtil.toJSONString(list)));
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		}else {
			List<User> list2 = userService.queryAllUser();
			try {
				pw.print(JSONObject.quote(JSONUtil.toJSONString(list2)));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		pw.flush();
		pw.close();
	}
	protected void downloadExcel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ExcelCreate excelCreate = new ExcelCreate();
		excelCreate.createSheet("�û����ݱ�");
		List<User> list = userService.queryAllUser();
		try {
			excelCreate.addHeader(Arrays.asList("�û����","�û���","�û�����","�û�����"), true);
			for (User user : list) {
				excelCreate.addRow(Arrays.asList(user.getId(),user.getUserName(),user.getPassword(),user.getEmail()));
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	        String day = sdf.format(new Date());
	        int number = (int) (Math.random() * 1000);	        
	        String fileName = "user_" + day +  number + ".xls";
	        String path = request.getServletContext().getRealPath("/");
	        excelCreate.exportExcel(path + "/" + fileName);
	        excelCreate.download(path + "/" + fileName, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void downloadTxt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String savePath = this.getServletContext().getRealPath("");
			ExcelCreate excelCreate = new ExcelCreate();
			FileUtils fileUtils = new FileUtils();
			List<User> list = userService.queryAllUser(); 
	        List<String[]> list2 = new ArrayList<>();
	        list2.add(new String[] { "�û����", "�û���", "�û�����", "�û�����" });

	        for (User user : list) {
	        	list2.add(new String[] {
	                user.getId().toString(),
	                user.getUserName(),
	                user.getPassword(),
	                user.getEmail()
	            });
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	        String day = sdf.format(new Date());
	        int number = (int) (Math.random() * 1000);	        
	        String fileName = "user_" + day +  number + ".txt";
			// дTXT�ļ�
			fileUtils.writeFile(list2, "\\"+fileName,savePath);
			SmartUpload su = new SmartUpload();
			//�ϴ���ʼ��
			su.initialize(getServletConfig(),request,response);
			//����
			try {
				String path = savePath+"\\"+fileName+".txt";
				System.out.println(path);
				su.downloadFile(path);
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("�ļ��������" + e);
		}
	}
	public void downloadWord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
	            String savePath = this.getServletContext().getRealPath("/");
	            List<User> userList = userService.queryAllUser();
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	            String day = sdf.format(new Date());
	            int number = (int) (Math.random() * 1000);
	            String fileName = "user_" + day + number + ".docx";
	            String filePath = savePath + fileName;
	            List<String> headers = Arrays.asList("�û����","�û���","�û�����","�û�����");
	            List<List<String>> data = new ArrayList<>();
	            for (User user : userList) {
	                List<String> row = Arrays.asList(
	                    user.getId().toString(),
	                    user.getUserName(),
	                    user.getPassword(),
	                    user.getEmail()
	                );
	                data.add(row);
	            }
	            WordCreate wordCreate = new WordCreate();
	            wordCreate.createWord(headers, data, filePath);
	            wordCreate.downloadWord(filePath, response);
	        } catch (Exception e) {
	            System.out.println("�ļ��������: " + e);
	            e.printStackTrace();
	        }
	    }
	public void main2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 1;// ��ǰ�ǵڼ�ҳ
		if (request.getParameter("currentPage") != null)// �жϵ�ǰҳ���Ƿ�Ϊ��
		{
			// ��Ϊ����������û��������ҳ
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		//����ҵ���߼�����󲢵��÷�����ѯ����list����
		List<User> list = userService.queryAllUser();
		//1��������ҳ�����
		Pager pager = new Pager();
		//2����Ҫ��ҳ���ı�
		pager.setTopicSelect(list);
		//3������ÿҳ��ʾ����
		pager.setSizePerPage(2);
		//4����ȡ���ҳ��
		int maxPager = pager.getTotalPage();
		//5����ȡ��ǰҳ
		pager.setCurrentPage(currentPage);
		request.setAttribute("pager", pager);
		request.getRequestDispatcher("main2.jsp").forward(request, response);
	}
}
