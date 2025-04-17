package level2;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        for (int i = 0; i < 5; i++) {
            System.out.print("값을 읿력하세요: ");
            int result = sc.nextInt();
            // 새로운 값 넣기
            list.add(result);

        }
        // 리스트 확인
        for (int i =0; i<5; i++){
            list.get(i);
        }
    }
}




