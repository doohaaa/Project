package level3;

public enum OperatorType {
    ADDITION(0),
    SUBTRACTION(1),
    MULTIPLICATION(2),
    DIVISION(3),
    DEFAULT(4);

    // 속성
    private final int code;

    // 생성자
    OperatorType(int code){
        this.code = code;
    }


    // 기능 - 기호를 받으면 enum 값을 알려줌
    public static OperatorType fromOperator(String operator) {

        switch (operator) {
            case ("+"):
                return ADDITION;
            case ("-"):
                return SUBTRACTION;
            case ("*"):
                return MULTIPLICATION;
            case ("/"):
                return DIVISION;
            default:
                System.out.println("잘못된 연산자입니다!!");
                return DEFAULT;
        }
    }

    public int getCode(){
        return code;
    }

}



