import java.util.Scanner;

public class likelion_be_w1_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하다 : ");
        int n = scanner.nextInt();

//        if (n >= 90 ) {
//            System.out.println("너는 A인 .");
//        }
//        else if (n >= 80){
//            System.out.println("너는 B인 .");
//        }
//        else if (n >= 70){
//            System.out.println("너는 C인 .");
//        }
//        else if (n >= 60){
//            System.out.println("너는 D인 .");
//        }
//        else {
//            System.out.println("너는 F를 받다, 따라서 재수강을 해야하는.");
//        }
        int grade = n/10;
        switch (grade) {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
