import java.util.Scanner;


public class convert{
 public static void main(String[] args){

    //TAIWO AKINTUNDE
    //A00233642
    //Application development
  
    //use Scanner to collect input from user
    Scanner input = new Scanner (System.in);
    //convertion of kilometers to miles
    System.out.print("Enter a value to convert kilograms: ");
    double kilometers = input.nextDouble();
    double mi = (kilograms / 1.60);
    System.out.println("value is equal to " + mi + "mi");

    //conversion of miles tp kilometers
    System.out.print("input a value for mile: ");
    double mile = input.nextDouble();
    double km = (mile * 1.60);
    System.out.println("value is equal to " + km + "km");


    //conversion of centimeter to inch
    System.out.print("input a value for centimeter: ");
    double centimeter = input.nextDouble();
    double inch = (centimeter / 2.5);
    System.out.println("value is equal to " + inch + "inch");

    //conversion of inch to centimeter
     System.out.print("input a value for 'in': ");
     double in = input.nextDouble();
     double cm = (in * 2.5);
     System.out.println("value is equal to " + cm + "cm");

     //conversion of kilograms to pounds
     System.out.print("input a value for kilograms: ");
     double kilograms = input.nextDouble();
     double pounds = (kilograms * 2.2);
     System.out.println("value is equal to " + pounds + "pounds");

    //conversion of pounds to kilograms
    System.out.print("input a value for Lbs: ");
    double Lbs = input.nextDouble();
    double kg = (Lbs / 2.2);
    System.out.println("value is equal to " + kg + "kg");
  
    System.out.println("End");
   }

}
