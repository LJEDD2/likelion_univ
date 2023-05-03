package be_week02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class likelion0201 {
    public static void main(String[] args) throws Exception {

        System.out.println("문자열을 입력하세요 :");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        //  System.in = 콘솔에서 데이터를 입력받을 때 사용
        // InputStreamReader = nputstream 객체에 read함수를 실행하면 1byte밖에 읽지 못해 2byte인 한글 읽을 수 없음 개선
        String arr[] = bf.readLine().split("");; //String으로 받기

        System.out.printf("%s%s",arr[1],arr[0]); // 배열 요소 바꿔서서 출력

    }
}
