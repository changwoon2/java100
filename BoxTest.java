public class BoxTest {
    int width;
    int height;
    int depth;

    public static void main(String args[]) {
        int h = 5;
        int w = 5;
        int d = 5;
        // int d; //지역 변수는 초기화하지 않으면 오류가 발생한다.
        BoxTest box = new BoxTest();
        System.out.println("박스의 부피는 = " + box.calcVolume(w, h, d) + "입니다.");
    }

    public int calcVolume(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;

        int vol = width * height * depth;
        return vol;
    }
}
