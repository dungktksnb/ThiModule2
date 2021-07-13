import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String PATH = "data\\contacts.csv";
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        QLDanhBa qlDanhBa=new QLDanhBa();
        while (true){
            System.out.println("-----Chương trình quản lý danh bạ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    qlDanhBa.Show();
                    break;
                case 2:
                    qlDanhBa.add();
                    break;
//                case 3:
//                    break;
////                case 4:
//                    System.out.println("bạn có muốn xóa không");
//                    System.out.println("1 có");
//                    System.out.println("2 không");
//                    int choice1=Integer.parseInt(scanner.nextLine());
//                    switch (choice1){
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                    }4
////                    break;
//                case 5:
//
//                    break;
//                case 6:System.out.println("Bạn có muốn cập nhật lại danh bạ trong bộ nhớ?");
//                    System.out.println("(Thao tác này sẽ xóa toàn bộ danh bạ trong bộ nhớ)");
//                    System.out.print("Nhập Y để đồng ý: ");
//                    String answer = scanner.nextLine();
//                    if (answer.equals("Y")) {
//                        List<DanhBa> phoneBookList = IOFile.readFromFile(PATH);
//
//                    }
//                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("nhập sai");
                    break;
            }
        }
    }

}
