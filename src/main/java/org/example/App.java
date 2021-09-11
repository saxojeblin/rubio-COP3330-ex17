/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        int gender;
        double alcohol, weight, time, ratio, BAC;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        gender = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        alcohol = sc.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        weight = sc.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        time = sc.nextDouble();

        if (gender == 1) {
            ratio = 0.73;
        }
        else {
            ratio = 0.66;
        }

        BAC = (alcohol * 5.14  / weight * ratio) - 0.015 * time;

        System.out.printf("\nYour BAC is %f\n", BAC);

        if (BAC >= 0.08) {
            System.out.println("It is not legal for you to drive.");
        }
        else {
            System.out.println("It is legal for you to drive.");
        }
    }
}
