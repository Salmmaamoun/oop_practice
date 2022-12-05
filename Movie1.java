/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task4_rout;

/**
 *
 * @author HP
 */
public class Movie1 {
    
    private String title;
    private String studio;
    private static String rating;

    public Movie1(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie1(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public ArrayList<Movie1>()getPG(ArrayList<Movie1> movies) {
        return movies;
    }
    public static void main(String[] args) {
        Movie1 m1 = new Movie1("CasinRoyale", "Eon Productions", "PG13");
    }
}
