public class Celsius{
<<<<<<< HEAD
    public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
        
        System.out.pintIn("Enter fahrenheit: ");
        float fahrenheit = scanner.nextInt(); 


        float Celsius  = (5.0f/9) * (fahrenheit-32)
        System.out.pintIn("Celsius = " +Celsius);    
=======
    public static void main(String[]args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Fahrenheit= ");
        float fahrenheit = scanner.nextFloat();
        float x = fahrenheit-32;
        float celsius = (x * 5) /9;
        System.out.println("Celsius = " +celsius);
>>>>>>> f1d9fb2 (First commit)
    }
}