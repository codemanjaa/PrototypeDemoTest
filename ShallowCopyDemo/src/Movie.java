public class Movie implements Cloneable {

    private String title;
    private double price;
    private String runtime;


    public Movie clone(){
        try {
            return (Movie) super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();

        }

        return null;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
