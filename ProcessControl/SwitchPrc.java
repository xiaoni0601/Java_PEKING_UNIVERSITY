public class SwitchPrc {
    public static void main(String[] args) {
        int option = 99;
        switch (option) {
        case 1:
            System.out.println("Select 1");
            break;//漏写break将导致意想不到的结果
        case 2:
            System.out.println("Select 2");
            break;
        case 3:
            System.out.println("Select 3");
            break;
        default:
            System.out.println("Out Select");
            break;
        }



        String fruit = "pear";
        switch (fruit) {
        case "apple" -> System.out.println("Selected apple");
        case "pear" -> System.out.println("Selected pear");
        case "mango" -> {
            System.out.println("Selected mango");
            System.out.println("Good choice!");
        }
        default -> System.out.println("No fruit selected");
        }



        String fruit2 = "apple";
        int opt = switch (fruit2) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);


        String fruit22 = "orange";
        int opt22 = switch (fruit22) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit22.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.println("opt = " + opt22);
    }
}