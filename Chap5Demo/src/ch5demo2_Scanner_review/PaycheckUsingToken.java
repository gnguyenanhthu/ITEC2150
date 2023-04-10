package ch5demo2_Scanner_review;
import java.util.Scanner;

public class PaycheckUsingToken { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    //1. get first name, last name, pay rate and hours worked from user
    System.out.print("Enter first name and last name: ");
    String firstName = input.next();
    String lastName = input.next();
    System.out.print("Enter pay rate and hours worked: ");
    double payRate = input.nextDouble();
    int hours = input.nextInt();
    
    //2. calculate pay amount
    double totalPay=hours*payRate;

    //3. display pay check: first name, last name and pay amount
    System.out.println("The pay check amount " + firstName + " " + lastName + " is $" + totalPay);
  }
}

