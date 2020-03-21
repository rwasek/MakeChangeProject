package makechange;

import java.util.Scanner;
import java.lang.Math;


public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Cash Register application!\n");
		System.out.println("What is the price of the item being purchased in dollars?: ");
		double price = kb.nextDouble();
		System.out.println("How much money was tendered by the customer to pay for this item?");
		double tendered = kb.nextDouble();

		double change = userInput(price, tendered);
		
		change = (double)Math.round(change * 100)/100;

		while (change != 0) {

			if (change >= 20) {
				change = (double)Math.round(change * 100)/100;
				double quotient = (change / 20);
				change = (change % 20);
				int twentyBills = (int) (quotient);
				System.out.print(twentyBills + " twenty dollar bill");
				if (twentyBills > 1) {
					System.out.print("s");
				}
				if (change > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= 10 && change < 20) {
				change = (double)Math.round(change * 100)/100;
				double q2 = (change / 10);
				change = (change % 10);
				int tenBills = (int) (q2);
				System.out.print(tenBills + " ten dollar bill");
				if (tenBills > 1) {
					System.out.print("s");
				}
				if (change > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= 5 && change < 10) {
				change = (double)Math.round(change * 100)/100;
				double q3 = (change / 5);
				change = (change % 5);
				int fiveBills = (int) (q3);
				System.out.print(fiveBills + " five dollar bill");
				if (fiveBills > 1) {
					System.out.print("s");
				}
				if (change > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= 1 && change < 5) {
				change = (double)Math.round(change * 100)/100;
				double q4 = (change / 1);
				change = (change % 1);
				int singleBills = (int) (q4);
				System.out.print(singleBills + " one dollar bill");
				if (singleBills > 1) {
					System.out.print("s");
				}
				if (change > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .25 && change < 1) {
				change = (double)Math.round(change * 100)/100;
				double q5 = (change / .25);
				change = (change % .25);
				int quarterCoin = (int) (q5);
				System.out.print(quarterCoin + " quarter");
				if (quarterCoin > 1) {
					System.out.print("s");
				}
				if (change > 0.001) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .10 && change < .25) {
				change = (double)Math.round(change * 100)/100;
				double q6 = (change / .10);
				change = (change % .10);
				int dimeCoin = (int) (q6);
				System.out.print(dimeCoin + " dime");
				if (dimeCoin > 1) {
					System.out.print("s");
				}
				if (change > 0.005) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .05 && change < .10) {
				change = (double)Math.round(change * 100)/100;
				double q7 = (change / .05);
				change = (change % .05);
				int nickelCoin = (int) (q7);
				System.out.print(nickelCoin + " nickel");
				if (nickelCoin > 1) {
					System.out.println("s");
				}
				if (change > 0.005) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .001 && change < .05) {
				change = (double)Math.round(change * 100)/100;
				double q8 = (change / .01);
				change = (change % .01);
				int pennyCoin = (int) (q8);
				System.out.print(pennyCoin + " penn");

				if (pennyCoin <= 1) {
					System.out.println("y.");
				} else {
					System.out.print("ies.");
				}
			} else {
				System.out.print("");

				break;
			}

			System.out.print("");

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
				System.out.println("ERROR: Sorry, that is not enough money to cover the price of the item!"
						+ "\nWant to try a larger amount? (Y/N)");
				response = kb.next();

				if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("yes")) { // entry for no
					System.out.println(
							"Ok let's try a larger amount. How much money was tendered by the customer to pay for this item?");
					tendered = kb.nextDouble();

				} else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("no")) {
					System.out.println("Fine be that way, Goodbye!");
					break;
				}

			}
			kb.close();
		}
		return (tendered - price);
	}

}