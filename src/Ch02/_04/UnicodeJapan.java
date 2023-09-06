package Ch02._04;

public class UnicodeJapan {
    public static void main(String[] args) {
        char ch1 = 0x3041;
        char ch2 = 0x3051;
        char ch3 = 0x3061;
        char ch4 = 0x3071;
        System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);

        ch1 = 0x3043;
        ch2 = 0x3053;
        ch3 = 0x3063;
        ch4 = 0x3073;
        System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);
    }
}

// - 아무리 자바가 유니코드를 지원하더라도 문자의 출력은 운영체제에 의존적이다.
// - 따라서 자신이 출력하고자 하는 언어의 폰트가 운영체제에 설치되어 있어야 한다.
// - 만약 해당 국가의 폰트가 설치되어 있지 않다면 정상적인 출력을 확인하지 못한다.