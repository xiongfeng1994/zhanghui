package com.gto.zhanghui.utils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;

import com.gto.zhanghui.request.NoticeMessage;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;

public class FileUtil {

	public static void exportExcel(List<?> list, String title, String sheetName, Class<?> pojoClass,String fileName, HttpServletResponse response) { 
		defaultExport(list, pojoClass, fileName, response, new ExportParams(title, sheetName)); 
	}
	
	private static void defaultExport(List<?> list, Class<?> pojoClass, String fileName, HttpServletResponse response, ExportParams exportParams) { 
		Workbook workbook = ExcelExportUtil.exportExcel(exportParams,pojoClass,list); 
		if (workbook != null); 
		downLoadExcel(fileName, response, workbook); 
	}
	
	private static void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook) { 
		try { 
			response.setCharacterEncoding("UTF-8"); 
			response.setHeader("content-Type", "application/vnd.ms-excel"); 
			response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8")); 
			workbook.write(response.getOutputStream()); 
			
		} catch (IOException e) { 
			e.getStackTrace(); 
		} 
	}
	
	public static Map<String, String> getExtras(NoticeMessage extrasparam) {
		Map<String, String> map = new HashMap<>();
		map.put("msgId", extrasparam.getMsgId());
		map.put("msgPublishTime", extrasparam.getMsgPublishTime());
		map.put("msgType", extrasparam.getMsgType());
		map.put("msgInfoType", extrasparam.getMsgInfoType());
		map.put("msgInfoTitle", extrasparam.getMsgInfoTitle());
		map.put("msgInfoDetails", extrasparam.getMsgInfoDetails());
		map.put("msgInfoPublishMan", extrasparam.getMsgInfoPublishMan());
		map.put("msgInfoPublishTime", extrasparam.getMsgInfoPublishTime());
		return map;
	}
}
