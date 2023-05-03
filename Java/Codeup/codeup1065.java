package Codeup;
import java.util.Scanner;

public class codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        for(int i = 0; i < 3; i++) {
            n = sc.nextInt();

            if(n % 2 == 0)
                System.out.println(n);
        }
    }
}
