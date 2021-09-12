package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        double p, rate, time, amount;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter the principle:");
        p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        time = sc.nextDouble();

        //calculations
        amount = Math.round((p*(1 + (rate/100)*time))*100.0)/100.0;

        //output
        System.out.println("After " + (int) time + " years at " + rate + "%, the investment will be worth $" + amount + ".");

        //close scanner
        sc.close();
    }
}
