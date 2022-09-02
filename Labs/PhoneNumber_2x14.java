
/**
 * Audrey Cheng
 * 9/1/22
 * Phone Number
 * Generate a random phone number with certain conditions
 */

import java.util.Random;

public class PhoneNumber_2x14
{
    public static void main(String[] args) {
        
        int digit1, digit2, digit3;
        int second;
        int third;
        
        Random generator = new Random();
        digit1 = generator.nextInt(7) + 1;
        digit2 = generator.nextInt(8);
        digit3 = generator.nextInt(8);
        
        second = generator.nextInt(643) + 100;
        third = (int) (Math.random() * 1000); 
        
        
        System.out.print("Random phone number: ");
        System.out.print(digit1);
        System.out.print(digit2);
        System.out.print(digit3 + "-");
        System.out.printf("%03d", second);
        System.out.print("-");
        System.out.printf("%03d", third);
        
        /*
         * Output
         * First: 216-240-029
         * Second: 774-101-470
         */
        
    }
}
