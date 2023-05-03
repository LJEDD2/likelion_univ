package Codeup;
import java.util.Scanner;

public class codeup1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);

        switch(num)
        {
            case 'A':
                System.out.print("best!!!");
                break;
            case 'B':
                System.out.print("good!!");
                break;
            case 'C':
                System.out.print("run!");
                break;
            case 'D':
                System.out.print("slowly~");
                break;
            default :
                System.out.print("what?");
        }
    }
}
