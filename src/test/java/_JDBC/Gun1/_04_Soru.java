package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtları next ile yazdırınız
    // city tablosundaki tüm kayıtları absolute ile yazdırınız
    // city tablosundaki tüm kayıtları relative ile yazdırınız.

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        int cnt = 0;
        while (rs.next()) {
            String cityName = rs.getString(2);
            System.out.println("cityName = " + cityName);
            cnt++;

        }
        System.out.println("cnt = " + cnt);
    }

    @Test
    public void test2() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        int cnt = 1;
        while (rs.absolute(cnt)) { // istediğimiz noktadan başlatıyor
            String cityName = rs.getString(2);
            System.out.println("cityName = " + cityName);
            cnt++;

        }
        System.out.println("cnt = " + (cnt-1));
    }

    @Test
    public void test3() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city"); // bir bir ilerliyor

        int cnt = 0;
        while (rs.relative(1)) {
            String cityName = rs.getString(2);
            System.out.println("cityName = " + cityName);
            cnt++;

        }
        System.out.println("cnt = " + cnt);
    }

}
