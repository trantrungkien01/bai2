import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm html:");
        float html = sc.nextFloat();
        System.out.println("nhập điểm css: ");
        float css = sc.nextFloat();
        System.out.println("nhập điểm javascrip: ");
        float javascrip = sc.nextFloat();
//        double html = sc.nextDouble();
//        double css = sc.nextDouble();
//        double javascrip = sc.nextDouble();
        float avgMark = (html + css + javascrip) / 3;
        System.out.println("diemtb: " + avgMark);
        if (avgMark >= 0 && avgMark < 5) {
            System.out.println("yếu");
        } else if (5 <= avgMark && avgMark < 7) {
            System.out.println("trung bình");
        } else if (7 <= avgMark && avgMark < 8) {
            System.out.println("khá");
        } else if (8 <= avgMark && avgMark < 9) {
            System.out.println("giỏi");
        }else {
            System.out.println("xuất sắc");
        }
    }
}