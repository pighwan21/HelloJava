package Ch02._01;

public class UseVariable {
    public static void main(String[] args) {
        int num1;               // 변수 num1의 선언
        num1 = 10;              // 변수 num1에 10을 저장

        int num2 = 20;          // 변수 num2 선언과 동시에 20으로 초기화     * 초기화: 처음 값을 지정하는 일
        int num3 = num1 + num2; // 두 변수 값을 대상으로 덧셈
        System.out.println(num1 + " + " + num2 + " = " + num3);
    }
}

// - 자바에서는 값의 대입의 의미로 = 기호가 사용된다.
// - 기호 = 을 가리켜 '대입 연산자'라 한다.
// - 이 연산자를 사용하면 오른편에 있는 값이 왼편에 있는 변수에 대입된다.