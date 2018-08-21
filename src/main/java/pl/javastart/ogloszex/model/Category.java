package pl.javastart.ogloszex.model;

import java.util.List;

public class Category {
    private long id;
    private String name;
    private String description;
    private List<Offer> offerList;

    public Category(){
    }

    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<Offer> getOfferList(){
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }
}
