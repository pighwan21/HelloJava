package Ch04._01;

public class Quest {
    public static void main(String[] args) {
        // 문제 1.
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        num1 = num2 = num3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // = 는 결합방향이 <- 방향이라.

        // 문제 2.
        int num4 = 0;
        int num5 = 0;
        boolean result;

        num4 += 10;
        num5 += 10;
        result = (num4 < 0) && (num5 > 0);
        System.out.println("result는 true니 false니? " + result);
        System.out.println("num4의 값은? " + num4);
        System.out.println("num5의 값은? " + num5);

        // 문제 3.
        int result2 = ((25 * 5)+(36 - 4) - 72) / 5;
        System.out.println(result2);

        // 문제 4.
        int result3 = 3 + 6;
        System.out.println("3 + 6 = " + result3);
        result3 += 9;
        System.out.println("3 + 6 + 9 = " + result3);
        result3 += 12;
        System.out.println("3 + 6 + 9 + 12 = " + result3);

        // 문제 5.
        int n1 = ((25 + 5) + (36 / 4) - 72) / 5;
        int n2 = ((25 * 5) + (36 - 4) + 71) / 4;
        int n3 = (128 / 4) * 2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        boolean trueOrFalse;
        trueOrFalse = (n1 > n2) && (n2 > n3);
        System.out.println(trueOrFalse);
    }
}
