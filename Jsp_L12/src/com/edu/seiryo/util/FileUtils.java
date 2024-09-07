package com.edu.seiryo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class FileUtils {
	public void writeFile(List<String[]> list, String name,String savePath) throws IOException {
		Iterator<String[]> it = list.iterator();
		FileWriter fw = null;//�����ļ���д
		BufferedWriter bw = null;//�����ļ���д
		boolean flag = false;
		try {
			System.out.println("д���ļ���ʼ: " + name);
			fw = new FileWriter(savePath + name + ".txt", true);//�����ļ���д
			bw = new BufferedWriter(fw, 100);//�����ļ���д
			String[] arr = null;
			String line = null;
			while (it.hasNext()) {
				arr = (String[]) it.next();
				line = StringUtils.join(arr, "|");
				bw.write(line);//�������
				bw.write("\r\n");//�������
			}
		} catch (IOException e) {
			System.out.println("д���ļ�����: " + name+e);
			flag = false;
		} finally {
			if (bw != null) {
				bw.flush();
				bw.close();
			}
			if (fw != null)
				fw.close();
		}
	}
}
