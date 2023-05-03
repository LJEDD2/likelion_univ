package Codeup;

import java.util.Scanner;

public class codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<=N;i++) {
            if(i%3==0) continue;
            else System.out.printf("%d ",i);
        }
    }
}
