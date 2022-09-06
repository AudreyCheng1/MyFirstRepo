
/**
 * Audrey Cheng
 * 8/31/22
 * Coins
 * Determine the value of coins in a jar in dollars and cents
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Coin_2x12
{
    public static void main(String[] args) {
        
        int total;
        int quarters, dimes, nickels, pennies;
        int dollars, cents;
        double finalTotal;
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        Scanner kb = new Scanner(System.in); //take input for each coin
        System.out.print("Quarters: ");
        quarters = kb.nextInt();
        
        System.out.print("Dimes: ");
        dimes = kb.nextInt();
        
        System.out.print("Nickels: ");
        nickels = kb.nextInt();
        
        System.out.print("Pennies: ");
        pennies = kb.nextInt();
        
        total = quarters * 25 + dimes * 10 + nickels * 5 + pennies; //overall total in cents
        dollars = total / 100; //divide to leave cents
        cents = total - dollars * 100;
        
        finalTotal = dollars + cents / 100.0; //adds dollars with cents
        
        System.out.println("Total: " +fmt.format(finalTotal)); //prints with dollar and cents format
        
    }
    
}
