
/**
 * Audrey Cheng
 * 9/1/22
 * Phone Number
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
        
        System.out.println("Random phone number: " +digit1 + digit2 + digit3 + "-" + second + "-" + third);
        /*
         * Output
         * First: 
         * Second:
         */
        
    }
}
