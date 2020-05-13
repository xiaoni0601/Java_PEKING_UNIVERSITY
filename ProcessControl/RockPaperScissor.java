

/**

 * switch实现石头/剪子/布并判断胜负

 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        int cp = random.nextInt(3); 
        //系统随机出拳
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数字1-3\n**************1.石头2.剪子3.布**************\n");
        int person = in.nextInt();
        //用户输入选择
        int c = person - cp - 1;
        switch(cp + 1)
        {
            case 1:
                System.out.print("系统出了石头\n");
                break;
            case 2:
                System.out.print("系统出了剪子\n");
                break;
            case 3:
                System.out.print("系统出了布\n");
                break ;
        }
        switch(c)
        {
            case 0:
                System.out.print("平局");
                break;
            case -1:
            case 2:
                System.out.print("恭喜你！你赢了");
                break;
            case 1:
            case -2:
                System.out.print("很抱歉，你输了");
                break;

        }
    }
    
}