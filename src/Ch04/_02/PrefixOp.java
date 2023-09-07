package Ch04._02;

public class PrefixOp {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(++num);      // num의 값 하나 증가 후 출력
        System.out.println(++num);      // num의 값 하나 증가 후 출력
        System.out.println(num);
    }
}

// * 증가 및 감소 연산자: Prefix ++, Prefix --
// - 변수에 저장된 값을 증가 및 감소시키는 기능의 연산자이다.
// - 증가 및 감소 된 값을 단순히 반환하는 것이 아니라 실제 변수에 저장된 값을 변화시키는 연산자들이다.
// 연산자          연산자의 기능                                     결합 방향
// ++(prefix)     피연산자에 저장된 값을 1 증가                         <-
//                ex) val = ++n;
// --(prefix)     피연산자에 저장된 값을 1 감소                         <-
//                ex) val = --n;

// * Prefix 연산자
// - 피연산자의 앞부분에(왼편에) 붙는 연산자라는 뜻
