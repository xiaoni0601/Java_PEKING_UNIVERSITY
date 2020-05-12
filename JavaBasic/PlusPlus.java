public class PlusPlus {
    public static void main(String[] args) {
        
        //// 自增/自减运算
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        n--; // 3300, 相当于 n = n - 1;
        int y = 100 + (++n); // 不要这么写
        System.out.println(y);

        //移位运算
        int x = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = x << 1;  // 左移1，00000000 00000000 00000000 00001110 = 14
        int b = x << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = x << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        int d = x << 29; // 11100000 00000000 00000000 00000000 = -536870912
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
        // 位运算
        int m = 0 & 0; // 与运算的规则是，必须两个数同时为1，结果才为1
        int m1 = 0 | 1; // 或运算的规则是，只要任意一个为1，结果就为1
        int m2 = ~ 0; // 非运算
        int m3 = 1 ^ 0; // 异或运算的规则是，如果两个数不同，结果为1，否则为0
        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        
        
        int i = 167776589; // 00001010 00000000 00010001 01001101
        int j = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & j); // 167776512


        // 强制转型
        // 超出范围的强制转型会得到错误的结果，原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节
        
        int i1 = 1234567;
        short s1 = (short) i1; // -10617
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short) i2; // 24910
        System.out.println(s2);


    }
}