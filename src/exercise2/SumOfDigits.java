package exercise2;

import java.util.Scanner;

public class SumOfDigits{
  public static void main(String[] args ){
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    int D1 = a%10;
    int D2 = (a/10)%10;
    int D3 = (a/100)%10;
    int Sum = D1 + D2 + D3;
  
    System.out.println("Sum of digits: " + Sum); 
    input.close();
  }
}