package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Movie theMovie = Movie.getMovie("Science","StarWars");
        theMovie.watchMovie();*/

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter type ( A for adventure, C for comedy, " +
                    "S for science fiction, or Q to quit ");
            String type = s.nextLine();
            if("Qq".contains(type)) break;
            System.out.print("Enter movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
            break;
        }


    }
}
