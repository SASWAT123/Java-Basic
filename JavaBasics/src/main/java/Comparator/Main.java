package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Movie> movie = Arrays.asList(
				new Movie("Force Awakens", 8.3, 2015),
				new Movie("Star Wars", 8.7, 1977),
				new Movie("Empire Strikes Back", 8.8, 1980),
				new Movie("Return of the Jedi", 8.4, 1983)			
			);
		
		System.out.println("Before sorting");
		for(Movie m : movie) {
			System.out.println(m);
		}
		
		NameSorting nameSorting = new NameSorting();
		RatingSorting ratingSorting = new RatingSorting();
		
		System.out.println("After name sorting");
		Collections.sort(movie, nameSorting);
		
		System.out.println("After name sorting");
		for(Movie m : movie) {
			System.out.println(m);
		}
		
		System.out.println("After rating sorting");
		Collections.sort(movie, ratingSorting);
		
		System.out.println("After rating sorting");
		for(Movie m : movie) {
			System.out.println(m);
		}
		
	}

}
