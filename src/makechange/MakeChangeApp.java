package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Cash Register application!\n");
		System.out.println("What is the price of the item being purchased in dollars?: ");
		float price = kb.nextFloat();
		System.out.println("How much money was tendered by the customer to pay for this item?");
		float tendered = kb.nextFloat();

		float change = userInput(price, tendered);
	

		while (change != 0) {

			if (change >= 20f) {
				float quotient = (change / 20f);
				change = (change % 20f);
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
			} else if (change >= 10f && change < 20f) {
				float q2 = (change / 10f);
				change = (change % 10f);
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
			} else if (change >= 5f && change < 10f) {
				float q3 = (change / 5f);
				change = (change % 5f);
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
			} else if (change >= 1f && change < 5f) {
				float q4 = (change / 1f);
				change = (change % 1f);
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
			} else if (change >= .25f && change < 1f) {
				float q5 = (change / .25f);
				change = (change % .25f);
				change += 0.001f;
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
			} else if (change >= .10f && change < .25f) {
				float q6 = (change / .10f);
				change = (change % .10f);
				change += 0.001f;
				int dimeCoin = (int) (q6);
				System.out.print(dimeCoin + " dime");
				if (dimeCoin > 1) {
					System.out.print("s");
				}
				if (change > 0.005f) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .05f && change < .10f) {
				float q7 = (change / .05f);
				change = (change % .05f);
				change += 0.001f;
				int nickelCoin = (int) (q7);
				System.out.print(nickelCoin + " nickel");
				if (nickelCoin > 1) {
					System.out.println("s");
				}
				if (change > 0.001) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			} else if (change >= .01f && change < .05f) {
				float q8 = (change / .01f);
				change = (change % .01f);
				change += 0.001f;
				int pennyCoin = (int) (q8);
				if (pennyCoin == 1) {
					System.out.print(pennyCoin + " penny.");
				}
				if (pennyCoin > 1) {
					System.out.print(pennyCoin + " pennies.");
				}

			} else {
				System.out.print("");

				break;
			}

			System.out.print("");

		}
		kb.close();
	}

	public static float userInput(float price, float tendered) {
		Scanner kb = new Scanner(System.in);
		String response;

		while (tendered < price || tendered == price) {

			if (tendered == price) {
				System.out.print("Perfect, that's the exact amount. ");
				break;
			} else if (tendered < price) {
				double amtshort = price - tendered;
				System.out.println("ERROR: Sorry, that is not enough money to cover the price of the item!"
						+ "\nWant to try a larger amount? (Y/N)");
				response = kb.next();

				if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("yes")) { // entry for no
					System.out.println(
							"Ok let's try a larger amount. How much money was tendered by the customer to pay for this item?");
					tendered = kb.nextFloat();

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
