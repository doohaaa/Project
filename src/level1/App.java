package level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 변수 생성 및 초기화

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String str = "연산기호";
        boolean flag = true;
        boolean flag2 = true;

        // 1. 양의 정수를 입력받기


        while (flag) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            num1 = scanner.nextInt();
            if (num1 >= 0) {
                flag = false;
            } else {
                System.out.println("오류 : 0보다 크거나 같은 정수를 입력하세요.");
            }
        }

        flag = true;
        while (flag2) {
            while (flag) {
                {
                    System.out.print("두번째 숫자를 입력하세요: ");
                    num2 = scanner.nextInt();
                    if (num2 >= 0) {
                        flag = false;
                    } else {
                        System.out.println("오류 : 0보다 크거나 같은 정수를 입력하세요.");
                    }
                }
            }

            // 2. 사칙연산 기호
            flag = true;

            while (flag) {
                {
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    str = scanner.next();

                    if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                        flag = false;
                    } else {
                        System.out.println("오류 : 올바른 기호를 입력하세요.");
                    }
                }
            }
            flag = true;
            // 3. 사칙연산 기호를 사용하여 연산을 진행 한 후 결과를 출력하세요.

            if (str.equals("+")) {
                result = num1 + num2;
            } else if (str.equals("-")) {
                result = num1 - num2;
            } else if (str.equals("*")) {
                result = num1 * num2;
            } else {
                if (num2 != 0) {
                    result = num1 / num2;
                    flag2 = false;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    System.out.println("flag2= "+flag2);
                }
            }
        }

        System.out.println("결과: "+result);
    }
}
