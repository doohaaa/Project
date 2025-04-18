package level3;

import java.util.ArrayList;

public class ArithmeticCalculator <T extends Number> {
    //1. 속성
    private <T> result;
    private List<T> list = new ArrayList<>();


    //2. 생성자


    //3. 기능 ~ 메서드

    // 사칙연산 수행 후 결과값 반환
    public <S> calculate(S num1, S num2, int str) {
        switch(str){
            case 1 :result = num1 + num2;
            break;
            case 2: result = num1 - num2;
            break;
            case 3: result = num1 * num2;
                break;
            case 4: if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

            }
            default:System.out.println("오류: 정확한 연산자를 입력하세요");

        System.out.println("결과: " + result);
        return result;

    }

    // Getter 를 사용한 리스트 접근
    public ArrayList<Integer> getResultList(){
        return this.list;
    }


    // Setter 를 사용한 리스트 수정
    public void setResultList(int result){
        this.list.add(result);
    }

    // 가장 먼저 저장된 데이터 삭제하는 메서드
    public void deleteResult(){
        this.list.remove(0);
    }

}
