/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;

/**
 *
 * @author ADMIN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatHang X = new MatHang(1, "X", 70f, 10);
        MatHang Y = new MatHang(2, "Y", 50f, 5);
        MatHang Z = new MatHang(3, "Z", 35f, 3);
        KhachHang kh1 = new KhachHang("Hanoi", 1, "Nguyen Van A");
        HoaDon hd1 = new HoaDon(1, kh1, "10/11/2024");
        MatHangMua x = new MatHangMua(hd1, X, 1);
        MatHangMua y = new MatHangMua(hd1, Y, 2);
        x.ThemMatHangMuaCuaHoaDon();
        y.ThemMatHangMuaCuaHoaDon();
        hd1.InHoaDon();
    }
    
}
