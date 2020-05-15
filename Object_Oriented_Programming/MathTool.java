
import java.util.Arrays;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;


public class MathTool {
    public static void main(String[] args) {
        double x = Math.random(); // x的范围是[0,1),每次都不一样
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min;
        long n = (long) y;
        System.out.println(y);
        System.out.println(n);
        System.out.println(Math.sin(3.14));
        System.out.println(Math.acos(1.0));



        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
        System.out.println(Arrays.toString(buffer));




        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e); // 打印异常信息
            return s.getBytes(); // 尝试使用用默认编码
        }




      


    }
    
}