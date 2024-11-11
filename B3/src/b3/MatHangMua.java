/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author ADMIN
 */
public class MatHangMua {
    private HoaDon hd;
    private MatHang mh;
    private int soLuong;

    public MatHangMua(HoaDon hd, MatHang mh, int soLuong) {
        this.hd = hd;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public MatHang getMatHang() {
        return mh;
    }

    public void ThemMatHangMuaCuaHoaDon() {
        hd.ThemHoaDon(this);
    }
    
    public float tinhTongTien(){
        return soLuong * mh.getGia();
    }
    
    public void setSoLuong(int soLuong){
        if(soLuong > mh.getSoLuong()){
            System.out.println("So luong vuot qua kho!");
        }  
        else {
            this.soLuong = soLuong;
            mh.setSoLuong(mh.getSoLuong() - soLuong);
        }
    }
    
    public MatHang getMH(){
        return mh;
    }

}
