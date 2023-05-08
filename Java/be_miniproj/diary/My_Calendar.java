package diary;

import java.util.Scanner;

public class My_Calendar {
    public static int MonthAndDay(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 29;
            }
            else {
                return 28;
            }
        }
    }

    void print() {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
//        System.out.print("년도를 입력하세요: ");

        int year = 2023;
        System.out.print("월을 입력하세요: ");

        int month = scanner.nextInt();
        System.out.println("["+year + "년 " + month + "월]의 달력을 출력합니다.");


        int day_index = 0;
        // 1583년 1월 1일 토요일을 기준으로 달력 생성
        // 윤년이면 2칸 뛰고 평년이면 1칸 뛴다
        for (int i = 1583; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                // 윤년이라면
                day_index  += 2;
            }
            else {
                // 평년이라면
                day_index  += 1;
            }
        }
        // year의 1월 1일 요일 구하기
        int from_January1st = (day_index + 6) % 7 ;

        for (int j = 1; j < month; j++) {
            // 각 월별 날짜 수 계산
            from_January1st += MonthAndDay(year, j) % 7;
        }

        // 입력한 month의 1일의 요일
        // index : 일요일 0 ~ 토요일 6

        int start_day_index = from_January1st % 7;
        int count_days = 1; // month의 일 표시
        int max_days = MonthAndDay(year, month); // 해당 month가 가지는 최대 일 수
        boolean start = false;
        // 달력 그리기
        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");

        int week_arr[][] = new int[5][7];

        loop: for (int row = 0; row <= 5; row++) {
            for (int column = 0; column <= 6; column++) {
                if (row == 0 && !start) {
                    // 달력의 첫 행
                    if (column == start_day_index) {
                        // 시작 일에 도달하면
                        start = true;
                    } else {
                        // 시작 일에 도달 전에는 공백
                        System.out.print("     ");
                        continue;
                    }
                }
                System.out.printf("  %02d ", count_days);
                count_days++;
                if (count_days > max_days) {
                    // 최대 일 수에 도달하면 break loop
                    break loop;
                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
