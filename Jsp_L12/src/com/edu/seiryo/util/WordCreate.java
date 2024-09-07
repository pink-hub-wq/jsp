package com.edu.seiryo.util;

import java.io.*;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class WordCreate {
    public void createWord(List<String> headers, List<List<String>> data, String filePath) throws IOException {
        XWPFDocument document = new XWPFDocument();
        XWPFTable table = document.createTable();
        addHeader(table, headers);
        addData(table, data);
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            document.write(fos);
        }
    }
    public void addHeader(XWPFTable table, List<String> headers) {
        XWPFTableRow headerRow = table.getRow(0);
        for (int i = 0; i < headers.size(); i++) {
            if (i == 0) {
                headerRow.getCell(0).setText(headers.get(i));
            } else {
                headerRow.addNewTableCell().setText(headers.get(i));
            }
        }
    }
    public void addData(XWPFTable table, List<List<String>> data) {
        for (List<String> rowData : data) {
            XWPFTableRow row = table.createRow();
            for (int i = 0; i < rowData.size(); i++) {
                row.getCell(i).setText(rowData.get(i));
            }
        }
    }
    public void downloadWord(String path, HttpServletResponse response) {
        try {
            File file = new File(path);
            String filename = file.getName();

            try (InputStream fis = new BufferedInputStream(new FileInputStream(path));
                 OutputStream toClient = new BufferedOutputStream(response.getOutputStream())) {

                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);

                response.reset();
                response.setHeader("Content-disposition", "attachment; filename=" + new String(filename.getBytes("GB2312"), "ISO8859-1"));
                response.addHeader("Content-Length", "" + file.length());
                response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document;charset=utf-8");

                toClient.write(buffer);
                toClient.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
