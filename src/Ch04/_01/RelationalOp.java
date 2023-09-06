package Ch04._01;

public class RelationalOp {
    public static void main(String[] args) {
        System.out.println("3 >= 2 : " + (3 >= 2));
        System.out.println("3 <= 2 : " + (3 <= 2));
        System.out.println("7.0 == 7 : " + (7.0 == 7));
        System.out.println("7.0 != 7 : " + (7.0 != 7));
    }
}

// - 위의 문장에 등장하는 7.0과 7은 다르다.
// - 그러나 ==, != 연산을 위해 자동 형 변환이 일어난다.
// - 즉, 다음과 같이 정수 7이 실수 7.0으로 변환되어 진행된다.
// - ex) 7.0 == 7 -> 7.0 == 7.0
// - 따라서 그 결과로 true가 반환되어 출력된다.
