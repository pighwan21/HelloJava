package Ch03._01;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("AB" + '\b' + 'C');
        System.out.println("AB" + '\t' + 'C');
        System.out.println("AB" + '\n' + 'C');
        System.out.println("AB" + '\r' + 'C');
        System.out.println("pig" + '\r' + 'P');
    }
}
