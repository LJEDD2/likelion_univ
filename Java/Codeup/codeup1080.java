package Codeup;

import java.util.Scanner;

public class codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        for(int i=1;i<100;i++) {
            sum+=i;
            if(a<=sum) {
                System.out.println(i);
                break;
            }
        }
    }
}
