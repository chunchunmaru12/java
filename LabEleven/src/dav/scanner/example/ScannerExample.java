package dav.scanner.example;
//java package java.util.* is used for I/O in java
//There are multiple classes as for now we are using 'Scanner'
import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        //using scanner class  object to take input from user
        //WE need to pass 'System.in' class object inside
        //Scanned to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        try{
            //1.taking integer input
            int number=sc.nextInt();
            System.out.println("Your integer number is: "+number);
        }catch (InputMismatchException e){
            System.out.println("Error:Only Whole number is accepted ");
        }
        //2. taking double input
        try {
            System.out.println("enter double number");
            double num=sc.nextDouble();
            System.out.println("Your double number is: "+num);
        }catch (InputMismatchException e){
            System.out.println("Error: Only number accepted ");
        }
        //3. taking String input
        System.out.print("Enter your name: ");
        String name=sc.next();
        System.out.println("Your name is: "+name);
    }
}
