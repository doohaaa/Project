package level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 변수 생성 및 초기화

        Scanner scanner = new Scanner(System.in);

        int result = 0;
        String exit ;
        Calculator cal1 = new Calculator();

        // 1. 양의 정수를 입력받기
        // 2. 사칙연산 기호 입력받기
        do {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String str = scanner.next();

            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("오류 : 0보다 크거나 같은 정수를 입력하세요.");
            }

            // 연산 결과 저장하는 부분 부터 해야함
            cal1.calculate(num1,num2,str);
            cal1.arrResult(result);


            System.out.println("계산기 사용을 멈추고 싶다면 'exit'을 정확하게 입력하세요.");
            exit = scanner.next();
        } while (!exit.equals("exit"));
    }

}
