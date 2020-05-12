public class Overflow {
    public static void main(String[] args) {
        //// 运算溢出
        int x = 2147483640; // long x = 2147483640;
        int y = 15;  // long y = 15;
        int sum = x + y; // long sum = x + y
        System.out.println(sum); 
    }
}