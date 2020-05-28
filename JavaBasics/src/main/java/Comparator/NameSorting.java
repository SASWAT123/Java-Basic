package Comparator;

import java.util.Comparator;

public class NameSorting implements Comparator<Movie>{

	public int compare(Movie s1,Movie s2){  
		return s1.getName().compareTo(s2.getName());  
		}  
}
