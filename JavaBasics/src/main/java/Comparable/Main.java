package Comparable;

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
		
		System.out.println("Before sorting using comparable");
		for(Movie m : movie) {
			System.out.println(m);
		}
		
		Collections.sort(movie);
		
		System.out.println("After sorting using comparable on year");
		for(Movie m : movie) {
			System.out.println(m);
		}
	}

}
