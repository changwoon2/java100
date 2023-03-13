public class datatype1 {
    public static void main(String[] args) {
        int a;
        int b = 33;
        int c = 90;
        double d;
        char e;

        a = 10;
        d = 10;
        e = 'A';
        b = 20;

        System.out.println(a); // 10
        System.out.println(b); // 20
        System.out.println(c); // 90
        System.out.println(d); // 10.0
        System.out.println(e); // A

        int w;
        w = 100;
        System.out.println(w);
        // int x, y, z = 900;
        // System.out.println("[4-1] : " + z);

        int x, y, z;
        x = 900;
        y = 900;
        z = 900;
        System.out.println("[4-1] :" + x + "-" + y + "-" + z);

        int x1 = 300, y1 = 400, z1 = 500;
        System.out.println("[4-2] :" + x1 + "-" + y1 + "-" + z1);

        String str1, str2, str3;
        str1 = str2 = str3 = "korea";
        System.out.println("[4-3] :" + str1 + "-" + str2 + "-" + str3);

        int i, j, k;
        i = j = k = 100;
        System.out.println("[4-4] 여러 정수형 변수 한꺼번에 초기화 : " + i + "-" + j + "-" + k);
    }
}
