import java.util.Scanner;

public class likelion_be_w1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하다. : ");
        int maxv = 0;
        int pN;
        for (int i = 0; i < 5; i++){
            pN = scanner.nextInt();
            if (maxv < pN) maxv = pN;
        }
        System.out.println(maxv);

    }
}
