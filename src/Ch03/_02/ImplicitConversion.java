package Ch03._02;

public class ImplicitConversion {
    public static void main(String[] args) {
        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);
    }
}

// * 자동 형 변환(Implicit Conversion)
// - 프로그래머가 명시한 형 변환이 아니고, 필요한 상황에서 자동으로 일어난 형 변환
// - 1) 자료형의 크기가 큰 방향으로 형 변환이 일어난다.
// - 2) 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선한다.
// - ex) byte -> short -> int -> long -> float -> double
//               char
// - 모든 데이터는 필요시 double형 데이터로 자동 형 변환된다.
// - ex) double num1 = 30;              // int형 정수 30은 double형으로 자동 형 변환
// - ex) System.out.println(59L + 34.5) // long형 정수 59는 double형으로 자동 형 변환
