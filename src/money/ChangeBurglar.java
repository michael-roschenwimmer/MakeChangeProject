package money;

import java.util.Scanner;

public class ChangeBurglar {

	public static void main(String[] args) {

		double priceAmount;
		double tenderedAmount;
		double tooLittleMoney;
		double tooMuchMoney;

		int remainingChange;
		int billsTwenty;
		int billsTen;
		int billsFive;
		int billsOne;
		int changeQuarter;
		int changeDime;
		int changeNickel;
		int changePenny;

		// moneyIsWrong(); // fix

		System.out.println("Please enter the price of the merchandise:");
		Scanner kb = new Scanner(System.in);
		if (kb != null) {
			priceAmount = kb.nextDouble();
			System.out.println("The price of the merchandise is: $" + priceAmount);
			System.out.println("============================================");
			System.out.println("Please enter the amount of money tendered by the customer:");
			tenderedAmount = kb.nextDouble();
			kb.close();

			double amountReturned = tenderedAmount - priceAmount;
			remainingChange = (int) (priceAmount * 100);

			billsTwenty = remainingChange / 100;
			remainingChange = remainingChange / 20;

			billsTen = remainingChange / 10;
			remainingChange = remainingChange / 10;

			billsFive = remainingChange / 5;
			remainingChange = remainingChange / 5;

			billsOne = remainingChange / 100;
			remainingChange = remainingChange % 100;

			changeQuarter = remainingChange / 25;
			remainingChange = remainingChange % 25;

			changeDime = remainingChange / 10;
			remainingChange = remainingChange % 10;

			changeNickel = remainingChange / 5;
			remainingChange = remainingChange % 5;

			changePenny = remainingChange / 1;
			remainingChange = remainingChange % 1;

			System.out.println("Your resulting change to dispense is: $" + amountReturned + " \n" + billsTwenty
					+ " :Twenty Dollar Bills \n" + billsTen + " :Ten Dollar Bills \n" + billsFive
					+ " :Five Dollar Bills \n" + billsOne + " :One Dollar Bills \n" + changeQuarter + " :Quarters \n"
					+ changeDime + " :Dimes \n" + changeNickel + " :Nickels \n" + changePenny + " :Pennies");

		}
	}

	// public static void moneyIsWrong(double tenderedAmount, double
	// priceAmount) {
	// while (tenderedAmount != priceAmount) {
	//
	// }
}

// Need a method to define how much change in amount tendered
// Need a method to return a correct amount message when the customer provides
// the exact amount

// Need a method to return an error when the customer provides too little money

// Need a method for if amount tendered by customer was too much money to
// display the amount of dollars and coins that should be given to the customer

// FOR FUN ONLY OPTION Need a method to return a change teller message (pocket
// the change, i.e. ChangeBurglar) when customer provides too much money
