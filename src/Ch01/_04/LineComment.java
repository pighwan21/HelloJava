package Ch01._04;

// 파일이름: LineComment.java
// 작 성 자: 박꿀꿀
// 작 성 일: 2019년 7월 25일
// 목   적: System.out.println 메소드의 기능 테스트

public class LineComment {
    public static void main(String[] args) {
        System.out.println(7); // 다음은 단순한 정수의 출력

        System.out.println(3.15);
        System.out.println("3 + 5 = " + 8);
        System.out.println(3.15 + "는 실수입니다.");
        System.out.println("3 + 5" + " 의 연산 결과는 8입니다.");

        System.out.println(3 + 5); // 덧셈 결과의 출력
    }
}

// - 결과적으로 앞의 BlockComment.java와 완전히 동일한 프로그램
// - 주석의 유무와 주석의 처리 방식에만 차이가 있을 뿐.