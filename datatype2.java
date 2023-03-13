public class datatype2 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 30000;
        int i = 21000000;
        long l = 700000000000L;
        float f = 9.8F;
        double d = 3.14;
        char c = 'A';
        boolean bl = true;

        System.out.println(b + "Byte 최대값" + Byte.MAX_VALUE);
        System.out.println(s + "Short 최대값" + Short.MAX_VALUE);
        System.out.println(i + "int 최대값" + Integer.MAX_VALUE);
        System.out.println(l + "long 최대값" + Long.MAX_VALUE);
        System.out.println(f + "float 최대값" + Float.MAX_VALUE);
        System.out.println(d + "double 최대값" + Double.MAX_VALUE);
        System.out.println(c);
        System.out.println(bl);
    }
}
