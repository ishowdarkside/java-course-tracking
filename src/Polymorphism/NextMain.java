package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Comedy comedy = (Comedy) Movie.getMovie("C","Airplane");
        comedy.watchMovie();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");

        Object unkownObject = Movie.getMovie("S","Airplane");

        if(unkownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unkownObject;
            c.watchComedy();
        } else if(unkownObject instanceof Adventure){
            ((Adventure)unkownObject).watchAdventure();
        } else if (unkownObject instanceof  ScienceFiction syfy){
            syfy.watchScienceFiction();
        }


    }
}
