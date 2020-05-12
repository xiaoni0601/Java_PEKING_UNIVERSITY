
// 浮点数运算误差
public class Float {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);

        double r = Math.abs(x - y);
        System.out.println(r);

        int n = 5;
        double d = 1.2 + 24.0 / n; 
        System.out.println(d);

        double d1 = 0.0 / 0;
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        int n2 = (int) -12.7;
        System.out.println(n2);

        double d6 = 2.6;
        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型
        int n6 = (int) (d6 + 0.5);
        System.out.println(n6);


    }
    
}