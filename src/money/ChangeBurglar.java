package money;

import java.util.Scanner;

public class ChangeBurglar {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double priceAmount, tenderedAmount, amountReturned; // declarations
		int remainingChange; // declarations

		System.out.println("Please enter the price of the merchandise:");
		priceAmount = kb.nextDouble() * 100; // cashier enters price of
												// merchandise --- multiplied by
												// 100 for easier calculations
		System.out.println("The price of the merchandise is: $" + priceAmount / 100);
		System.out.println("============================================");
		System.out.println("Please enter the amount of money tendered by the customer:");
		tenderedAmount = kb.nextDouble() * 100; // cashier receives X amount
												// from customer --- multiplied
												// by 100 for easier
												// calculations
		kb.close(); // scanner closed --- no more input
		amountReturned = (tenderedAmount - priceAmount); // change given back to
															// customer = amount
															// customer gave -
															// price of
															// merchandise
		remainingChange = (int) amountReturned; // remaining change for machine
												// to process = amountReturned
												// cased into an (int) in order
												// to multiply by 100 for easier
												// calculations

		if (tenderedAmount > priceAmount) { // if amount given by customer to
											// cashier is more than the price of
											// the merchandise then...
			remainingChange = (int) amountReturned;
			int billsTwenty, billsTen, billsFive, billsOne, changeQuarter, changeDime, changeNickel, changePenny;
			amountReturned = (tenderedAmount - priceAmount) / 100;

			billsTwenty = remainingChange / 2000;

			if (billsTwenty > 0) {
				remainingChange = remainingChange % 2000;
			}
			billsTen = remainingChange / 1000;

			if (billsTen > 0) {
				remainingChange = remainingChange % 1000;
			}
			billsFive = remainingChange / 500;

			if (billsFive > 0) {
				remainingChange = remainingChange % 500;
			}
			billsOne = remainingChange / 100;

			if (billsOne > 0) {
				remainingChange = remainingChange % 100;
			}
			changeQuarter = remainingChange / 25;

			if (changeQuarter > 0) {
				remainingChange = remainingChange % 25;

			}
			changeDime = remainingChange / 10;

			if (changeDime > 0) {
				remainingChange = remainingChange % 10;

			}
			changeNickel = remainingChange / 5;

			if (changeNickel > 0) {
				remainingChange = remainingChange % 5;

			}

			changePenny = remainingChange;

			System.out.println("Your resulting change to dispense is: $" + (double) amountReturned + " \n" + billsTwenty
					+ " :Twenty Dollar Bills \n" + billsTen + " :Ten Dollar Bills \n" + billsFive
					+ " :Five Dollar Bills \n" + billsOne + " :One Dollar Bills \n" + changeQuarter + " :Quarters \n"
					+ changeDime + " :Dimes \n" + changeNickel + " :Nickels \n" + changePenny + " :Pennies");

			if (tenderedAmount == priceAmount) { // if amount given from
													// customer to cashier is
													// exact then...
				System.out.print("Exact amount, no change needed.");
			} else if (tenderedAmount < priceAmount) { // if amount given from
														// customer to cashier
														// is too little then...
				System.out.print("Please request more money from the customer");
			}

		}
	}
}

// Need a method to define how much change in amount tendered
// Need a method to return a correct amount message when the customer provides
// the exact amount

// Need a method to return an error when the customer provides too little money

// Need a method for if amount tendered by customer was too much money to
// display the amount of dollars and coins that should be given to the customer

// FOR FUN ONLY OPTION Need a method to return a change teller message (pocket
// the change, i.e. ChangeBurglar) when customer provides too much money
