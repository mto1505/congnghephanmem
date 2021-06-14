/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.applicationmvc.viewAdmin;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dhmty
 */
public class ControllerAdmin {
   
    public static int ktUser(String user){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       if (cn==null) return -1;
       String sql="select TenTaiKhoan from TaiKhoan where TenTaiKhoan=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, user);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     public static int ktPassTK(String user,String password){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select MatKhau from TaiKhoan where TenTaiKhoan=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, user);
           ResultSet rs=ps.executeQuery();
           while (rs.next() && BCrypt.checkpw(password, rs.getString(1).trim())){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     //lấy tên Nhân Viên + MÃ Quyền-start------------------
     public static String layUser(String user){
       String s="";
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select tk.idQuyen,tk.idNhanVien,nv.Ten\n" +
                  "from TaiKhoan tk,NhanVien nv\n" +
                  "where TenTaiKhoan=? and nv.id=tk.idNhanVien";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, user);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               s+=rs.getString(1)+"/"+rs.getString(2)+"/"+rs.getString(3);
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return s;
    }
          //lấy tên Nhân Viên + MÃ Quyền-end--------------------------------

    public static int ktKTrang(String s){
        int kt=s.length();
        s=s.replaceAll("\\s+","");
        kt= (kt>s.length()) ? 1:0;  
        return kt;
    }
    // Start ------------------------Kiểm Tra Nhân Viên----------------------------------
     public static int ktID_NV(int id){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select id from NhanVien where id=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     public static int ktIDNV_TK(int id){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select idNhanVien from TaiKhoan where idNhanVien=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     public static int ktIDNV_DBD(int id){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select idNhanVienLapDon from DonBaoDuong where idNhanVienLapDon=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     public static int ktIDNV_CTDBD(int id){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select idNhanVienPhuTrach from ChiTietDonBaoDuong where idNhanVienPhuTrach=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
// End -----------------------------Kiểm Tra Nhân Viên----------------------------------
// start -----------------------------Kiểm Tra CMND/SDT----------------------------------
     public static int ktCMND_NV(String cmnd){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select CMND from NhanVien where CMND=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, cmnd);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
     public static int ktSDT_NV(String sdt){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select SDT from NhanVien where SDT=?";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, sdt);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=1;
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
// end -----------------------------Kiểm Tra CMND/SDT----------------------------------

    public static int Compare_Date(int d1,int m1, int y1, int d2, int m2, int y2){
        int kt=-1;
        if (d1==d2 && m1==m2 && y1==y2){
            kt =0;
        }
        else{
            if (y1>y2) kt=1;
            else if (y1==y2 && m1>m2) kt=1;
            else if (y1==y2 && m1==m2 && d1>d2) kt=1;
        }
        return kt; // trả về -1 nếu be hơn ,0 neu bằng, 1 nếu nó lớn hơn
    }
    public static boolean Check_Date(int d, int m, int y){
        boolean kt1=true,kt2=false;
        Calendar c= Calendar.getInstance();
        int ng=c.get(Calendar.DAY_OF_MONTH);
        int th=c.get(Calendar.MONTH) + 1 ;
        int nam=c.get(Calendar.YEAR);
        // so sanh voi ngay hien tai
        if (y>nam) kt1=false;
        else if (y==nam && m>th) kt1=false;
        else if (m==th && d>ng) kt1=false;
        
        if ( m == 4 || m == 6 || m == 9 || m == 11)
        {
            if (d<=30) kt2=true;
        }
        else if (m==2)
        {
            if (y%400==0 || (y%100!=0 && y%4==0))
            {
                if (d<=29) kt2=true;
            }
            else {
                if (d<=28) kt2=true;
            }
        }
        else 
        {
            if (d<=31) kt2=true;
        }
        return (kt1 && kt2) ;
    }
    public static String ChuanHoa(String s){
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        s=s.toLowerCase();
        
        String st[]=s.split(" ");
        s="";
        for (int i=0;i<st.length;i++){
            s+=String.valueOf(st[i].charAt(0)).toUpperCase() +st[i].substring(1);
            if (i<st.length-1) s+=" ";
        }
        return s;
    }
    // biểu đồ
    public static long DT_Month(int m){
       long kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select sum(dbd.TongTien)\n" + "from DonBaoDuong as dbd\n" + "where Month(NgayHoanThanh)="+m+" and NgayBatDau<=NgayHoanThanh";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               kt=rs.getLong(1);
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
    public static int DBD_Month(int m){
       int kt=0;
       Connection cn=ModelAdmin.connectMSSQL();
       String sql="select count(dbd.id)\n" + "from DonBaoDuong as dbd\n" + "where Month(NgayHoanThanh)="+m+" and NgayBatDau<=NgayHoanThanh";
       try{
           PreparedStatement ps=cn.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           if (rs.next()){
               kt=rs.getInt(1);
           }
           rs.close();
           ps.close();
           cn.close();
       }
       catch (SQLException ex){
           ex.printStackTrace();
       }
        return kt;
    }
    //VẼ BIỂU ĐỒ
     public static void P1(javax.swing.JPanel jpn){
       //hàm tính toán dataset
       long DT_all=0;
       long DT_I=0;
       long DT_II=0;
       long DT_III=0;
       long DT_IV=0;
       for (int i=1;i<=12;i++){
           DT_all+=ControllerAdmin.DT_Month(i);
       }
       for (int i=1;i<=3;i++){
           DT_I+=ControllerAdmin.DT_Month(i);
       }
       for (int i=4;i<=6;i++){
           DT_II+=ControllerAdmin.DT_Month(i);
       }
        for (int i=7;i<=9;i++){
           DT_III+=ControllerAdmin.DT_Month(i);
       }
       for (int i=9;i<=12;i++){
           DT_IV+=ControllerAdmin.DT_Month(i);
       }
       double c1=  (double)DT_I/ (double)DT_all;
       double c2=  (double)DT_II/ (double)DT_all;
       double c3=  (double)DT_III/ (double)DT_all;
       double c4=  (double)DT_IV/ (double)DT_all;
        System.out.println(ControllerAdmin.DT_Month(4));
        //tính toán dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Quý I - "+DT_I+" VND", Math.round(c1*100.0)/100.0);
        dataset.setValue("Quý II - "+DT_II+" VND", Math.round(c2*100.0)/100.0);
        dataset.setValue("Quý III - "+DT_III+" VND", Math.round(c3*100.0)/100.0);
        dataset.setValue("Quý IV - "+DT_IV+" VND", Math.round(c4*100.0)/100.0);
        //tạo biểu đồ
        JFreeChart pieChart = ChartFactory.createPieChart3D(
                "CƠ CẤU DOANH THU THEO CÁC QUÝ QUA CÁC NĂM" , dataset, true, true, false);
        
         final PiePlot3D plot = ( PiePlot3D ) pieChart.getPlot( );             
         plot.setStartAngle( 270 );             
         plot.setForegroundAlpha( 0.60f );             
         plot.setInteriorGap(0.05);  
        //xuất ra panel
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(jpn.getWidth(), 600));
        
        jpn.removeAll();
        jpn.setLayout(new CardLayout());
        jpn.add(chartPanel);
        jpn.validate();
        jpn.repaint();
   } 
   public static void P2(javax.swing.JPanel jpn){
        //tính toán dataset
        String a="Doanh Thu";
        String a1="Số Đơn Bảo Dưỡng";
        String b="Tháng ";
        int i=1;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 
        while (i<=12){
         dataset.addValue((double)ControllerAdmin.DT_Month(i)/1000000,a,b+i);              
         i++;
        }
        i=1;
        while (i<=12){
         dataset.addValue(ControllerAdmin.DBD_Month(i),a1,b+i);              
         i++;
        }
        //tạo biểu đồ
        JFreeChart barChart = ChartFactory.createBarChart(
         "BIỂU ĐỒ DOANH THU VÀ SỐ ĐƠN BẢO DƯỠNG QUA CÁC THÁNG",             
         "PHÂN LOẠI",             
         "DOANH THU (DVT:triệu VND),SỐ ĐƠN BẢO DƯỠNG",             
         dataset,            
         PlotOrientation.VERTICAL,             
         true, true, false);     
    
        //xuất ra panel
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpn.getWidth(), 600));
        
        jpn.removeAll();
        jpn.setLayout(new CardLayout());
        jpn.add(chartPanel);
        jpn.validate();
        jpn.repaint();
   } 

   public static void P3(javax.swing.JPanel jpn){
        //tính toán dataset
        String a="Số lượng đơn bảo dưỡng";
        String b="Tháng ";
        int i=1;
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        while (i<=12){
         line_chart_dataset.addValue(ControllerAdmin.DBD_Month(i),a,b+i);              
         i++;
        }
        //tạo biểu đồ
        JFreeChart lineChartObject = ChartFactory.createLineChart(
         "SỐ ĐƠN BẢO DƯỠNG QUA CÁC THÁNG",             
         "THÁNG",             
         "SỐ ĐƠN BẢO DƯỠNG",             
         line_chart_dataset,            
         PlotOrientation.VERTICAL,             
         true, true, false);     
    
        //xuất ra panel
        ChartPanel chartPanel = new ChartPanel(lineChartObject);
        chartPanel.setPreferredSize(new Dimension(jpn.getWidth(), 600));
        
        jpn.removeAll();
        jpn.setLayout(new CardLayout());
        jpn.add(chartPanel);
        jpn.validate();
        jpn.repaint();
   } 
    //set icon
    public static ImageIcon setIcon(int width,int height,String url){
        ImageIcon imageIcon = new ImageIcon(url); 
        Image image = imageIcon.getImage(); 
        Image newimg = image.getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH); 
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }
    public static BufferedImage readFileBufferedImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException ex) {
            
        }
        return null;
    }
}
