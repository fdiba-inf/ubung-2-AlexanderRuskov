package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double Pi = 4.0*(1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/11.0 - 1.0/13.0 + 1.0/17.0 - 1.0/19.0 + 1.0/23.0);
       double R = input.nextDouble();
       double C = 2*Pi*R;
       double A = Pi*R*R;
       

  System.out.println("Circumference: "+ C);
  System.out.println("Area: "+ A);
  input.close();
    }

}