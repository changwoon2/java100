public class datatype5 {
    public static void main(String[] args) {
        int a = 12345;
        String str = "12345";
        // System.out.println(a.length());
        System.out.println(str.length());
        String stra = String.valueOf(a);
        System.out.println(stra.length());
        System.out.println(12345 + 1);
        System.out.println(str + 1);

        int b = Integer.valueOf(str);
        System.out.println(b + 1);
    }
}