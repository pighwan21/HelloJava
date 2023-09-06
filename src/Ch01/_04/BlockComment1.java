package Ch01._04;

/*
 파일이름: BlockComment1.Java
 작 성 자: 박꿀꿀
 작 성 일: 2023년 9월 6일
 목 적: System.out.println 메소드의 기능 테스트
*/

public class BlockComment1 {
    public static void main(String[] args) {
        /* 다음은 단순한 정수의 출력 */
        System.out.println(7);

        System.out.println(3.15);
        System.out.println("3 + 5 = " + 8);
        System.out.println(3.15 + "는 실수입니다.");
        System.out.println("3 + 5" + " 의 연산 결과는 8입니다.");

        /* 다음은 덧셈 결과의 출력 */
        System.out.println(3 + 5);
    }
}

// * 블록(block) 단위 주석: /* ~ */