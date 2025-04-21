package level3;

public enum OperatorType {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    DEFAULT(null);

    // 속성
    private final String symbol;

    // 생성자
    OperatorType(String symbol){
        this.symbol = symbol;
    }

    // 메서드
    public static OperatorType fromSymbol(String symbol){
        for(OperatorType op:values()){
            if(op.symbol.equals(symbol)){
                return op;
            }
        }
        return DEFAULT;
    }


}
