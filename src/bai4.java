import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("chia hết cho cả 3 và 5");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("chia hết cho 3 và không chia hết cho 5");
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.println("không chia hết cho 3 và chia hết cho 5");
        }else {
            System.out.printf("không chia hết cho cả 2 số");
        }
    }
}