package org.YaoLeGouDB.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Tool {

	/**
	 * �޸�ͷ��·��
	 * @param path
	 * @param UserName
	 * @return
	 * @throws IOException
	 * ���أ�D:/Tomcat 8/webapps/
	 * 
	 * ��������C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/
	 */
	public String UpdatePathName(String path,String UserName) throws IOException{
		String paths = null;
		File oldFile = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/TouXiang/"+path);
		if(!oldFile.exists())
		{
		   oldFile.createNewFile();
		}
		String rootPath = oldFile.getParent();
		File newFile = new File(rootPath + File.separator + UserName+".jpg");
		paths = newFile+"";
		 if (oldFile.renameTo(newFile)) 
		  {
		   System.out.println("�޸ĳɹ�!");
		  } 
		  else 
		  {
		   System.out.println("�޸�ʧ��");
		  }
		return paths;
	}
	
	public void DelImage(String UserName){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/TouXiang/"+UserName+".jpg");
        // ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
        if (file.delete()) {
        	System.out.println("ͷ���ļ��ɹ���");
        } else {
        	System.out.println("ͷ���ļ�ʧ�ܣ�");
        }
	}
	//ɾ������ͼ
	public void DelFegMian(String id){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+id+"_fengmian.jpg");
        // ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
        if (file.delete()) {
        	System.out.println("ͷ���ļ��ɹ���");
        } else {
        	System.out.println("ͷ���ļ�ʧ�ܣ�");
        }
	}
	
	//ɾ����ɫ�ļ������������
	public void DelColorImage(int shopid,int index){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+shopid+"_color_"+index+".jpg");
        // ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
        if (file.delete()) {
        	System.out.println("��Ʒ��ɫɾ�������ļ��ɹ���");
        } else {
        	System.out.println("��Ʒ��ɫɾ�������ļ�ʧ�ܣ�");
        }
	}
	//ɾ����ϸ�ļ������������
	public void DelMingXiImage(int shopid,int index){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+shopid+"_default_"+index+".jpg");
	    // ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
	    if (file.delete()) {
	        System.out.println("��ϸͼƬɾ�������ļ��ɹ���");
	    } else {
	        System.out.println("��ϸͼƬɾ�������ļ�ʧ�ܣ�");
	    }
	}
	
	
	
	//�޸���Ʒ��ͼƬ��Ϣ
	public String Updatefengmian(String path,int shopid) throws IOException{
		String paths = null;
		File oldFile = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+path);
		if(!oldFile.exists())
		{
		   oldFile.createNewFile();
		}
		String rootPath = oldFile.getParent();
		File newFile = new File(rootPath + File.separator + shopid+"_fengmian.jpg");
		paths = newFile+"";
		 if (oldFile.renameTo(newFile)) 
		  {
		   System.out.println("�޸ĳɹ�!");
		  } 
		  else 
		  {
		   System.out.println("�޸�ʧ��");
		  }
		return paths;
	}
	
	//�޸���ƷĬ�ϵ�ͼƬ��Ϣ
	public String Updatedefault(String path,int shopid,int mingxiid) throws IOException{
		String paths = null;
		File oldFile = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+path);
		if(!oldFile.exists())
		{
		   oldFile.createNewFile();
		}
		String rootPath = oldFile.getParent();
		File newFile = new File(rootPath + File.separator + shopid+"_default_"+mingxiid+".jpg");
		paths = newFile+"";
		if (oldFile.renameTo(newFile)) 
		{
		System.out.println("�޸ĳɹ�!");
		}
		else 
		{
		System.out.println("�޸�ʧ��");
		}
		return paths;
	}
	
	//�޸���Ʒ��ɫ��ͼƬ��Ϣ
	public String UpdateShopColorInfo(String path,int shopid,int count) throws IOException{
			String paths = null;
			File oldFile = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+path);
			if(!oldFile.exists())
			{
			   oldFile.createNewFile();
			}
			String rootPath = oldFile.getParent();
			File newFile = new File(rootPath + File.separator + shopid+"_color_"+count+".jpg");
			paths = newFile+"";
			 if (oldFile.renameTo(newFile)) 
			  {
			   System.out.println("�޸ĳɹ�!");
			  } 
			  else 
			  {
			   System.out.println("�޸�ʧ��");
			  }
			return paths;
	}
	/*****************************************************��̨***************************************************/
	//���Bannerͼ
	public String AddBannerImage(String path) throws IOException{
		Date d = new Date();
		long time = d.getTime();
		String paths = null;
		File oldFile = new File("D:/Tomcat 8/webapps/YaoLeGou/Image/Index_Image/"+path);
		if(!oldFile.exists())
		{
		   oldFile.createNewFile();
		}
		String rootPath = oldFile.getParent();
		File newFile = new File(rootPath + File.separator + time+".jpg");
		paths = newFile+"";
		 if (oldFile.renameTo(newFile)) 
		  {
		   System.out.println("�޸ĳɹ�!");
		  } 
		  else 
		  {
		   System.out.println("�޸�ʧ��");
		  }
		return time+"";
	}
	//ɾ����ϸ�ļ������������
	public void DelBannerURL(String ImageURL){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/"+ImageURL);
		// ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
		if (file.delete()) {
			System.out.println("Bannerͼ�����ļ��ɹ���");
		} else {
		    System.out.println("Bannerͼɾ�������ļ�ʧ�ܣ�");
		}
	}
	//ɾ���û�ͷ��
	public void DelUserInfoImage(String UserName){
		if(!UserName.equals("attached/TouXiang/default.gif")){
			File file = new File("D:/Tomcat 8/webapps/YaoLeGou/"+UserName);
	        // ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
	        if (file.delete()) {
	        	System.out.println("ɾ�������ļ��ɹ���");
	        } else {
	        	System.out.println("ɾ�������ļ�ʧ�ܣ�");
	        }
		}
		
	}
}
