package javaPractice.comparatorComparable;

import java.util.*;

public class Movie implements Comparable<Movie> {
    double rating;
    String name;
    int year;

    // Constructor
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Override compareTo to compare based on year. This will be default comparision
    // method. For other comparision behavior use Comparator
    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public class MovieRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            if (m1.rating > m2.rating)
                return 1;
            if (m1.rating < m2.rating)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        for (Movie m : list) {
            System.out.println(m.rating + " " + m.name + " " + m.year);
        }

    }

}