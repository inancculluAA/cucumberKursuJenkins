package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {
    //  kendisine verilen path deki excelin, istenilen, sheetindeki
    // istenilen kolona kadar sütunları okuyup Arraylist formatında geri döndüren fonksiyonu yazınız.
    //  getListData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx","testCitizen", 2); 0-2

    public static ArrayList<ArrayList<String>> getListData(String path, String sheetName, int columnCount) {

        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            ArrayList<String> rowList = new ArrayList<>();
            Row row = sheet.getRow(i);

            for (int j = 0; j < columnCount; j++) {
                rowList.add(row.getCell(j).toString());
            }
            tablo.add(rowList);
        }
        return tablo;
    }

    // ExcelUtility.exceleYaz(scenario, strDate, Driver.threadBrowserName.get());
    public static void writeExcel(String path, Scenario scenario, String time, String browserName) {

        File f = new File(path);

        //  f.exists()  // dosya var sa
        if (!f.exists()) { // dosya yok ise oluştur
            XSSFWorkbook workbook = new XSSFWorkbook(); // hazfızada workbook oluştur.
            XSSFSheet sheet = workbook.createSheet("Sayfa1"); // hazıfazda sheet oluştur.
            Row newRow = sheet.createRow(0); // satır oluştur

            Cell newCell = newRow.createCell(0); // hucre oluştur
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1); // hucre oluştur
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2); // hucre oluştur
            newCell.setCellValue(browserName);

            newCell = newRow.createCell(3); // hucre oluştur
            newCell.setCellValue(time);


            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream); // içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close(); // dosyayı kapattık.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            FileInputStream inputStream = null; // okuma modunda açıldı
            Workbook workbook = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Sheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getPhysicalNumberOfRows(); // 6 satır var 0-5
            Row newRow = sheet.createRow(rowCount); // en son satırın altına açıldı

            Cell newCell = newRow.createCell(0); // hucre oluştur
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1); // hucre oluştur
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2); // hucre oluştur
            newCell.setCellValue(browserName);

            newCell = newRow.createCell(3); // hucre oluştur
            newCell.setCellValue(time);


            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream); // içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close(); // dosyayı kapattık.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> gelenList = getListData("src/main/resources/ApacheExcel2.xlsx", "testCitizen", 2);
        System.out.println(gelenList);

        gelenList = getListData("src/main/resources/ApacheExcel2.xlsx", "testCitizen", 4);
        System.out.println(gelenList);

        gelenList = getListData("src/main/resources/ApacheExcel2.xlsx", "testCitizen", 10);
        System.out.println(gelenList);
    }
}
