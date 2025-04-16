package level1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 변수 생성 및 초기화

        Scanner scanner = new Scanner(System.in);

        int result = 0;
        String exit ;

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


            // 3. 사칙연산 기호를 사용하여 연산을 진행 한 후 결과를 출력하기

            if (str.equals("+")) {
                result = num1 + num2;
            } else if (str.equals("-")) {
                result = num1 - num2;
            } else if (str.equals("*")) {
                result = num1 * num2;
            } else if (str.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                } else {
                    result = num1 / num2;
                }

            } else {
                System.out.println("오류: 정확한 연산자를 입력하세요");
            }


            System.out.println("결과: " + result);

            System.out.println("계산기 사용을 멈추고 싶다면 'exit'을 정확하게 입력하세요.");
            exit = scanner.next();
        } while (!exit.equals("exit"));
    }
}

