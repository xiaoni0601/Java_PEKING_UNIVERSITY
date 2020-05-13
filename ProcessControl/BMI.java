import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight(kg):");
        double weight = scanner.nextDouble();
        System.out.println("Input your height(m):");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("体重过轻！");
        } else if (bmi <= 25) {
            System.out.println("体重正常");
        } else if (bmi <= 28) {
            System.out.println("过重了！");
        } else if (bmi <= 32) {
            System.out.println("肥胖了！");
        } else {
            System.out.println("非常肥胖啊！");
        }
        
    }
}