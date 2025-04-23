package level3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 변수 생성 및 초기화
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        String exit;
        ArithmeticCalculator cal = new ArithmeticCalculator();

        // 1. 양의 정수를 입력받기
        // 2. 사칙연산 기호 입력받기
        do {
            System.out.print("첫번째 숫자를 입력하세요: ");
            double num1 = scanner.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String str = scanner.next();

            System.out.print("두번째 숫자를 입력하세요: ");
            double num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("오류 : 0보다 크거나 같은 정수를 입력하세요.");
            }

            //enum 사용
            OperatorType opType = OperatorType.fromOperator(str);
            int code = opType.getCode();



            // 계산기 기능 작동
            result = cal.calculate(num1, num2, code);
            System.out.println(result);

            // 연산 결과를 저장하는 부분
            cal.setResultList(result);

            // 연산 결과를 가져오는 부분
            System.out.println(cal.getResultList());

            // 첫번째 결과를 삭제하는 부분
            System.out.println("가장 먼저 저장된 데이터를 삭제하고 싶다면 1을 누르세요: ");
            int del = scanner.nextInt();
            if (del == 1) {
                cal.deleteResult();
                // 확인
                System.out.println(cal.getResultList());
            }

            // 입력 받은 수 보다 큰 수만 출력
            System.out.print("숫자하나를 입력하세요: ");
            double number= scanner.nextDouble();



            System.out.println("계산기 사용을 멈추고 싶다면 'exit'을 정확하게 입력하세요.");
            exit = scanner.next();
        } while (!exit.equals("exit"));
    }
}



