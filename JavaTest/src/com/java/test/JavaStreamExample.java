package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

;

public class JavaStreamExample {

	public static void main(String[] args) {

		List<String> players = Arrays.asList("Sachin", "Shewag", "Gangully", "Dravid", "Yuvraj", "Dhoni", "Virat");

		// Filter players whose name statrt with lettter "S"
		System.out.println("Players starts name with S :");
		players.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);

		// Use of Optional
		System.out.println("Any players starts name with D :");
		Optional<String> playersName = players.stream().filter(name -> name.startsWith("D")).findAny();

		playersName.ifPresent(System.out::println);

		// Use of map, append tendulkar in Sachin is there in list
		System.out.println("Append 'Tendulker' if player name is sachin :");
		players.stream().filter(name -> name.equals("Sachin")).map(str -> str + " Tendulker")
				.forEach(System.out::println);

		// Sort players by name in ascending order
		System.out.println("Sort players with name ascending order :");
		players.stream().sorted().forEach(System.out::println);

		// Sort players by name in descending order
		System.out.println("Sort players with name descending order :");
		players.stream().sorted((name1, name2) -> name2.compareTo(name1)).forEach(System.out::println);

		// flatMap Example :
		System.out.println("Merge all mobile brands of mobile dealers :");
		List<String> mobileBrands = Arrays.asList("Nokia", "Samsung", "Motoroll", "Apple", "LG", "Micromax", "OnePlus");
		List<MobileDealer> mobileDealerList = new ArrayList<>();
		for (int id = 101; id <=105; id++) {
			MobileDealer mobileDealer = new MobileDealer(id, "Dealer"+id, mobileBrands);
			mobileDealerList.add(mobileDealer);
		}
		
		 List<String> allBrands= mobileDealerList.stream().flatMap(dealer -> dealer.getMobileBrands().stream()).collect(Collectors.toList());
		 System.out.println("Size of Merge list : "+allBrands.size());
		 allBrands.stream().forEach(System.out::println);

	}

}
