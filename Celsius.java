public class Celsius{
    public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
        
        System.out.pintIn("Enter fahrenheit: ");
        float fahrenheit = scanner.nextInt(); 


        float Celsius  = (5.0f/9) * (fahrenheit-32)
        System.out.pintIn("Celsius = " +Celsius);    
    }
}