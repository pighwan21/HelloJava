package Ch04._02;

public class PostfixOp {
    public static void main(String[] args) {
        int num = 5;
        System.out.print((num++) + " ");    // 출력 후에 값이 증가  // 5
        System.out.print((num++) + " ");    // 출력 후에 값이 증가  // 6
        System.out.print(num + "\n");                             // 7

        System.out.print((num--) + " ");    // 출력 후에 값이 감소  // 7
        System.out.print((num--) + " ");    // 출력 후에 값이 감소  // 6
        System.out.print(num);                                    // 5
    }
}

// * 증가 및 감소 연산자: Postfix ++, Postfix --
// - 피연산자의 뒷부분에(오른편에) 붙일 수 있다.
// - 반영되는 시점에 차이가 있다.
// - Postfix ++ 연산과 Postfix -- 연산으로 인한 값의 증가 및 감소는 연산이 진행된 문장이 아닌,
//   그 다음 문장으로 넘어가야 반영된다.
