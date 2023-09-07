package Ch04._02;

public class UnaryAddMin {

    public static void main(String[] args) {
        short num1 = 5;
        System.out.println(+num1);      // 결과적으로 불필요한 + 연산
        System.out.println(-num1);      // 부호를 바꿔서 얻은 결과를 출력

        short num2 = 7;
        short num3 = (short) (+num2);   // 형 변환 하지 않으면 오류 발생
        short num4 = (short) (-num2);   // 형 변환 하지 않으면 오류 발생
        System.out.println(num3);
        System.out.println(num4);
    }
}

// - 자바는 기본적으로 정수형 연산을 int형으로 진행하고 그 결과도 int형으로 반환한다.
// - 따라서 line11, line12에서 (short) 형변환을 하지 않는다면 컴파일 오류가 발생한다.
