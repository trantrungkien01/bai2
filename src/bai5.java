import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh a: ");
        double number1 = sc.nextDouble();
        System.out.println("nhập cạnh b: ");
        double number2 = sc.nextDouble();
        System.out.println("nhập cạnh c: ");
        double number3 = sc.nextDouble();
        //double sum = (number1+number2+number3);
       // System.out.printf("tổng của 3 cạnh abc: "+sum);
        if (number1==number2 && number2==number3 && number1== number3){
        System.out.println("là tam giác đều");
        }else if (number1==number2 || number2==number3 || number1==number3){
            System.out.println("là tam giác cân");
        }else if (Math.pow(number1,2)+ Math.pow(number2,2)==Math.pow(number3,2)
                || Math.pow(number2,2)+Math.pow(number3,2)== Math.pow(number1,2)
                || Math.pow(number1,2)+Math.pow(number3,2)==Math.pow(number2,2)){
            System.out.println("là tam giác vuông");
        }else if (number1==number2 || number2==number3 || number1==number3 && Math.pow(number1,2)+ Math.pow(number2,2)==Math.pow(number3,2)
                || Math.pow(number2,2)+Math.pow(number3,2)== Math.pow(number1,2)
                || Math.pow(number1,2)+Math.pow(number3,2)==Math.pow(number2,2)){
            System.out.printf("là tam giác vuông cân");
        }else {
            System.out.printf("là tam giác thường");
        }
    }
}