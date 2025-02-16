package giangvienrepository;

public class GiangVien {
    private String ma;
    private String ten;
    private String loai;
    private int tuoi;
    private int bac;
    private int gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String loai, int tuoi, int bac, int gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", bac=" + bac + ", gioiTinh=" + gioiTinh + '}';
    }
    
}