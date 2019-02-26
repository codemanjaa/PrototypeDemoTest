import java.util.HashMap;

public class PrototypeDemo {


    public static void main(String a[]){

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");

       // movie.setTitle("Inception");
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());


        System.out.println("Movie clone...........................");
        System.out.println("");

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Oscar on the way");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());


        System.out.println("");


        System.out.println("Album clone...........................");

        System.out.println("");
        Album album = (Album) registry.createItem("Album");
        System.out.println(album);
        System.out.println(album.getTitle());

        System.out.println("");

        System.out.println("Album2 clone...........................");

        System.out.println("");
        Album album2 = (Album) registry.createItem("Album");
        System.out.println(album2);
        System.out.println(album2.getTitle());

        System.out.println("");
        System.out.println("");


        System.out.println("Book clone...........................");
        System.out.println("");
        Book book = (Book) registry.createItem("Book");
        System.out.println(book);
        System.out.println(book.getTitle());

    }
}
