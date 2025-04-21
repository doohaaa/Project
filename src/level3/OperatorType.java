package level3;

public enum OperatorType {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    DEFAULT;

    // 속성
    private OperatorType operator;

    // 생성자


    // 기능 - 기호를 받으면 enum 값을 알려줌
    public OperatorType fromOperator(String operator) {

        switch (operator) {
            case ("+"):
                this.operator = ADDITION;
                return ADDITION;
            case ("-"):
                this.operator = SUBTRACTION;
                return SUBTRACTION;
            case ("*"):
                this.operator = MULTIPLICATION;
                return MULTIPLICATION;
            case ("/"):
                this.operator = DIVISION;
                return DIVISION;
            default:
                this.operator = DEFAULT;
                System.out.println("잘못된 연산자입니다!!");
                return DEFAULT;
        }
    }

}



