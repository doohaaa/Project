package level3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    //1. 속성
    private T result;
    private List<T> list = new ArrayList<>();
    private final Class<T> type;

    //2. 생성자
    ArithmeticCalculator(Class<T> type) {
        this.type = type;
    }


//3. 기능 ~ 메서드

    // 사칙연산 수행 후 결과값 반환
    public T calculate(T num1, T num2, String str) {
        OperatorType op = OperatorType.fromSymbol(str);

        Double n1 = num1.doubleValue();
        Double n2 = num2.doubleValue();

        Double tmp_result = 0.0;

        switch (op) {
            case ADDITION:
                tmp_result = n1 + n2;
                break;
            case SUBTRACTION:
                tmp_result = n1 - n2;
                break;
            case MULTIPLICATION:
                tmp_result = n1 * n2;
                break;
            case DIVISION:
                if (n2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                }
            default:
                System.out.println("오류: 정확한 연산자를 입력하세요");
        }

        // 형변환
        if (Integer.class == type) {
            return type.cast(tmp_result);
        } else if (Double.class == type) {
            return type.cast(tmp_result);
        }

        System.out.println("결과: " + result);
        return result;

    }

    // Getter 를 사용한 리스트 접근
    public List<T> getResultList() {
        return this.list;
    }


    // Setter 를 사용한 리스트 수정
    public void setResultList(T result) {
        this.list.add(result);
    }

    // 가장 먼저 저장된 데이터 삭제하는 메서드
    public void deleteResult() {
        this.list.remove(0);
    }

}
