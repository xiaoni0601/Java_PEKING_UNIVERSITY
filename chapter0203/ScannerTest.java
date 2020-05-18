import java.util.Scanner;
class ScannerTest{
	public static void main( String[] args ){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数");
		int a = scanner.nextInt();
		System.out.print("请输入另一个数");
		int b = scanner.nextInt();
		System.out.printf("差是%d\n",a-b);
	}
}
