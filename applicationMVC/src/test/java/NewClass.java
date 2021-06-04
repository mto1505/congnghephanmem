/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minh
 */
public class NewClass {
    public static void main(String[] args) {
        String q = "with temporaryTable(id, NgayCapNhat) as "
                + "(SELECT id,  max(NgayCapNhat)"
                + " from DichVuBaoDuong"
                + " group by id)"
                + " select DichVuBaoDuong.* from DichVuBaoDuong ,temporaryTable"
                + " where DichVuBaoDuong.id = temporaryTable.id and DichVuBaoDuong.NgayCapNhat = temporaryTable.NgayCapNhat";
        System.out.println(q);
    }
}
