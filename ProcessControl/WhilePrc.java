public class WhilePrc {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n) {
            sum = sum + m;
            m ++;
        }
        System.out.println(sum);



        int sum2 = 0;
        int m2 = 20;
        int n2 = 100;
        do {
            sum2 = sum2 + m2;
            m2 ++;
        } while (m2 <= n2);
        System.out.println(sum2);
    }
}