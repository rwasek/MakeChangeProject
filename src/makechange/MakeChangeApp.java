package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Cash Register application!\n");

		System.out.println("What is the price of the item being purchased in dollars?: ");
		double price = kb.nextDouble();
		System.out.println("How much money was tendered by the customer to pay for this item?");
		double tendered = kb.nextDouble();
		double change = userInput(price, tendered);
		if (change > 0) {
			System.out.println("Your change is " + change);
		} else if (change == 0) {
			System.out.print(" Enjoy your item!");
		} else {
			System.out.println("Fine be that way, Goodbye!");
		}
		kb.close();
	}

	public static double userInput(double price, double tendered) {
		Scanner kb = new Scanner(System.in);
		String response;

		while (tendered < price || tendered == price) {

			if (tendered == price) {
				System.out.print("Perfect, that's the exact amount. ");
				break;
			} else if (tendered < price) {
				System.out.println(
						"ERROR: Sorry, that is not enough money to cover the price of the item!\nWant to try a larger amount? (Y/N)");
				response = kb.next();

				if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("yes")) { // entry for no
					System.out.println(
							"Ok let's try a larger amount. How much money was tendered by the customer to pay for this item?");
					tendered = kb.nextDouble();

				} else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("no")) {
					break;
				}

			}
			kb.close();
		}
		return (tendered - price);
	}

}
