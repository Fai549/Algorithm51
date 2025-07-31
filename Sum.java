import java.util.Scanner;
public class Sum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.pintIn("Enter num1: ");
        int num1 = scanner.nextInt(); 

        System.out.pintIn("Enter num2: ");
        int num2 = scanner.nextInt();

        int sum=num1+num2;
        System.out.pintIn("Sum = "+ sum +"of" + num1 +"and" + num2);            
    }
}
