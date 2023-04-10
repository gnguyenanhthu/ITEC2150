package ch5demo2_Scanner_review;
import java.util.Scanner;

public class PaycheckUsingLine { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    //1. get first name, last name, pay rate and hours worked from user
    System.out.print("Enter full name: ");
    String name = input.nextLine();
    System.out.print("Enter pay rate: ");
    String payRateString = input.nextLine();
    double payRate = Double.parseDouble(payRateString);
    System.out.print("Enter hours worked: ");
    String hoursString = input.nextLine();
    int hours = Integer.parseInt(hoursString);
    
    //2. calculate pay amount
    double totalPay=hours*payRate;

    //3. display pay check: first name, last name and pay amount
    System.out.println("The pay check amount " + name + " is $" + totalPay);
  }
}

