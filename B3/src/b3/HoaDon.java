/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> dsachMatHangMua = new ArrayList<>();

    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
    }

    public void ThemHoaDon(MatHangMua matHangMua) {
        dsachMatHangMua.add(matHangMua);
        tongTien += matHangMua.getMatHang().getGia() * matHangMua.getSoLuong();
    }

    public void InHoaDon() {
        System.out.println("Hoa don: " + hoaDonID);
        System.out.println("Khach hang: " + kh.getTenKH());
        System.out.println("Ngay ban: " + ngayBan);
        System.out.println("Danh sach mat hang:");
        for (MatHangMua a : dsachMatHangMua) {
            System.out.println("Mat hang: " + a.getMatHang().getTenMatHang() + ", So luong: " + a.getSoLuong() + ", Gia: " + a.getMatHang().getGia());
        }
        System.out.println("Tong tien: " + tongTien);
    }
}
