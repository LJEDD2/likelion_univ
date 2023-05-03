package Codeup;
import java.util.Scanner;

public class codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 90 && num <= 100)
            System.out.print("A");
        else if(num >= 70 && num < 90)
            System.out.print("B");
        else if(num >= 40 && num < 70)
            System.out.print("C");
        else
            System.out.print("D");
    }
}
