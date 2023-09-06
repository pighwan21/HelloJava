package Ch04._01;

public class ArithOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        System.out.println("num1 + num2 = " + (num1 + num2));   // 10
        System.out.println("num1 - num2 = " + (num1 - num2));   // 4
        System.out.println("num1 * num2 = " + (num1 * num2));   // 21
        System.out.println("num1 / num2 = " + (num1 / num2));   // 2
        System.out.println("num1 % num2 = " + (num1 % num2));   // 1
    }
}

// - 특정 연산을 소괄호로 묶어주면 이 부분이 별도로 구분이 되어 연산자의 우선 순위에 상관없이 해당 부분의 연산이 먼저 진행된다.
// - 연산자의 우선순위를 정확히 기억하고 있더라도 이렇듯 소괄호로 연산의 순서 및 과정을 구분 지어주자.