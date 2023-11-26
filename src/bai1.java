import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number= sc.nextInt();
        if (number%2 == 0){
            System.out.printf("số chẵn", number);
        }else {
            System.out.printf("số lẻ", number);
        }
    }
}
