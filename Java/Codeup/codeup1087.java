package Codeup;
import java.util.Scanner;

public class codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=N;i++) {
            sum += i;
            if(sum>=N){
                break;
            }
        }
        System.out.println(sum);
    }
}
