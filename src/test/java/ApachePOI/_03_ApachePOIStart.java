package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        // Dosyanın yolu alındı
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";


        // java  Dosya okuma işlemcisine dosyanın yolunu veriyoruz:
        // böylece program ile dosya arasında bağlantı kuruldu
        FileInputStream dosyaOkumaBaglantisi= new FileInputStream(path);

        //Dosya okuma işlemcisi üzeründen Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        // istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");
        // Sheet calisma Sayfasi= calismaKitabi.getSheetAt(0);

        //istenen Satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        //istenen satirdaki istenen hücre aliniyor
        Cell hucre=satir.getCell(0);

        System.out.println("hucre = " + hucre);




    }
}
