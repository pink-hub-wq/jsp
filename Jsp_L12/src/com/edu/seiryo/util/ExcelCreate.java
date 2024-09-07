package com.edu.seiryo.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddressList;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.DataFormat;

public class ExcelCreate {

	private HSSFWorkbook wb = null;

	private HSSFSheet sheet = null;

	private HSSFDataFormat format = null;

	private HSSFRow hdRow = null;

	private int listlength = 0;

	/* ���һ�� */
	private int s = 1;

	/**
	 * ���ù�����ĸ�ʽ
	 * 
	 * @param sheetName
	 */
	public ExcelCreate() {
		wb = new HSSFWorkbook();
	}

	public void createSheet(String sheetName) {
		sheet = wb.createSheet(sheetName);
		format = wb.createDataFormat();
		hdRow = sheet.createRow(0);
		sheet.setDefaultRowHeightInPoints(120);
		sheet.setDefaultColumnWidth(12);
	}

	/* ���ø��е�Ԫ���� */
	public void setDefaultCellHighWidthInRange(short[] eachCellWidth, int high) {
		// �ٶ���һ�к͵�һ������ĵ�Ԫ���Ѿ��������ˣ�Ҳ����˵������֮ǰ�Ѿ�������DesignXlsHeaderFooter.setXlsHeader
		sheet.setDefaultRowHeightInPoints(high);// ����Ĭ�ϸ�
		/* ���ø��е�Ԫ���� */
		for (int i = 0; i < eachCellWidth.length; i++) {
			// System.out.print(""+i+"\t");
			sheet.setColumnWidth((short) i, (short) ((eachCellWidth[i]) * 256));
		}
	}

	/**
	 * ��ͷ����
	 * 
	 * @throws Exception
	 */
	public void addHeader(List rowvalues, boolean isFilter) throws Exception {
		listlength = rowvalues.size();
		// ��������
		HSSFFont workFont = wb.createFont();
		workFont.setFontName("΢���ź�");
		workFont.setFontHeightInPoints((short) 14);
		workFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// ��ͷ��ʽ������ɫ
		HSSFCellStyle hdStyle = wb.createCellStyle();
		hdStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		hdStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		hdStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		hdStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		hdStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		hdStyle.setRightBorderColor(HSSFColor.BLACK.index);
		hdStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		hdStyle.setTopBorderColor(HSSFColor.BLACK.index);
		hdStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		hdStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		hdStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		hdStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		hdStyle.setFont(workFont);

		String[] title = new String[rowvalues.size()];
		for (int i = 0; i < rowvalues.size(); i++) {
			title[i] = (String) rowvalues.get(i);
		}
		HSSFRow dtRow = sheet.createRow((1));
		if (isFilter == true) {
			for (int i = 0; i < title.length; i++) {
				HSSFCell cell1 = hdRow.createCell(i);
				HSSFRichTextString value = new HSSFRichTextString(title[i]);
				cell1.setCellValue(value);
				cell1.setCellStyle(hdStyle);
			}
		} else {
			for (int i = 0; i < title.length; i++) {
				HSSFCell cell2 = dtRow.createCell(i);
				HSSFRichTextString value2 = new HSSFRichTextString(title[i]);
				cell2.setCellValue(value2);
			}
		}
	}

	public void addRow(List rowvalues) {
		HSSFRow dtRow = sheet.createRow(s++);
		DataFormat format = wb.createDataFormat();

		HSSFCellStyle dtStyle = wb.createCellStyle();
		dtStyle.setDataFormat(format.getFormat("text"));
		dtStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		dtStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		dtStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		dtStyle.setRightBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		dtStyle.setTopBorderColor(HSSFColor.BLACK.index);
		dtStyle.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);

		HSSFCellStyle dateStyle = wb.createCellStyle();
		dateStyle.setDataFormat(format.getFormat("yyyy-m-d"));
		dateStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		dateStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		dateStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		dateStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		dateStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		dateStyle.setRightBorderColor(HSSFColor.BLACK.index);
		dateStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		dateStyle.setTopBorderColor(HSSFColor.BLACK.index);
		dateStyle.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);

		for (int j = 0; j < rowvalues.size(); j++) {
			String flag = "";
			Object cell_data = rowvalues.get(j);
			HSSFCell cell = dtRow.createCell(j);
			// ���ĸ�ʽ
			if (cell_data instanceof String) {
				flag = "string";
				cell.setCellValue((String) cell_data);
			} else if (cell_data instanceof Double) {
				cell.setCellValue((Double) cell_data);
			} else if (cell_data instanceof Integer) {
				cell.setCellValue(Double.valueOf(String.valueOf(cell_data)));
			} else if (cell_data instanceof Date) {
				flag = "date";
				cell.setCellValue((Date) cell_data);
			} else if (cell_data instanceof Boolean) {
				cell.setCellValue((Boolean) cell_data);
			} else if (cell_data instanceof Float) {
				cell.setCellValue((Float) cell_data);
			}

			// ������ɫ
			// if(s%2!=0)
			// dtStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			// dtStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

			if (flag == "" || flag.equals("string")) {
				cell.setCellStyle(dtStyle);
			} else if (flag.equals("date")) {
				cell.setCellStyle(dateStyle);
			}

		}
		// }
	}

	/**
	 * ��ָ������׷��һ������
	 * 
	 * @param rowvalues
	 * @param row
	 */
	public void insertRow(List rowvalues, int row) {
		sheet.shiftRows(row, sheet.getLastRowNum(), 1);
		HSSFRow dtRow = sheet.createRow(row);
		HSSFCellStyle dtStyle = wb.createCellStyle();
		dtStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		dtStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		dtStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		dtStyle.setRightBorderColor(HSSFColor.BLACK.index);
		dtStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		dtStyle.setTopBorderColor(HSSFColor.BLACK.index);
		dtStyle.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
		DataFormat format = wb.createDataFormat();
		Short str = format.getFormat("text");
		Short date = format.getFormat("yyyy-m-d");
		for (int j = 0; j < rowvalues.size(); j++) {
			Object cell_data = rowvalues.get(j);
			HSSFCell cell = dtRow.createCell(j);
			if (cell_data instanceof String) {
				dtStyle.setDataFormat(str);
				cell.setCellValue((String) cell_data);
			} else if (cell_data instanceof Double) {
				cell.setCellValue((Double) cell_data);
			} else if (cell_data instanceof Integer) {
				cell.setCellValue(Double.valueOf(String.valueOf(cell_data)));
			} else if (cell_data instanceof Date) {
				dtStyle.setDataFormat(date);
				cell.setCellValue((Date) cell_data);
			} else if (cell_data instanceof Boolean) {
				cell.setCellValue((Boolean) cell_data);
			} else if (cell_data instanceof Float) {
				cell.setCellValue((Float) cell_data);
			}
			// ������ɫ
			// if(s%2!=0)
			// dtStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			// dtStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			cell.setCellStyle(dtStyle);
		}
	}

	/**
	 * ɾ��ָ������
	 * 
	 * @param row
	 */
	public void delRow(int row) {
		if (row > 0) {
			try {
				// HSSFRow dtRow = sheet.getRow(row);
				sheet.shiftRows(row, sheet.getLastRowNum(), -1);
				// sheet.removeRow(dtRow);
			} catch (RuntimeException e) {
				e.printStackTrace();
				System.out.println("error");
			}
		} else {
			System.out.println("�����");
		}
	}

	/**
	 * ��ָ�����и��������б�
	 * 
	 * @param row
	 * @param cells
	 * @param list
	 */
	public void setSelect(int row, int cells, List cellvalue) {
		String[] str = new String[cellvalue.size()];
		for (int i = 0; i < cellvalue.size(); i++) {
			str[i] = (String) cellvalue.get(i);
		}
		CellRangeAddressList regions = new CellRangeAddressList(row, 65535,
				cells, cells);
		DVConstraint constraint = DVConstraint
				.createExplicitListConstraint(str);
		HSSFDataValidation dataValidate = new HSSFDataValidation(regions,
				constraint);
		sheet.addValidationData(dataValidate); // ����������Ч�Ե���ǰsheet����
	}

	/**
	 * �ϲ���Ԫ��//���Ͻǵ����½�int col1,int row1,int col2,int row2
	 */
	// public void hebing(){
	// HSSFRow row = sheet.createRow(0);
	// HSSFCell cell = row.createCell(0);
	// cell.setCellValue(sheetName);
	// sheet.addMergedRegion(new Region(0, (short) 0, 0, (short) 5));
	// }

	/**
	 * �����ļ����ɵ�·��
	 * 
	 * @param file
	 * @throws Exception
	 */
	public void exportExcel(String file) throws Exception {
		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		fileOut.close();
	}

	/**
	 * �����ļ����ɵ��ļ�
	 * 
	 * @param file
	 * @throws Exception
	 */
	public void exportExcel(File file) throws Exception {
		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		fileOut.close();
	}

	/**
	 * �����ļ����ɵ��ļ�
	 * 
	 * @param file
	 * @throws Exception
	 */
	public void exportExcel(OutputStream outputstream) throws Exception {
		BufferedOutputStream buffout = new BufferedOutputStream(outputstream);
		wb.write(buffout);
		buffout.flush();
		buffout.close();
	}

	/**
	 * ֧�ֶ���������
	 * @param filePath
	 * @param response
	 * @param fileName
	 * @param fileType
	 * @return
	 * @throws Exception
	 */
	public static boolean downLoadFile(String filePath,
			HttpServletResponse response, String fileName, String fileType)
			throws Exception {
		File file = new File(filePath); // �����ļ�·�����File�ļ�
		// �����ļ�����(�������þͲ�ֹ����Excel�ļ��ˣ�һ�ٶ��)
		if ("pdf".equals(fileType)) {
			response.setContentType("application/pdf;charset=GBK");
		} else if ("xls".equals(fileType)) {
			response.setContentType("application/msexcel;charset=GBK");
		} else if ("doc".equals(fileType)) {
			response.setContentType("application/msword;charset=GBK");
		}
		// �ļ���
		response.setHeader("Content-Disposition", "attachment;filename=\""
				+ new String(fileName.getBytes(), "ISO8859-1") + "\"");
		response.setContentLength((int) file.length());
		byte[] buffer = new byte[4096];// ������
		BufferedOutputStream output = null;
		BufferedInputStream input = null;
		try {
			output = new BufferedOutputStream(response.getOutputStream());
			input = new BufferedInputStream(new FileInputStream(file));
			int n = -1;
			// ��������ʼ����
			while ((n = input.read(buffer, 0, 4096)) > -1) {
				output.write(buffer, 0, n);
			}
			output.flush(); // ������
			response.flushBuffer();// ������
		} catch (Exception e) {
			// �쳣�Լ���׽
		} finally {
			// �ر�����������
			if (input != null)
				input.close();
			if (output != null)
				output.close();
		}
		return true;
	}

	/**
	 * excel�������
	 * @param path
	 * @param response
	 */
	public void download(String path, HttpServletResponse response) {
		try {
			// path��ָ�����ص��ļ���·����
			File file = new File(path);
			// ȡ���ļ�����
			String filename = file.getName();
			// ��������ʽ�����ļ���
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// ���response
			response.reset();
			// ����response��Header
			response.setHeader("Content-disposition", "attachment; filename="
					+ new String(filename.getBytes("GB2312"),"ISO8859-1")); 
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			response.setContentType("application/msexcel;charset=utf-8");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}

