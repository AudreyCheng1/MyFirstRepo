
/**
 * Audrey Cheng
 * Splitting the bill between people
 * Worked with Michael Mihailov
 * 8/30/22
*/

import java.util.Scanner;

public class SplitTheBill
{
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numPeople = kb.nextInt();
        System.out.print("Enter the total bill: ");
        double bill = kb.nextDouble();
        double tip = bill * 0.2;
        double total = bill + tip;
        
        double billPay = bill / numPeople;
        double tipPay = tip / numPeople;
        double totalPay = billPay + tipPay;
                
        System.out.printf("Bill: $ %.2f \n", bill);
        System.out.printf("Tip: $ %.2f \n", tip);
        System.out.printf("Total cost: $ %.2f \n", total);
        
        //each
        System.out.printf("Each payment for bill: $ %.2f \n\n", billPay);
        System.out.printf("Each payment for tip: $ %.2f \n", tipPay);
        System.out.printf("Each person's total: $ %.2f \n", totalPay);
        
        
    }
}
