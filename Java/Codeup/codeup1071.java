package Codeup;

import java.util.Scanner;

public class codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eng = sc.next().charAt(0);

        char a = 'a';

        while(a<=eng) {
            System.out.print(a +" ");
            a+=1;
        }
    }
}
