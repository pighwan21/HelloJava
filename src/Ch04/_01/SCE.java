package Ch04._01;

public class SCE {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        boolean result;

        result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');        // \n은 개행

        result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

// - &&의 왼쪽 피연산자가 false이면, 오른쪽의 피연산자는 확인하지 않는다.
// - ||의 왼쪽 피연산자가 true이면, 오른쪽 피연산자는 확인하지 않는다.