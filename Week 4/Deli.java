import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Deli
{
   public static void main (String[] args)
   {
      final double OUNCES_PER_POUND = 16.0;

      double pricePerPound;
      double weightOunces;
      double weight;
      double totalPrice;
      
      Scanner scan = new Scanner(System.in);

      // Create NumberFormat instance for currency formatting
      NumberFormat money = NumberFormat.getCurrencyInstance();
      
      // Create DecimalFormat instance for weight formatting
      DecimalFormat fmt = new DecimalFormat("0.00");

      // Prompt the user for input
      System.out.println("Welcome to the CS Deli!!\n ");
      System.out.print("Enter the price per pound of your item: ");
      pricePerPound = scan.nextDouble();

      System.out.print("Enter the weight (ounces): ");
      weightOunces = scan.nextDouble();

      // Convert ounces to pounds and compute the total price
      weight = weightOunces / OUNCES_PER_POUND;
      totalPrice = pricePerPound * weight;

      // Print the formatted label
      System.out.println("\n*****  CS Deli  *****\n");
      System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
      System.out.println("Weight: " + fmt.format(weight) + " pounds");
      System.out.println("\nTOTAL: " + money.format(totalPrice));
   }
}