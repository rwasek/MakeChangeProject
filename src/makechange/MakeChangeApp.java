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
		change = (double) Math.round(change * 100) / 100;
		int changeInPennies = (int) (change * (100));

		int nextChange = twenties(changeInPennies);

		nextChange = tens(nextChange);

		nextChange = fives(nextChange);

		nextChange = singles(nextChange);

		nextChange = quarters(nextChange);

		nextChange = dimes(nextChange);

		nextChange = nickels(nextChange);

		nextChange = pennies(nextChange);

		kb.close();
	}

	public static double userInput(double price, double tendered) {
		Scanner kb = new Scanner(System.in);

		while (tendered < price || tendered == price) {

			if (tendered == price) {
				System.out.print("Perfect, that's the exact amount. ");
				break;
				
			} else if (tendered < price) {
				System.out.println("ERROR: Sorry, that is not enough money to cover the price of the item!"
						+ "\nWant to try a larger amount? (Y/N)");
				String response = kb.next();

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

	public static int twenties(int change) {
		int nextChange = change;
		int numOfTwenties = 0;

		if (nextChange >= 2000) {
			numOfTwenties = nextChange / 2000;
			nextChange = nextChange - 2000 * (numOfTwenties);

		}

		if (numOfTwenties == 1 && nextChange != 0) {
			System.out.print(numOfTwenties + " twenty dollar bill, ");
			
		} else if (numOfTwenties > 1 && nextChange == 0) {
			System.out.print(numOfTwenties + " twenty dollar bills.");
			
		} else if (numOfTwenties > 0 && nextChange != 0) {
			System.out.print(numOfTwenties + " twenty dollar bills, ");
			
		} else if (numOfTwenties == 1 && nextChange == 0) {
			System.out.print(numOfTwenties + " twenty dollar bill.");
			
		} else if (numOfTwenties == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int tens(int change) {
		int nextChange = change;
		int numOfTens = 0;

		if (nextChange >= 1000) {
			numOfTens = nextChange / 1000;
			nextChange = nextChange - 1000 * (numOfTens);
		}
		
		if (numOfTens > 0 && nextChange != 0) {
			System.out.print(numOfTens + " ten dollar bill, ");
			
		} else if (numOfTens == 1 && nextChange == 0) {
			System.out.print(numOfTens + " ten dollar bill.");
			
		} else if (numOfTens > 1 && nextChange == 0) {
			System.out.print(numOfTens + " ten dollar bills.");
			
		} else if (numOfTens == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int fives(int change) {
		int nextChange = change;
		int numOfFives = 0;

		if (nextChange >= 500) {
			numOfFives = nextChange / 500;
			nextChange = nextChange - 500 * (numOfFives);
		}
		
		if (numOfFives > 0 && nextChange != 0) {
			System.out.print(numOfFives + " five dollar bill, ");
			
		} else if (numOfFives == 1 && nextChange == 0) {
			System.out.print(numOfFives + " five dollar bill.");
			
		} else if (numOfFives > 1 && nextChange == 0) {
			System.out.print(numOfFives + " five dollar bills.");
			
		} else if (numOfFives == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int singles(int change) {
		int nextChange = change;
		int numOfSingles = 0;

		if (nextChange >= 100) {
			numOfSingles = nextChange / 100;
			nextChange = nextChange - 100 * (numOfSingles);
		}
		
		if (numOfSingles == 1 && nextChange != 0) {
			System.out.print(numOfSingles + " single dollar bill, ");
			
		} else if (numOfSingles > 1 && nextChange == 0) {
			System.out.print(numOfSingles + " single dollar bills.");
			
		} else if (numOfSingles > 0 && nextChange != 0) {
			System.out.print(numOfSingles + " single dollar bills, ");
			
		} else if (numOfSingles == 1 && nextChange == 0) {
			System.out.print(numOfSingles + " single dollar bill.");
			
		} else if (numOfSingles == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int quarters(int change) {
		int nextChange = change;
		int numOfQuarters = 0;

		if (nextChange >= 25) {
			numOfQuarters = nextChange / 25;
			nextChange = nextChange - 25 * (numOfQuarters);
		}
		
		if (numOfQuarters == 1 && nextChange != 0) {
			System.out.print(numOfQuarters + " quarters, ");
			
		} else if (numOfQuarters > 1 && nextChange == 0) {
			System.out.print(numOfQuarters + " quarters.");
			
		} else if (numOfQuarters > 0 && nextChange != 0) {
			System.out.print(numOfQuarters + " quarters, ");
			
		} else if (numOfQuarters == 1 && nextChange == 0) {
			System.out.print(numOfQuarters + " quarter.");
			
		} else if (numOfQuarters == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int dimes(int change) {
		int nextChange = change;
		int numOfDimes = 0;

		if (nextChange >= 10) {
			numOfDimes = nextChange / 10;
			nextChange = nextChange - 10 * (numOfDimes);
		}
		
		if (numOfDimes == 1 && nextChange != 0) {
			System.out.print(numOfDimes + " dimes, ");
			
		} else if (numOfDimes > 1 && nextChange == 0) {
			System.out.print(numOfDimes + " dimes.");
			
		} else if (numOfDimes > 0 && nextChange != 0) {
			System.out.print(numOfDimes + " dimes, ");
			
		} else if (numOfDimes == 1 && nextChange == 0) {
			System.out.print(numOfDimes + " dime.");
			
		} else if (numOfDimes == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int nickels(int change) {
		int nextChange = change;
		int numOfNickels = 0;

		if (nextChange >= 5) {
			numOfNickels = nextChange / 5;
			nextChange = nextChange - 5 * (numOfNickels);
		}
		
		if (numOfNickels == 1 && nextChange != 0) {
			System.out.print(numOfNickels + " nickels, ");
			
		} else if (numOfNickels > 1 && nextChange == 0) {
			System.out.print(numOfNickels + " nickels.");
			
		} else if (numOfNickels > 0 && nextChange != 0) {
			System.out.print(numOfNickels + " nickels, ");
			
		} else if (numOfNickels == 1 && nextChange == 0) {
			System.out.print(numOfNickels + " nickel.");
			
		} else if (numOfNickels == 0) {
			System.out.print("");
		}
		return nextChange;
	}

	public static int pennies(int change) {
		int nextChange = change;
		int numOfPennies = 0;

		if (nextChange >= 1) {
			numOfPennies = nextChange / 1;
			nextChange = nextChange - 1 * (numOfPennies);
		}
		if (numOfPennies == 1 && nextChange != 0) {
			System.out.print(numOfPennies + " pennies, ");
			
		} else if (numOfPennies > 1 && nextChange == 0) {
			System.out.print(numOfPennies + " pennies.");
			
		} else if (numOfPennies > 0 && nextChange != 0) {
			System.out.print(numOfPennies + " pennies, ");
			
		} else if (numOfPennies == 1 && nextChange == 0) {
			System.out.print(numOfPennies + " penny.");
			
		} else if (numOfPennies == 0) {
			System.out.print("");
		}
		return nextChange;
	}
}