package com.ps;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        mortgageCalculator();
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator do you need? ");
        System.out.println("Type 1 for Mortgage, 2 for future value for a deposit or 3 for present value of an annuity:");
        int calculatorType = scanner.nextInt(); */

        /*if (calculatorType == 1) {
            Scanner userPrincipal = new Scanner(System.in);
            System.out.println("What is your principal?");
            int principal = scanner.nextInt();
            Scanner userInterestRate = new Scanner(System.in);
            System.out.println("What is your Interest?");
            double interestRate = scanner.nextDouble();
            Scanner userPayments = new Scanner(System.in);
            System.out.println("How many years is your mortgage for?");
            int numOfPayments = scanner.nextInt();

        } else if (calculatorType == 2) {
            System.out.println("Future value calc coming soon!");

        } else if (calculatorType == 3) {
            System.out.println("Annuity calc coming 2025!");

        } else {
            System.out.println("Read instructions carefully");
        }

         */
    }
    public static void mortgageCalculator() {

            Scanner scanner = new Scanner(System.in);
            Scanner userPrincipal = new Scanner(System.in);
            System.out.println("What is your principal?");
            int principal = scanner.nextInt();
            Scanner userInterestRate = new Scanner(System.in);
            System.out.println("What is your Interest?");
            float numInterestRate = scanner.nextFloat();
            Scanner userPayments = new Scanner(System.in);
            System.out.println("How many years is your mortgage for?");
            int numOfPayments = scanner.nextInt();
        int numInMonths = numOfPayments * 12;
        float interestRate = numInterestRate / 100;
        double numerator = principal * (interestRate / 12);
        double denominator = 1 - (Math.pow(1 + interestRate / 12, -12 * numOfPayments));
        double mortgageCalculator = (numerator / denominator);
        System.out.println("Your mortgage payment is " + mortgageCalculator);

    }
    public static void fValueDeposit(){

    }
}
