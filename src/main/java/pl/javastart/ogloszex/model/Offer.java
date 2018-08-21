package pl.javastart.ogloszex.model;

public class Offer {
    private long id;
    private String title;
    private String description;
    private String urlImg;
    private double price;


    public Offer(){
    }

    public Offer(String title, String description, String urlImg, double price){

        this.title = title;
        this.description = description;
        this.urlImg = urlImg;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
