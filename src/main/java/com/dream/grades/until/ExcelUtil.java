//package com.dream.grades.until;
//
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.CellRangeAddress;
//
//public class ExcelUtil {
//
//	/**
//	 * 导出Excel
//	 * 
//	 * @param sheetName
//	 *            sheet名称
//	 * @param title
//	 *            标题
//	 * @param values
//	 *            内容
//	 * @param wb
//	 *            HSSFWorkbook对象
//	 * @return
//	 */
//	public static HSSFWorkbook getHSSFWorkbook(String sheetName, String[] title, List<Map<String, Object>> values, HSSFWorkbook wb,
//			String mergeCell, Integer cellNum) {
//
//		// 第一步，创建一个HSSFWorkbook，对应一个Excel文件
//		if (wb == null) {
//			wb = new HSSFWorkbook();
//		}
//
//		// 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
//		HSSFSheet sheet = wb.createSheet(sheetName);
//
//		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
//		HSSFRow row = sheet.createRow(0);
//
//		// 第四步，创建单元格，并设置值表头 设置表头居中
//		HSSFCellStyle style = wb.createCellStyle();
//		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
//
//		// 声明列对象
//		HSSFCell cell = null;
//		if (StringUtils.isNotEmpty(mergeCell)) {
//			// 合并单元格
//			CellRangeAddress callRangeAddress = new CellRangeAddress(0, 0, 0, cellNum);// 起始行,结束行,起始列,结束列
//			sheet.addMergedRegion(callRangeAddress);
//			cell = row.createCell(0);
//			cell.setCellValue(mergeCell);
//			cell.setCellStyle(style);
//			row = sheet.createRow(1);
//			// HSSFCell cell = null;
//			// 创建标题title   实际上是列说明
//			for (int i = 0; i < title.length; i++) {
//				cell = row.createCell(i);
//				cell.setCellValue(title[i]);
//				cell.setCellStyle(style);
//			}
//
//			// 创建内容
//			for (int i = 0; i < values.size(); i++) {
//				row = sheet.createRow(i + 2);
//				for (int j = 0; j < values.size(); j++) {
//					// 将内容按顺序赋给对应的列对象
//					row.createCell(j).setCellValue(values.get(j).toString());
//				}
//			}
//		} else {
//
//			// HSSFCell cell = null;
//			// 创建标题
//			for (int i = 0; i < title.length; i++) {
//				cell = row.createCell(i);
//				cell.setCellValue(title[i]);
//				cell.setCellStyle(style);
//			}
//
//			// 创建内容
//			for (int i = 0; i < values.size(); i++) {
//				row = sheet.createRow(i + 1);
//				for (int j = 0; j < values.size(); j++) {
//					// 将内容按顺序赋给对应的列对象
//					row.createCell(j).setCellValue(values.get(j).toString());
//				}
//			}
//
//		}
//		return wb;
//	}
//}