package diary;
import java.util.Scanner;

public class main {
    // 전역변수 ?
    static Scanner sc;
    static String[][] scheduleStore;
    static int arr_size = 20;
    static String nullMessage;
    static String[] dayofweek = {"월","화","수","목","금","토","일"};

    private static void intro(){
        System.out.println();
        System.out.println("+----------------------+");
        System.out.println("   나의 일정을 관리하다.");
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록 ");
        System.out.println("| 2. 일정 조회");
        System.out.println("| 3. 일정 수정");
        System.out.println("| 4. 일정 삭제");
        System.out.println("| 5. 달력 출력  6. 종료");
        System.out.println("+----------------------+");
        System.out.println();
    }
    private static int inputNumber() {
        int option = sc.nextInt();
        return option;
    }

    // 초기 배열 세팅
    private static void init(){
        sc = new Scanner(System.in);
        scheduleStore = new String[7][arr_size];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr_size; j++) {
                scheduleStore[i][j] = nullMessage;
            }
        }
    }
    private static boolean toMain(){
        System.out.println(">>> 메인으로 이동할까요? (yes = 1 | no = 0)");
        int answer = sc.nextInt();
        if (answer == 1){
            return true;
        }
        else{
            return false;
        }
    }
    private static void startProgram(int option){
        switch (option){
            case 1:
                while(true) {
                    createSchedule();
                    if (toMain()){
                        break;
                    }
                }return;
            case 2:
                while(true) {
                    readSchedule();
                    if (toMain()){
                        break;
                    }
                }return;
            case 3:
                while(true) {
                    updateSchedule();
                    if (toMain()){
                        break;
                    }
                }return;
            case 4:
                while(true) {
                    deleteSchedule();
                    if (toMain()){
                        break;
                    }
                }return;
        }
        System.out.println();

    }
    // 일정 입력
    private static String inputSchedule() {
        System.out.print("일정을 입력하세요 : ");
        sc.nextLine();
        String schedule = sc.nextLine();
        return schedule;
    }
    // 기능 구현
    private static void createSchedule() {
        // 안내문 출력
        printCreateOption();
        // 사용자로부터 선택지 입력
        int option = inputNumber();
        if (option == 9) {
            return;
        }

        String schedule = inputSchedule();

        for (int i = 0; i < arr_size; i++){
            if (scheduleStore[option-1][i] == nullMessage){
                scheduleStore[option-1][i] = schedule;
                System.out.println(dayofweek[option-1]+"요일의 "+(i+1)+"번째 일정이 성공적으로 등록되었습니다");
                break;
            }
        }
    }


    private static void printCreateOption() {
        System.out.println("+-------원하는 요일에 일정을 추가합니다.-------+");
        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
        System.out.println("| Mon | THE | WED | THU | FRI | SAT | SUN |");
        System.out.println("+-----------------------------------------+");
        System.out.println("8. 뒤로가기");
        System.out.println();
        System.out.println(">>>> 일정 추가를 원하는 요일의 번호를 입력하세요  ");
    }

    private static void readSchedule() {
        printReadOption();
        // 사용자로부터 선택지 입력
        int option = inputNumber();
        if (option == 9 ) {
            return;
        }
        else if (option == 0 ){
            System.out.println("+-----------------------------------+");
            System.out.println("         전체 일정을 출력합니다.        ");
            System.out.println("+-----------------------------------+");
            for (int i = 0; i < 7; i++) {
                System.out.println(">>> "+dayofweek[i]+"요일 일정");
                // 만약에 0번째를 삭제하고나면 인덱스를 앞으로 쭉 밀어줘야하는데 그걸 못하면 에러가 나는 코드
                if (scheduleStore[i][0] != nullMessage){
                    for (int j = 0; j < arr_size; j++) {
                        if (scheduleStore[i][j] != nullMessage) {
                            System.out.println(j+1 + ". " + scheduleStore[i][j]);
                        }
                    }
                }
                else{
                    System.out.println("등록된 일정이 존재하지 않습니다.");
                }
                System.out.println("-----------------------------------");
            }
        }
        else{

            System.out.println("-----------------------------------");
            for (int i = 0; i < arr_size; i++) {
                if (scheduleStore[option-1][i] != nullMessage){
                    System.out.println(dayofweek[option-1]+"요일에 대한 일정을 출력합니다.");
                    System.out.println(i+1 + ". " + scheduleStore[option-1][i]);
                }
            }
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }

    private static void printReadOption() {
        System.out.println("+----------원하는 요일의 일정을 조회합니다.----------+");
        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  0  |");
        System.out.println("| Mon | THE | WED | THU | FRI | SAT | SUN | ALL |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("9. 뒤로가기");
        System.out.println();
        System.out.println(">>>> 조회할 요일의 번호를 입력하세요 ");
    }

    private static void updateSchedule() {
        printUpdateOption();
        int option = inputNumber();

        // 작업 취소를 선택한 경우 종료
        if (option == 8) {
            return;
        }
        // 일정을 불러오는

        System.out.print("몇번 일정을 수정하시겠습니까? : ");
        int scheduleNumber = inputNumber();

        // 해당 번호의 일정이 존재하는가
        if (scheduleStore[option - 1][scheduleNumber-1] == nullMessage) {
            System.out.println("해당 번호에 일정이 존재하지 않습니다.");
            return;
        }
        else{
            System.out.println("기존에 등록한 "+scheduleNumber+"번째의 일정입니다.");
            System.out.println("변경 전 : "+scheduleStore[option - 1][scheduleNumber-1]+"\n");

            String new_schedule = inputSchedule();
            scheduleStore[option - 1][scheduleNumber-1] = new_schedule;
            System.out.println("새로운 일정이 등록되었습니다.");
        }
    }


    private static void printUpdateOption() {
        System.out.println("+-------원하는 요일의 일정을 수정합니다.-------+");
        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
        System.out.println("| Mon | THE | WED | THU | FRI | SAT | SUN |");
        System.out.println("+-----------------------------------------+");
        System.out.println("8. 뒤로가기");
        System.out.println();
        System.out.println(">>>> 일정을 수정할 요일의 번호를 입력하세요 ");
    }


    private static void deleteSchedule() {
        printDeleteOption();
        int option = inputNumber();

        // 작업 취소를 선택한 경우 종료
        if (option == 9) {
            return;
        }

        System.out.print("몇번 일정을 삭제하시겠습니까? : ");
        int scheduleNumber = inputNumber();

        // 해당 번호의 일정이 존재하는제 체크
        if (scheduleStore[option - 1][scheduleNumber-1] == nullMessage) {
            System.out.println("해당 번호에 일정이 존재하지 않습니다.");
            return;
        }

        // 선핵한 일정 삭제
        scheduleStore[option - 1][scheduleNumber-1] = nullMessage;
        System.out.println("해당 일정이 삭제되었습니다.");

    }

    private static void printDeleteOption() {
        System.out.println("+-------원하는 요일의 일정을 삭제합니다.-------+");
        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |");
        System.out.println("| Mon | THE | WED | THU | FRI | SAT | SUN |");
        System.out.println("+-----------------------------------------+");
        System.out.println("8. 뒤로가기");
        System.out.println();
        System.out.println(">>>> 일정을 제거할 요일의 번호를 입력하세요 ");
    }

    // <------------ main ------------>
    public static void main(String[] args) {
        My_Calendar calendar = new My_Calendar();
//        calendar.print();
        init();
        while (true) {
            intro();
            int main_option = inputNumber();
            if (main_option == 5){
                My_Calendar myCal = new My_Calendar();
                myCal.print();
                if (toMain()){
                    continue;
                }
            }
            if (main_option == 6) {
                System.out.println("프로그램을 종료합니다 수구빼윙 ~ ");
                System.exit(0);
            }
            startProgram(main_option);
        }


    }

}
