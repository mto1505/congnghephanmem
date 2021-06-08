/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minh
 */
public class NewClass {

    public static void testDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date d0 = sdf.parse("2010-01-01");
            System.out.println(d0.toString());
        } catch (ParseException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        String q = "with temporaryTable(id, NgayCapNhat) as "
                + "(SELECT id,  max(NgayCapNhat)"
                + " from DichVuBaoDuong"
                + " group by id)"
                + " select DichVuBaoDuong.* from DichVuBaoDuong ,temporaryTable"
                + " where DichVuBaoDuong.id = temporaryTable.id and DichVuBaoDuong.NgayCapNhat = temporaryTable.NgayCapNhat";
        //System.out.println(q);
        
        testDate();
    }
}
