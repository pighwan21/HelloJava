package Ch02._01;

public class VariableDecl {
    public static void main(String[] args) {
        double num1, num2;  // 두 개의 변수 동시 선언
        double result;
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;
        System.out.println(result);
    }
}
// - 기본적으로 컴퓨터의 실수 표현에는 오차가 존재한다.
// - 위의 실수 1.0000001을 저장한 num1의 값은 이에 가까운 값일 뿐 정확이 1.0000001은 아니다.

// * 기본 자료형(Primitive Data Type)
// - 정수 표현: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
// - 실수 표현: float(4바이트), double(8바이트)
// - 문자 표현: char(2바이트)
// - 참과 거짓의 표현: boolean(1바이트)

// * 변수의 이름을 짓는 방법
// - 변수의 이름은 숫자로 시작할 수 없다.
// - $과 _이외의 다른 특수문자는 변수의 이름에 사용할 수 없다.
// - 키워드는 변수의 이름으로 사용할 수 없다. ex) int int, String int