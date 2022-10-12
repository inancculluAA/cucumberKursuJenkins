package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_Soru {
    /*

    _05_ yaptığımız soruda  kullanıcadan bu sefer sütun numarası isteyiniz
    ve o sütundaki bütün bilgleri yazdırınız

     */


    public static void main(String[] args) {

        System.out.print("istenen sütun=");
        Scanner oku = new Scanner(System.in);
        int sütun = oku.nextInt();

        String donenSonuc = bul(sütun);
        System.out.println("donenSonuc = " + donenSonuc);

    }

    public static String bul(int sütun) {

        String donecek = "";
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Workbook workbook = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheetAt(0); // "Login"

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getPhysicalNumberOfCells() > sütun)
                donecek += sheet.getRow(i).getCell(sütun) + "\n";

        }


        return donecek;
    }
}
