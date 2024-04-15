package com.ps;
import java.util.*; // For scanner classes
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator do you need? ");
        System.out.println("Type 1 for Mortgage, 2 for future value for a deposit or 3 for present value of an annuity:");
        int calculatorType = scanner.nextInt();
        // Determines which calculator will be used
        if (calculatorType == 1) {
            mortgageCalculator();

        } else if (calculatorType == 2) {
            fVCD();

        } else if (calculatorType == 3) {
            pVAnnuity();

        } else {
            System.out.println("Read instructions carefully");
        }


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
        double monthlyInterest = interestRate /12;
        double numerator = principal * (interestRate / 12); //Breaks the mortgage calculator up into the numerator and denominator
        double denominator = 1 - (Math.pow(1 + interestRate / 12, -12 * numOfPayments));
        double mortgageCalculator = (numerator / denominator);
        double totalInterest = (mortgageCalculator * numInMonths) - principal;
        System.out.println("Your mortgage payment is " + "$" + String.format("%.2f", mortgageCalculator) + " a month, with a total interest of: " + "$" + String.format("%.2f", totalInterest));


    }
    // Future value for CD calculator
        public static void fVCD() {

            Scanner scanner = new Scanner(System.in);
            Scanner userDeposit = new Scanner(System.in);
            System.out.println("How much is your deposit?");
            int cdDeposit = scanner.nextInt();
            Scanner userInterest = new Scanner(System.in);
            System.out.println("What is your Interest?");
            double fVInterest = scanner.nextDouble();
            Scanner cdYears = new Scanner(System.in);
            System.out.println("How many years is your investment for?");
        int investmentYears = scanner.nextInt();
        double fVInterestRate = fVInterest / 100;
        double fVCD = cdDeposit * Math.pow(1 + fVInterestRate / 365, 365 * investmentYears);
        double fVCDInterest = fVCD - cdDeposit;
        System.out.println("Your CD's ending balance will be " + "$" + String.format("%.2f", fVCD) + ", and you would have earned " + "$" + String.format("%.2f", fVCDInterest) + " in interest");
    }
        // This calculator is for the present value of an annuity
        public static void pVAnnuity() {

            Scanner scanner = new Scanner(System.in);
            Scanner userMonthlyPayment = new Scanner(System.in);
            System.out.println("What is your monthly payment?");
            int monthlyPayment = scanner.nextInt();
            Scanner userExpectedInterest = new Scanner(System.in);
            System.out.println("What is your expected interest?");
            double expectedInterest = scanner.nextFloat();
            Scanner userYearsPaid = new Scanner(System.in);
            System.out.println("How many years are you paying the annuity for?");
            int yearsPaid = scanner.nextInt();
            double pVInterest = (expectedInterest / 100) / 12; //Equation requires monthly interest rate
            int monthlyPeriods = yearsPaid * 12;
            double pVAnnuity = monthlyPayment * ((1 - Math.pow(1 + pVInterest, -monthlyPeriods)) / pVInterest);
            System.out.println("The present value of this annuity is: " + "$" + String.format("%.2f", pVAnnuity));
        }

}
