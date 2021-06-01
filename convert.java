import java.util.Scanner;


public class convert{
 public static void main(String[] args){

    //TAIWO AKINTUNDE
    //A00233642
    //Application development
    //This program has to do with unit conversion
    
    // i decleared values as double
    //use Scanner to collect input from user, 
    Scanner input = new Scanner (System.in);
    //convertion of kilometers to miles
    System.out.print("Enter a value to convert kilometers: ");
    
    double kilometers = input.nextDouble();
    //my inputted values in kilometers divide by 1.60
    double mi = (kilometers / 1.60);
    System.out.println("value is equal to " + mi + "mi");

    //conversion of miles to kilometers
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

//i collected input from user for conversion, then i decleared values as doubles, i applied the formular for each coversion and printed my output/
//for my last input i had a long double value as the output
//i could not make use of the if or switch statements because i kept on getting error when i ran the program. This is my first experience with java programming language.
