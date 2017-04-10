package money;

import java.util.Scanner;

public class ChangeBurglar {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double priceAmount, tenderedAmount, amountReturned; // declarations
		int remainingChange; // declarations

		while (true) {
			System.out.println("============================================");
			System.out.println("Please enter the price of the merchandise:");
			priceAmount = (kb.nextDouble() * 100); // cashier enters price of
													// merchandise ---
													// multiplied by
													// 100 for easier
													// calculations
			System.out.println("The price of the merchandise is: $" + priceAmount / 100);
			System.out.println("============================================");
			System.out.println("Please enter the amount of money tendered by the customer:");
			tenderedAmount = (kb.nextDouble() * 100); // cashier receives X
														// amount
														// from customer ---
														// multiplied
														// by 100 for easier
														// calculations

			if (tenderedAmount < priceAmount) { // if amount given from
				// customer to cashier
				// is too little then...
				System.out.println("***ERROR!*** Please request more money from the customer. I'm restarting now...");

			}
			{

				if (tenderedAmount == priceAmount) { // if amount given from
					// customer to cashier is
					// exact then...
					System.out.println("Exact amount, no change needed.");
					System.out.println("============================================");
					System.out.println("Please restart the system.");
					break;
				}

				amountReturned = (tenderedAmount - priceAmount); // change given
																	// back to
																	// customer
																	// = amount
																	// customer
																	// gave -
																	// price of
																	// merchandise
				remainingChange = (int) amountReturned; // remaining change for
														// machine
														// to process =
														// amountReturned
														// cased into an (int)
														// in order
														// to multiply by 100
														// for easier
														// calculations

				if (tenderedAmount > priceAmount) { // if amount given by
													// customer to
													// cashier is more than the
													// price of
													// the merchandise then...
					remainingChange = (int) amountReturned;
					int billsTwenty, billsTen, billsFive, billsOne, changeQuarter, changeDime, changeNickel,
							changePenny;
					amountReturned = (tenderedAmount - priceAmount) / 100;

					billsTwenty = remainingChange / 2000;

					System.out.println("Your resulting change to dispense is: $" + (double) amountReturned);

					if (billsTwenty > 0) {
						remainingChange = remainingChange % 2000;
						System.out.println(billsTwenty + ": Twenty Dollar Bills");
					}
					billsTen = remainingChange / 1000;

					if (billsTen > 0) {
						remainingChange = remainingChange % 1000;
						System.out.println(billsTen + ": Ten Dollar Bills");
					}
					billsFive = remainingChange / 500;

					if (billsFive > 0) {
						remainingChange = remainingChange % 500;
						System.out.println(billsFive + ": Five Dollar Bills");
					}
					billsOne = remainingChange / 100;

					if (billsOne > 0) {
						remainingChange = remainingChange % 100;
						System.out.println(billsOne + ": One Dollar Bills");
					}
					changeQuarter = remainingChange / 25;

					if (changeQuarter > 0) {
						remainingChange = remainingChange % 25;
						System.out.println(changeQuarter + ": Quarters");

					}
					changeDime = remainingChange / 10;

					if (changeDime > 0) {
						remainingChange = remainingChange % 10;
						System.out.println(changeDime + ": Dimes");

					}
					changeNickel = remainingChange / 5;

					if (changeNickel > 0) {
						remainingChange = remainingChange % 5;
						System.out.println(changeNickel + ": Nickels");

					}
					changePenny = remainingChange / 1;

					if (changePenny > 0) {
						System.out.println(changePenny + ": Pennies");
					}

				}
			}
		}
		kb.close();
	}

}
