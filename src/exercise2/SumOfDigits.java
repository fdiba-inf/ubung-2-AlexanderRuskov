package exercise2;

import java.util.Scanner;

  public class SumOfDigits {

    public static void main(String[] args) {
     int a;

    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    
     int d1 = a % 10;
     a = a % 10;
     int d2 = a % 10;
     a = a % 10;
     int d3 = a % 10;
     
     int sum = d1 + d2 + d3;

     System.out.println("Sum of digits: " + sum);
      input.close();
    }
  }
