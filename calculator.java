import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(("Enter the desired operator"));
        char operator = sc.next().charAt(0);

        switch (operator) {
            case 1:
                System.out.println("addition");
                break;
            case 2:
                System.out.println("subtraction");
                break;
            case 3:
                System.out.println("multiplication");
        }
    }

}
