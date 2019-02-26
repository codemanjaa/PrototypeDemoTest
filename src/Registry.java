import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();


    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try{

            item = (Item) (items.get(type)).clone();

        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    public HashMap getItems(){
        return (HashMap) this.items;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Singam");
        movie.setPrice(25.00);
        movie.setRuntime("2.30 Hours");

        items.put("Movie", movie );

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(145.99);
        book.setTitle("Gang of 4");
        items.put("Book", book);


        Album album = new Album();
        album.setTitle("Revolution");
        album.setNumberOfTracks(25);
        album.setPrice(124.99);
        items.put("Album", album);
    }
}
