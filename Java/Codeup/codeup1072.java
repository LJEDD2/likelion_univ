package Codeup;

import java.util.Scanner;

public class codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] A = new int[T];

        for(int i=0;i<T;i++)
            A[i] = sc.nextInt();
        for(int i=0;i<T;i++)
            System.out.println(A[i]);
    }
}
