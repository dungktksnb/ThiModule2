import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLDanhBa {
    Scanner scanner = new Scanner(System.in);
    ArrayList<DanhBa> list = new ArrayList<>();

    public DanhBa create() {
        String soDienThoai = getSoDienThoai();
        String nhom = getNhom();
        String ten = getTen();
        String gioiTinh = getGioiTinh();
        String diaChi = getDiaChi();
        String ngaySinh = getNgaySinh();
        return new DanhBa(soDienThoai,nhom,ten,gioiTinh,diaChi,ngaySinh);


    }
    public void add(){
        DanhBa danhBa=create();
        list.add(danhBa);
    }

    private String getNgaySinh() {
        while (true) {
            try {
                System.out.println("nhập ngày sinh ");
                String ngaySinh = scanner.nextLine();
                if (Regex.vaLiDateNgaySinh(ngaySinh)) {
                    return ngaySinh;

                }else throw new Exception();
            }catch (Exception e){
                System.out.println("nhập đúng định dạng nam/thang/ngay");
            }
        }
    }

    private String getDiaChi() {
        System.out.println("nhập địa chỉ");
        String diaChi = scanner.nextLine();
        return diaChi;
    }


    private String getGioiTinh() {
        System.out.println("nhập giới tính");
        String gioitinh = scanner.nextLine();
        return gioitinh;
    }

    private String getTen() {
        while (true) {
            try {
                System.out.println("nhập tên :");
                String ten = scanner.nextLine();
                if (Regex.validateName(ten)) {
                    return ten;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("tên phải đúng định dạng");
            }
        }
    }

    private String getNhom() {
        System.out.println("nhập nhóm :");
        String nhom = scanner.nextLine();
        return nhom;
    }

    private String getSoDienThoai() {
        while (true) {
            try {
                System.out.println("nhập số điện thoại");
                String sdt = scanner.nextLine();
                if (Regex.validatePhone(sdt)) {
                    boolean check = true;
                    for (DanhBa e : list) {
                        if (e.getSoDienThoai().equals(sdt)) {
                            check = false;
                            break;
                        }

                    }
                    if (check) {
                        return sdt;
                    } else {
                        System.out.println("số điện thoại tồn tại");
                    }
                } else throw new Exception();

            } catch (Exception e) {
                System.out.println("nhập sai định dạng");
            }
        }
    }
    public void Show(){
        for (DanhBa e:list) {
            System.out.println(e);

        }
    }
    public  void Sua(){
        System.out.println("nhập tên cần sửa");
        String name=scanner.nextLine();

    }


}
