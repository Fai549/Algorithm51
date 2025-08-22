import java.util.Scanner;

public class Sale{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

      //รับค่าราคาสินค้า
      System.out.print("Enter price of one dress: ");
      double price = scanner.nextDoble();

      //รับค่าจำนวนสินค้า
        System.out.print("Enter number of dresses to buy: ")
      double qty = scanner.nextDoble();
      
      //รับค่าส่วนลดเป็น %
      System.out.print("Enter discount rete: ");
      double sale = scanner.nextDoble();

      //คิดเป็นผลรวมทั้งหมด
      double total = price * qty;
      double discount = (total * sale) /100;
      doubel pay = total - discount;
      System.out.println("Total cost = " +total +" Baht. ");
      System.out.println("discouontAmount = " +discount +" Baht. ");
      System.out.println("Net Pay = " +pay +" Baht. ");
   }
}