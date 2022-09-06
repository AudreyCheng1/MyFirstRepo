
/**
 * Audrey
 * 9/2/22
 * Name
 * Display first, middle, last names separate
 */

import java.util.Scanner;

public class name_2
{
    public static void main(String[] args) {
        
        String fullName, newName;
        String first, middle, last;
        int firstSpace, secondSpace;
        
        Scanner kb = new Scanner(System.in); //read full name
        fullName = kb.nextLine();
        
        firstSpace = fullName.indexOf(" "); //everything before is first name
        first = fullName.substring(0, firstSpace);
        
        newName = fullName.substring(firstSpace + 1); //without first name
        
        secondSpace = newName.indexOf(" "); //find middle name
        middle = newName.substring(0, secondSpace);
        
        last = newName.substring(secondSpace + 1); //substring until the end
        
        System.out.println("First name with middle initial: " +first + " " 
                            + middle.substring(0, 1) + ".");
                            
        System.out.println("Last name: " +last);
                     
        //outputs: 
        /* 1: Input: Audrey Ziyue Cheng
         * Output: 
         * Audrey Z.
         * Cheng
         * 
         * 2: Input: Billy Bob Joe
         * Output:
         * Billy B.
         * Joe
         */
        
        
    }
    
}
