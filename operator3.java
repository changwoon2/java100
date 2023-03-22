public class operator3 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        boolean rst1 = a < b && c > b;
        System.out.println(rst1);

        boolean rst2 = a < b || c < b;
        System.out.println(rst2);

        boolean rst3 = 3 > c || b != c;
        System.out.println(rst3);

        boolean rst4 = !rst3;
        System.out.println(rst4);
        System.out.println(!rst4);
    }
}
