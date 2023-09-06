package Ch02._04;

public class OperatePromotion {
    public static void main(String[] args) {
//        short num1 = 11;
//        short num2 = 22;
//        short result = num1 + num2;
        // java: incompatible types: possible lossy conversion from int to short
        // 자바는 정수형 연산을 int형으로 진행한다.
        int num1 = 11;
        int num2 = 22;
        int result = num1 + num2;
        System.out.println(result);
    }
}

// - 자바 가상머신은 정수형 연산을 4바이트 int형으로만 진행한다.
// - 따라서 byte형 변수나 short형 변수에 저장된 값을 대상으로 덧셈과 같은 연산을 진행하면 이를 먼저 int형 값으로 변경해버린다.
// - 변수 num1과 num2에 저장된 값을 int형으로 변환한다 -> 변수 result는 2바이트 short형이고 연산 결과는 4바이트 int형이다.

// * float와 double 사이에서 자료형을 선택하는 기준
// - 정밀도
// - 실수의 표현에 사용되는 바이트 수가 크면 오차의 크기가 작아진다.
// - float는 6자리의 정밀도를 갖고, double은 15자리의 정밀도를 갖는다.