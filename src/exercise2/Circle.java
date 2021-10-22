
package exercise2;

import java.util.Scanner;
public class Circle {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double R = input.nextDouble();
     double C = 2 * Math.PI * R;
     double A = R * R * Math.PI;
     
     System.out.println("Circumference: " + C);
     System.out.println("Area: " + A); 
   input.close();
   }
}