package Ch03._02;

public class ExplicitConversion {
    public static void main(String[] args) {
        double pi = 3.1415;
        int wholeNumber = (int)pi;      // pi의 값을 int형으로 명시적 형 변환
        System.out.println(wholeNumber);
        // 하지만 이렇듯 실수형 데이터를 정수형으로 변환 시 소수점 이하의 값이 잘려 나간다.
        // 변수 wholeNumber에 저장되는 값은 정수 3이다.

        long num1 = 3000000007L;
        int num2 = (int)num1;
        System.out.println(num2);
        // 크기가 큰 정수 자료형에서 작은 크기의 정수 자료형으로 형 변환을 진행하는 경우 상위 바이트가 잘려 나간다.
        // 즉, num1의 상위 4바이트를 제외한 나머지 4바이트만 num2에 저장된다.
        // 따라서 잘려 나가는 상위 4바이트에 유효한 데이터가 존재하는 경우에는 알 수 없는 값으로 변환이 되므로 주의해야 한다.

        short num3 = 1;
        short num4 = 2;
//        short num5 = num3 + num4;             // 컴파일 오류 발생
        short num5 = (short) (num3 + num4);
    }
}

// * 명시적 형 변환(Explicit Conversion)
// - 자동 형 변환이 진행되지 않은 상황에서도 필요하다면 '명시적 형 변환'을 통해서 형 변환이 이뤄지도록 문장을 구성할 수 있다.
