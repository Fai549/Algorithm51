public class Bmi{
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
        
        System.out.pintIn("Enter height: ");
        int height = scanner.nextInt(); 

        System.out.pintIn("Enter weight: ");
        int height = scanner.nextInt();

        int Bmi = weight / (height*height);
        System.out.pintIn("Bmi  = " +Bmi);   
   }    
}
    