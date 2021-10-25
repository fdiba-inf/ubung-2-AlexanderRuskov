package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

  public static void main(String[] args) {
    int A;

    System.out.println("Enter a Number:");

    Scanner input = new Scanner(System.in);
    A = input.nextInt();

    if ( A % 2 == 0 )
        System.out.println("Number is even");
     else
        System.out.println("Number is odd");
        input.close();
  }
}