package com.sample.main;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number to attempt the game ::");
		int attempt = scanner.nextInt();
		Random random = new Random();
		int winCount = 0;
		boolean flag = false;

		for (int i = 0; i < attempt; i++) {
			System.out.println("Please enter a number to limit to play each game :::");
			int limit = scanner.nextInt();

			for (int j = 0; j < limit; j++) {
				System.out.println("Please guess any number between range 1 to 100, your current limit is "
						+ (limit - j) + " and current attempt is = " + i);
				int userInput = scanner.nextInt();
				int generatedNumber = random.nextInt(1, 100);

				if (userInput == generatedNumber) {
					flag = true;
					System.out.println("Congratulations!!! you guessed correct number:::" + userInput);
					winCount++;
				} else if (userInput < generatedNumber) {
					System.out.println("Oh Sorry!! you guessed too low number::: generatedNumber = " + generatedNumber
							+ " and guessNUmber = " + userInput);
				} else {
					System.out.println("Oh Sorry!! you guessed too high number::: generatedNumber = " + generatedNumber
							+ " and guess number  = " + userInput);
				}

			}

		}

		scanner.close();
		if (flag == false) {
			System.out.println("Sorry you exceed the limit , you losed the game. Better luck next time");
		} else {
			System.out.println("Total game you won is = " + winCount);
		}

	}

}
