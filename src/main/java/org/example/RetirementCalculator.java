package org.example;
import java.util.Calendar;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class RetirementCalculator
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("Congrats! You can already retire!");
            return;
        }

        System.out.print("At what age would you like to retire? ");
        int retirement_age = input.nextInt();
        if (retirement_age < 0) {
            System.out.println("Congrats! You can already retire!");
            return;
        }

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("You have " + (retirement_age - age) + " years left until you can retire.\nIt's " + year + ", so you can retire in " + (year + (retirement_age - age)) + ".");
    }
}
