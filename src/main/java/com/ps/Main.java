package com.ps;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator do you need? ");
        System.out.println("Type 1 for Mortgage, 2 for future value for a deposit or 3 for present value of an annuity:");
        int calculatorType = scanner.nextInt();
        if (calculatorType == 1) {
            System.out.println("Mortgage machine coming in a minute!");
    }
        else if (calculatorType == 2) {
            System.out.println("Future value calc coming soon!");
        } else if (calculatorType == 3) {
            System.out.println("Annuity calc coming 2025!");
        }
        else {
            System.out.println("Read instructions carefully");
        }
        //public static void mortgageCalculator() {

    }
}