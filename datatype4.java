public class datatype4 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 147483647;
        long l = 700000000000L;
        float f = 9.8F;
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        System.out.printf("나는 %d대학생 입니다 %d, %d, %d, %.1f, %.2f, %c, %b", b, s, i, l, f, d, c, bl);
        System.out.println();
        System.out.printf("10진수 10은 8진수로는 %o이고, 16진수로는 %x이다", b, 15);
        System.out.println();
    }
}
