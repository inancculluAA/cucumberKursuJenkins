package ApachePOI;

import io.cucumber.java.sl.Ce;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // var olan bir excel yazma işlemi

        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path); // okuma modunda açıyor
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        // Hafızada oluşturma ve yazma işlemleri yapılıyor
        Row yeniSatir = sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre = yeniSatir.createCell(0); // yeni satırda ilk hücre oluşturuldu
        yeniHucre.setCellValue("ali"); // bilgi yazıldı

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }

        // sıra kaydetmeye geldi, bütün bilgiler hafızada bekliyor,her şey WORDKBOOK da

        inputStream.close(); // okuma modunu kapattım , çünkü yazma modunda açmam gerekiyor

        // Yazma işlemini yazma modunda açıp öyle yapacağız.

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close(); // hafıza boşalmış oldu
        outputStream.close();
        System.out.println("İşlem Tamamlandı");


    }
}
