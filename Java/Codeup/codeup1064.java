package Codeup;
import java.util.Scanner;

public class codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 그림의 식 참고
        System.out.print((num1<num2?num1:num2)>num3? num3:(num1<num2? num1:num2));
    }
}
