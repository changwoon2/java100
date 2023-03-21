public class VarTest {
    public static void main(String args[]) {
        int a;
        // int 1a; //변수명의 첫번째 문자는 알파벳이어야 한다.

        int a1;
        int a123b;
        int a123$; // 특수문자 '$'는 변수명에 사용 가능하다.
        int a_123; // 특수문자 '_'는 변수명에 사용 가능하다.
        // int a@#; //특수문자는 변수명으로 사용할 수 없다.
        int b, c;
        int b1, c1;

        a = 3;
        // a=3.14 //변수에는 선언한 데이터종류만 저장할 수 있다.
        b = 5;
        c = a;
        a = a + 4;
        ;
        System.out.println(a + b + c + a);
    }
}