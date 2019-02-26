public class ShallowCopyDemo {

    public static void main(String a[]){

        Item movie = new Movie();

        System.out.println(movie.getTitle());
        movie.setTitle("Star wars");

        System.out.println(movie.getTitle());

        System.out.println(movie);

        System.out.println("After shallow copying.....");

        try {
            Item tamilMovie = (Movie)movie.clone();
            System.out.println(tamilMovie.getTitle());
            System.out.println(tamilMovie);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
// Movie@610455d6
// Movie@511d50c0