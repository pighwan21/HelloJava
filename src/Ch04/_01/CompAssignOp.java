package Ch04._01;

public class CompAssignOp {
    public static void main(String[] args) {
        short num = 10;
        num = (short)(num + 77L);       // 형 변환 안하면 컴파일 오류 발생
        int rate = 3;
        rate = (int)(rate * 3.5);       // 형 변환 안하면 컴파일 오류 발생
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L;     // 형 변환 필요하지 않다.
        rate = 3;
        rate *= 3.5;    // 형 변환 필요하지 않다.
        System.out.println(num);
        System.out.println(rate);
    }
}

// - 복합 대입 연산자를 사용하면 형 변환을 알아서 해주는 것으로 이해할 수 있다.
// - 따라서 복합 대입 연산자를 사용하면 명시적인 형 변환을 줄이는 장점도 얻을 수 있다!