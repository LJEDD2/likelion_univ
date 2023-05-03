package be_week02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class likelion0202 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int sum = 0 ;

        System.out.println("숫자를 입력하세요.");
        System.out.println("몇 개의 숫자를 입력 ?");

        String arr[] = bf.readLine().split(" ");; //String으로 받기

        for (int i = 0; i < n; i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.printf("평균 : %.1f",sum/(double)n);
    }

}
