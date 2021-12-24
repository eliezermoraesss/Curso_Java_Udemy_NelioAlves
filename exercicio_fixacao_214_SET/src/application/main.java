package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Students> set = new HashSet<>();

		System.out.print("How many students for course A? ");
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}

		System.out.print("How many students for course B? ");
		N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}

		System.out.print("How many students for course C? ");
		N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}
		System.out.println("Total students: " + set.size());

		sc.close();
	}
}
