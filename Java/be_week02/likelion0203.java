package be_week02;
import java.util.Scanner;

public class likelion0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

        System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i=0; i<num.length; i++) {
            System.out.print("숫자를 입력하세요 = ");
            num[i] = sc.nextInt();
        }

        // 최댓값 구하기
        int max = num[0];
        int min = num[0];
        for(int i=1; i<num.length; i++) {
            max = Math.max(max,num[i]);
            min = Math.min(min,num[i]) ;
        }
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);

    }
}
