package src;

import java.util.Scanner;

public class VendingMachine {
    private int numOfOneHundred;
    private int numOfFifty;
    private int numOfTwenty;
    private int numOfTen;
    private int numOfFive;
    private int numOfOne;
    private int numOfQuarters;
    private int numOfDimes;
    private int numOfNickels;
    private int numOfPennies;
    double item_cost;
    int amount_paid;

    public VendingMachine() {
        numOfOneHundred = 0;
        numOfFifty = 0;
        numOfTwenty = 0;
        numOfTen = 0;
        numOfFive = 0;
        numOfOne = 0;
        numOfQuarters = 0;
        numOfDimes = 0;
        numOfNickels = 0;
        numOfPennies = 0;
        item_cost = 0;
        amount_paid = 0;
    }

    public void receiveMoney() {
        Scanner sc = new Scanner(System.in);
        try {
            item_cost = sc.nextDouble();
            amount_paid = sc.nextInt();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public double getItem_cost() {
        return this.item_cost;
    }

    public void setItem_cost(double item_cost) {
        this.item_cost = item_cost;
    }

    public int getAmount_paid() {
        return this.amount_paid;
    }

    public void setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
    }

    public String optimal_change(double item_cost, int amount_paid) {
        double amountChange = amount_paid - item_cost;

        if (amountChange >= 100) {
            this.numOfOneHundred = (int) (amountChange / 100);
            amountChange = amountChange - numOfOneHundred * 100;
        }
        if (amountChange >= 50) {
            this.numOfFifty = (int) (amountChange / 50);
            amountChange = amountChange - numOfFifty * 50;
        }

        if (amountChange >= 20) {
            this.numOfTwenty = (int) (amountChange / 20);
            amountChange = amountChange - this.numOfTwenty * 20;
        }

        if (amountChange >= 10) {
            this.numOfTen = (int) (amountChange / 10);
            amountChange = amountChange - this.numOfTen * 10;
        }

        if (amountChange >= 5) {
            this.numOfFive = (int) (amountChange / 5);
            amountChange = amountChange - this.numOfFive * 5;
        }

        if (amountChange >= 1) {
            this.numOfOne= (int) (amountChange / 1);
            amountChange = amountChange - this.numOfOne * 1;
        }

        if (amountChange >= 0.25) {
            this.numOfQuarters= (int) (amountChange / 0.25);
            amountChange = amountChange - this.numOfQuarters * 0.25;
        }
        if (amountChange >= 0.1) {
            this.numOfDimes= (int) (amountChange / 0.1);
            amountChange = amountChange - this.numOfDimes * 0.1;
        }
        if (amountChange >= 0.05) {
            this.numOfNickels= (int) (amountChange / 0.05);
            amountChange = amountChange - this.numOfNickels * 0.05;
        }
        if (amountChange >= 0.01) {
            this.numOfPennies = (int) (amountChange / 0.01);
            amountChange = amountChange - this.numOfPennies * 0.01;
        }

        return "The optimal change for an item that costs " + item_cost + " with an amount of paid of " + amount_paid + " is "
                    + this.numOfOneHundred + " $100 bill," + this.numOfFifty + " $50 bill," + this.numOfTwenty + " $20 bill,"
                    + this.numOfTen + " $10 bill, " + this.numOfFive + " $5 bill, " + this.numOfOne + " $1 bill," + this.numOfQuarters
                    + " quarters." + this.numOfDimes + " dimes, " + this.numOfNickels + " nickles, " + this.numOfPennies + " pennies.";
    }


}
