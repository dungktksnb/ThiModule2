public class DanhBa {
    private  String soDienThoai;
    private String nhom;
    private  String ten;
    private String gioiTinh;
    private String diaChi;
    private  String ngaySinh;

    public DanhBa(String information, String s, String information1, String s1, String information2, String s2, String information3) {
    }

    public DanhBa(String soDienThoai, String nhom, String ten, String gioiTinh, String diaChi, String ngaySinh) {
        this.soDienThoai = soDienThoai;
        this.nhom = nhom;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "soDienThoai='" + soDienThoai + '\'' +
                ", nhom='" + nhom + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
