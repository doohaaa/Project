# 사칙연산 계산기
: 세가지 단계로 나누어서 기능이 추가되는 계산기를 구현


**Level 1**
- 두개의 정수를 받아 사칙연산을 수행한다.
- exit을 입력할 때까지 계속해서 값을 받고 결과를 반환한다.
- (목적) 반복분, 조건문 활용

**Level 2**
- 계산된 결과값들을 기록하는 컬렉션이 있다.
- 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능이 있다.
- (목적) 컬렉션, 클래스, 캡슐화 활용

**Level 3 (미완성)**
- 실수를 입력 받을 수 있다.
- 결과가 저장되어있는 컬렉션을 조회하는 기능이 추가되어 특정 값보다 큰 결과 값을 출력할 수 있다.
- (목적) enum, 제네릭, 람다, 스트림 활용




## 작동 예시
**Level 1**

<img width="442" alt="image" src="https://github.com/user-attachments/assets/48fb9957-5357-481f-a29a-80f931b22c8b" />


**Level 2**

<img width="435" alt="image" src="https://github.com/user-attachments/assets/6231d7c9-7f56-4bf8-99c7-1bde0ca47566" />




## 코드 블럭
: 사칙 연산을 구현하는 코드

사용언어 : Java

```java
int calculate(int num1, int num2, String str) {
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
        return result;

}
```



