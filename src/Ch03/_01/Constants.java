package Ch03._01;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;
        CONST_ASSIGNED = 12;        // 할당되지 않았던 상수의 값 할당
        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
    }
}

// - 상수는 '값이 변하지 않는 수'를 의미한다.
// - 자바에서는 한번 그 값이 정해지면 이후로는 변경이 불가능한 변수도 상수라 한다.
// - 상수의 이름은 모두 대문자로 짓는다.
// - 이름이 둘 이상의 단어로 이뤄질 경우 단어 사이에 언더바를 넣는다.
