
/**
 * Audrey Cheng
 * 8/31/22
 * Sphere
 * Find volume and surface area of a sphere
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere_2x9
{
    public static void main (String[] args) {

        double radius;
        double surfaceArea;
        double volume;
        
        DecimalFormat fmt = new DecimalFormat(".0000");
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        radius = kb.nextDouble();
        
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        
        System.out.println("Surface Area: " +fmt.format(surfaceArea));
        System.out.println("Volume: " +fmt.format(volume));
    }
}
