package servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.binary.Base64;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import domain.ChuQin;
import util.ExcelUtil;

/**
 *
 * @author yan
 */
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setHeader("Connection", "close");
        response.setHeader("Content-Type", "application/vnd.ms-excel;charset=UTF-8");
        String filename =   "考勤表.xls";
        filename = encodeFileName(request, filename);
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);
        
        OutputStream out = null;
        Map<Integer,ChuQin> list = (Map<Integer, ChuQin>) request.getAttribute("list");
        
        try {
            String[] headers = { "姓名", "用户编号","出差","请假","上班","总计","全勤\\缺勤"};  
            List<ChuQin> dataset = new ArrayList<ChuQin>(); 
            for (ChuQin chuqin : list.values()) {  
            	dataset.add(chuqin);  
            } 
        
            ExcelUtil<ChuQin> eu = new ExcelUtil<ChuQin>();
            HSSFWorkbook workbook = eu.exportExcel("企业考勤",headers,dataset);
            
            out = response.getOutputStream();  
            workbook.write(out);  
        } finally {
            if(out!=null){
                out.close();
            }
        }
    }
    
    public String encodeFileName(HttpServletRequest request, String fileName) throws UnsupportedEncodingException {
        String agent = request.getHeader("USER-AGENT");

        if (null != agent && -1 != agent.indexOf("MSIE")) {
            return URLEncoder.encode(fileName, "UTF-8");
        } else if (null != agent && -1 != agent.indexOf("Mozilla")) {
            return "=?UTF-8?B?"+ (new String(Base64.encodeBase64(fileName.getBytes("UTF-8")))) + "?=";
        } else {
            return fileName;
        }
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("ss");
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}