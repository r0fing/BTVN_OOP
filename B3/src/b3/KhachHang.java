/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String diaChi;
    private int khachHangID;
    private String tenKH;

    public KhachHang(String diaChi, int khachHangID, String tenKH) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getKhachHangID() {
        return khachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }
}
