package Comparable;

public class Movie implements Comparable<Movie>{
	
	private String name;
	private Double rating;
	private Integer year;
	
	public Movie(String name, Double d, Integer year) {
		super();
		this.name = name;
		this.rating = d;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}

	//Sort movie by year
	public int compareTo(Movie m) {
		return this.year - m.year;
	}
	
}
