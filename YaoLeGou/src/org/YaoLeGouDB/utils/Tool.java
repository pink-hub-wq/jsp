package org.YaoLeGouDB.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Tool {

	/**
	 * 修改头像路径
	 * @param path
	 * @param UserName
	 * @return
	 * @throws IOException
	 * 本地：D:/Tomcat 8/webapps/
	 * 
	 * 服务器：C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/
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
		   System.out.println("修改成功!");
		  } 
		  else 
		  {
		   System.out.println("修改失败");
		  }
		return paths;
	}
	
	public void DelImage(String UserName){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/TouXiang/"+UserName+".jpg");
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.delete()) {
        	System.out.println("头像文件成功！");
        } else {
        	System.out.println("头像文件失败！");
        }
	}
	//删除封面图
	public void DelFegMian(String id){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+id+"_fengmian.jpg");
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.delete()) {
        	System.out.println("头像文件成功！");
        } else {
        	System.out.println("头像文件失败！");
        }
	}
	
	//删除颜色文件夹里面的数据
	public void DelColorImage(int shopid,int index){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+shopid+"_color_"+index+".jpg");
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.delete()) {
        	System.out.println("商品颜色删除单个文件成功！");
        } else {
        	System.out.println("商品颜色删除单个文件失败！");
        }
	}
	//删除明细文件夹里面的数据
	public void DelMingXiImage(int shopid,int index){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/attached/image/"+shopid+"_default_"+index+".jpg");
	    // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
	    if (file.delete()) {
	        System.out.println("明细图片删除单个文件成功！");
	    } else {
	        System.out.println("明细图片删除单个文件失败！");
	    }
	}
	
	
	
	//修改商品的图片信息
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
		   System.out.println("修改成功!");
		  } 
		  else 
		  {
		   System.out.println("修改失败");
		  }
		return paths;
	}
	
	//修改商品默认的图片信息
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
		System.out.println("修改成功!");
		}
		else 
		{
		System.out.println("修改失败");
		}
		return paths;
	}
	
	//修改商品颜色的图片信息
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
			   System.out.println("修改成功!");
			  } 
			  else 
			  {
			   System.out.println("修改失败");
			  }
			return paths;
	}
	/*****************************************************后台***************************************************/
	//添加Banner图
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
		   System.out.println("修改成功!");
		  } 
		  else 
		  {
		   System.out.println("修改失败");
		  }
		return time+"";
	}
	//删除明细文件夹里面的数据
	public void DelBannerURL(String ImageURL){
		File file = new File("D:/Tomcat 8/webapps/YaoLeGou/"+ImageURL);
		// 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
		if (file.delete()) {
			System.out.println("Banner图单个文件成功！");
		} else {
		    System.out.println("Banner图删除单个文件失败！");
		}
	}
	//删除用户头像
	public void DelUserInfoImage(String UserName){
		if(!UserName.equals("attached/TouXiang/default.gif")){
			File file = new File("D:/Tomcat 8/webapps/YaoLeGou/"+UserName);
	        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
	        if (file.delete()) {
	        	System.out.println("删除单个文件成功！");
	        } else {
	        	System.out.println("删除单个文件失败！");
	        }
		}
		
	}
}
