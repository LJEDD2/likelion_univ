package be_week02;
import java.util.Random;
import java.util.Arrays;
//버블소팅
public class likelion_0204 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt(10);
        }
        System.out.print("정렬 전: ");
        System.out.println(Arrays.toString(arr));

        //bubble sorting
        System.out.println("--------------------");
        for (int i = 0; i < arr.length; i++) { // n까지
            for (int j = 0; j < arr.length-1; j++) { // n-1까지
                //Swap()
                if (arr[j]> arr[j+1]) { // 현재 수가 다음 수보다 크면 SWAP -> 오름차순 정렬
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//            System.out.println(Arrays.toString(arr)); 확인용 코드
        }

        System.out.print("정렬 후: ");
        System.out.println(Arrays.toString(arr));
    }
}
