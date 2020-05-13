public class ForPrc {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i=i+2) {//初始条件; 循环检测条件; 循环后更新计数器
            sum = sum + i;
        }
        System.out.println(sum);


        int[] ns = {1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }



    }
}