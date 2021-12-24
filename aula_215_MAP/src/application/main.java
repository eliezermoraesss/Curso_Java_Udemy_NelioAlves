package application;

import java.util.Map;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Eliezer");
		cookies.put("email", "eliezer.moraes@outlook.com");
		cookies.put("phone", "981374137");

		cookies.remove("email");
		cookies.put("phone", "996090636");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
