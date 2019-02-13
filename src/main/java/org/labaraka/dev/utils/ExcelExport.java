package org.labaraka.dev.utils;

	public static Workbook ExcelExport(final List<RequestDisplayBean> requests)
			   throws XLSManagerException {
			  final Workbook wb = new XSSFWorkbook();
			  final Sheet sheet = wb.createSheet();
			  try {
			   XLSManager.initHeaderLineAndMethods(sheet);
			   int index = 1;
			   for (final RequestDisplayBean request : requests) {
			    XLSManager.populateRequestRow(sheet, request, index);
			    index++;
			   }
			   for (int i = 0; i < 10; i++) {
			    sheet.setColumnWidth(i, 10000);
			    // sheet.autoSizeColumn(i);
			   }
			  } catch (final Exception e) {
			   throw new XLSManagerException(e);
			  }
			  return wb;
			 }

