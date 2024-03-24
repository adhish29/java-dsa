package Miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie {
    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

public class SortingEx {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Collections.sort(list, (o1, o2) -> o2.getYear() - o1.getYear());
        Collections.sort(list,
                (o1, o2) -> o1.getRating() < o2.getRating() ? 1 : o1.getRating() > o2.getRating() ? -1 : 0);
        System.out.println("Movies after sorting : ");

        for (Movie movie : list)
            System.out.println(movie.getYear() + " "
                    + movie.getRating() + " "
                    + movie.getName() + " ");

    }
}
