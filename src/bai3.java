import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp số a: ");
        int le = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số b: ");
        int chan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phép tính toán học: ");
        String luachon = sc.nextLine();
        switch (luachon){
            case "cong":
             int tong = (le+chan);
                System.out.println("Tổng hai số: "+tong);
             break;
            case "tru":
                int hieu = (le-chan);
                System.out.println("Hiệu hai số: "+hieu);
                break;
            case "nhan":
                int tich = (le*chan);
                System.out.println("Tích hai số: "+tich);
                break;
            case "chia":
                int thuong = (le/chan);
                System.out.println("Thương hai số: "+thuong);
                break;
            default:
                System.out.println("Nhập dữ liệu sai xin vui lòng nhập lại nhé :))");
        }
    }
}
