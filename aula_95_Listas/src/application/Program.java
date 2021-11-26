package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Jesus");
		list.add("Eliezer");
		list.add("Nadia");
		list.add("Salvador");
		list.add("Maria");
		list.add(2, "Eidy");

		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}	
		System.out.println("-------------------");
		//list.remove(5);
		list.removeIf(x -> x.charAt(0) == 'S');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		list.removeIf(x -> x.charAt(0) == 'Z');
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);
	}

}
