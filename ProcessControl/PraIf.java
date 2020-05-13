public class PraIf {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60) {
            System.out.println("恭喜你,及格了");
        }
        System.out.println("END");

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
        
    }
}