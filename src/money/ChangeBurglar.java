package money;

import java.util.Scanner;

public class ChangeBurglar {

	public static void main(String[] args) {
		
		double priceAmount;
		double tenderedAmount;
		double tooLittleMoney;
		double tooMuchMoney;
		double remainingChange;
		
		int billsTwenty;
		int billsOne;
		int changeQuarter;
		int changeDime;
		int changeNickel;
		int changePenny;
		
		
		
		
		System.out.println("Please enter the price of the merchandise.");
		Scanner kb = new Scanner(System.in);
		if (kb != null)
		{
		priceAmount = kb.nextDouble();
		System.out.println("The price of the merchandise is: $" + priceAmount);
		System.out.println("============================================");
		System.out.println("Please enter the amount of money tendered by the customer");
		tenderedAmount = kb.nextDouble();
		while (tenderedAmount !=  priceAmount){
		}
		kb.close();
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

// Notes
// Maybe use 2d arrays to create the change tables for the amounts of money
