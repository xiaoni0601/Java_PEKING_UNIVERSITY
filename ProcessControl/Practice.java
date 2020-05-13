import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your old score: "); // 打印提示
        double scoreOld = scanner.nextDouble(); // 读取一行输入并获取字符串
        System.out.print("Input your new score: "); // 打印提示
        double ScoreNew = scanner.nextDouble(); // 读取一行输入并获取整数
        double Increase = (ScoreNew - scoreOld) / scoreOld * 100;
        System.out.printf("%.2f%%\n",Increase); // 格式化输出
    }
}


