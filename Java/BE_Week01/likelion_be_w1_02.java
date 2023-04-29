import java.util.Scanner;
public class likelion_be_w1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("홀수입니다.");
        }
        else{
            System.out.println("짝수입니다.");
        }
    }
}
