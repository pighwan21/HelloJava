package Ch04._03;

public class BitOpMeans {
    public static void main(String[] args) {
        byte n1 = 13;
        byte n2 = 7;
        byte n3 = (byte) (n1 & n2); // 비트 연산 &의 결과는 int형이기에 byte 형변환이 필요
        System.out.println(n3);
    }
}


// * 비트 연산자의 이해
// - 비트 연산자는 각각의 비트를 대상으로 연산을 진행하는 연산자이며 피연산자는 반드시 정수여야 한다.
// - 실수를 대상으로 하는 비트 연산은 의미가 없기에 자바는 이를 지원하지 않는다.

// 연산자      연산자의 기능                                 결합 방향
//   &         비트 단위로 AND 연산을 한다.                      ->
//             ex) n1 & n2;
//   |         비트 단위로 OR 연산을 한다.                       ->
//             ex) n1 | n2;
//   ^         비트 단위로 XOR연산을 한다.                       ->
//             ex) n1 ^ n2;
//   ~         피연산자의 모든 비트를 반전시켜서 얻은 결과를 반환   ->
//             ex) ~n;