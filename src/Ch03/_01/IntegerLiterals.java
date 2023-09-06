package Ch03._01;

public class IntegerLiterals {
    public static void main(String[] args) {
        int num1 = 123;     // 10진수 표현
        int num2 = 0123;    // 8진수 표현
        int num3 = 0x123;   // 16진수 표현

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
    }
}

// - 숫자의 끝에 문자 L 또는 l을 붙이는 것이 long형 정수의 표현 방법
// - ex) 3147483647L, 3147483648l

