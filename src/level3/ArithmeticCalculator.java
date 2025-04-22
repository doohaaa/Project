package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ArithmeticCalculator<T extends Number> {
    //1. 속성
    private T result;
    private List<T> list = new ArrayList<>();
    //연산 후 다시 제네릭으로 타입 돌려주기 위해
    private Function<Double, T> converter;
    BiggerValue bigger = new BiggerValue() {
        @Override
        public Optional<Double> biggerValue(double a, double b) {
            if (a > b) return Optional.of(a);
            else return Optional.empty();
        }
    };

    //2. 생성자


    //3. 기능 ~ 메서드

    // 사칙연산 수행 후 결과값 반환
    public T calculate(T num1, T num2, int str) {
        double number1 = num1.doubleValue();
        double number2 = num2.doubleValue();
        double result;
        switch (str) {
            case 0:
                result = number1 + number2;
                break;
            case 1:
                result = number1 - number2;
                break;
            case 2:
                result = number1 * number2;
                break;
            case 3:
                if (number2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                } else result = number1 / number2;
            default:
                System.out.println("오류: 정확한 연산자를 입력하세요");

                System.out.println("결과: " + result);
                return converter.apply(result);

        }

        // Getter 를 사용한 리스트 접근
        public ArrayList<Double> getResultList () {
            return this.list ;
        }


        // Setter 를 사용한 리스트 수정
        public void setResultList ( int result){
            this.list.add(result);
        }

        // 가장 먼저 저장된 데이터 삭제하는 메서드
        public void deleteResult () {
            this.list.remove(0);
        }


    }
}