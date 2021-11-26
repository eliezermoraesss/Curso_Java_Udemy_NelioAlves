package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);

		if (escolha == 'y') {	
			
			System.out.print("Enter initial deposit value: ");
			double valorDeposito = sc.nextDouble();
			bankAccount = new BankAccount(numeroConta, nomeTitular, valorDeposito);
			
			
		} else {
			
			bankAccount = new BankAccount(numeroConta, nomeTitular);		
			
		}
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(bankAccount);
			
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double valorDeposito = sc.nextDouble();
			bankAccount.deposito(valorDeposito);
			System.out.println("Updated account data: ");
			System.out.println(bankAccount);
			
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double valorSaque = sc.nextDouble();
			bankAccount.saque(valorSaque);
			System.out.println("Updated account data: ");
			System.out.println(bankAccount);

			sc.close();
	}

}
