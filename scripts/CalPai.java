public class CalPai {

    public float calPai(float n) {
        return 3.14f * n * n;
    }

    public static void main(String[] args) {
        float n = Float.parseFloat(args[0]);
        CalPai cp = new CalPai();
        System.out.println(cp.calPai(n));
    }
}