package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Eliezer");
		list.add("Edmar");
		list.add("Eidy");
		list.add("Antonio");
		list.add("Maria");
		list.add("Spoke");
		list.add("Layla");
		list.add(2, "teste");
		
		System.out.println(list);
		//list.remove("Edmar");
		System.out.println(list);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		//list.removeIf(x -> x.charAt(0) == 'E');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Index of Eliezer: " + list.indexOf("Eliezer"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'k').findFirst().orElse(null);
		System.out.println("-------------------------------------------");
		System.out.println(name);
		
	}
}
