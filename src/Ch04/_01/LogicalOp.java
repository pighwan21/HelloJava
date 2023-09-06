package Ch04._01;

public class LogicalOp {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        boolean result;

        // 변수 num1에 저장된 값이 1과 100 사이의 수인가?
        result = (1 < num1) && (num1 < 100);
        System.out.println("1 초과 100 미만인가? " + result);

        // 변수 num2에 저장된 값이 2 또는 3의 배수인가?
        result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
        System.out.println("2 또는 3의 배수인가? " + result);

        // 변수 num1이 0인가?
        result = !(num1 != 0);
        System.out.println("0 인가? " + result);
        result = (num1 == 0);
        System.out.println("0 인가? " + result);
    }
}

// - 논리 연산자 사용 시 주의할 점: SCE(Short-Circuit Evaluation). Lazy Evaluation.
// - 연산의 효율 및 속도를 높이기 위해서 불필요한 연산을 생략하는 행위
// - class SCE에 예시를 적어두겠음.
