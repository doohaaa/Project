package level2;

import java.util.ArrayList;

public class Calculator {
    //1. 속성
    int result;
    ArrayList<Integer> list = new ArrayList<Integer>(5);


    //2. 생성자


    //3. 기능 ~ 메서드

    // 사칙연산 수행 후 결과값 반환
    int calculate(int num1, int num2, String str) {
        if (str.equals("+")) {
            result = num1 + num2;
        } else if (str.equals("-")) {
            result = num1 - num2;
        } else if (str.equals("*")) {
            int result = num1 * num2;
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
        return result;

    }




}
