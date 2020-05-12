public class Boolean {
    public static void main (String[] args) {
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);

        // 三元运算
        // 注意到三元运算b ? x : y会首先计算b，如果b为true，则只计算x，否则，只计算y。
        // 此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一。
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);

        // 判断指定年龄是否是小学生（6～12岁）
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age > 6 && age < 12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
    
}