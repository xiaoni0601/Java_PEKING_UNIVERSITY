public class Char {
    public static void main(String[] args) {
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

        String s = ""; // 空字符串，包含0个字符
        String s1 = "abc\\xyz";
        String s2 = "abc\"xyz";
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格  
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        String s5 = "Hello";
        String s6 = "world";
        String ss = s5 + " " + s6 + "!";
        System.out.println(ss);


        int age = 25;
        String sa = "age is " + age;
        System.out.println(sa);


        String s11 = "hello";
        System.out.println(s11); // 显示 hello
        s11 = "world";
        System.out.println(s11); // 显示 world


    }
}