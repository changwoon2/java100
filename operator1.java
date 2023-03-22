public class operator1 {
    public static void main(String[] args) {
        // [!]연산의결과 --> 정수끼리라도 나누기
        int a = 60, b = 8;
        int rst1;
        double rst2, rst3, rst4;
        rst1 = a / b;
        System.out.println(rst1);
        System.out.println((double) rst1);
        rst2 = (double) a / b;
        System.out.println((double) rst2);

        rst3 = 100 / (double) 3;
        System.out.println((double) rst3);

        rst4 = 250 / 3;
        System.out.println(rst3);
        System.out.println(rst4);
        System.out.printf("세 과목의 평균은 %f 입니다",rst4);
    }
}
