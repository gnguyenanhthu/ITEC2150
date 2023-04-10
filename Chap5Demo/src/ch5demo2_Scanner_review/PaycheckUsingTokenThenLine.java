package ch5demo2_Scanner_review;
import java.util.Scanner;

public class PaycheckUsingTokenThenLine { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    //1. get first name, last name, pay rate and hours worked from user
    System.out.print("Enter pay rate: ");
    double payRate = input.nextDouble();
    System.out.print("Enter hours worked: ");
    int hours = input.nextInt();
    System.out.print("Enter full name: ");
    String name = input.nextLine();
    
    //2. calculate pay amount
    double totalPay=hours*payRate;

    //3. display pay check: first name, last name and pay amount
    System.out.println("The pay check amount " + name + " is $" + totalPay);
  }
}

