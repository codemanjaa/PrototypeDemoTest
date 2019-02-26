public class ShallowCopyDemo {

    public static void main(String a[]){

        Movie movies = new Movie();

        System.out.println(movies.getTitle());
        movies.setTitle("Star wars");

        System.out.println(movies.getTitle());

        System.out.println(movies);

        System.out.println("After shallow copying.....");


            Movie tamilMovie = (Movie)movies.clone();
            System.out.println(tamilMovie);


    }
}
// Movie@610455d6
// Movie@511d50c0