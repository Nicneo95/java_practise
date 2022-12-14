package day07;
// creating an app class
public class App {
    // defining attribute of a class
    private String name;
    private String category;
    private float rating;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "App [name=" + name + ", category=" + category + ", rating=" + rating + "]";
    }
    
}