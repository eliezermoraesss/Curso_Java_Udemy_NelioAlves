package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.BusinessException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		Account account = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.print("Enter amount of withdraw: ");
		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} 
		catch (BusinessException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
		finally {
			sc.close();
		}
	}
}
