package pl.javastart.ogloszex.repository;


import org.springframework.stereotype.Repository;
import pl.javastart.ogloszex.model.Category;
import pl.javastart.ogloszex.model.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {
    private List<Category> categories;

    public CategoryRepository(){
        categories = new ArrayList<>();
        Offer off1 = new Offer("Telewizor", "Dobry telewizor", "https://static5.mediaexpert.pl/temp/thumbs-new/2/products/796/telewizor-samsung-led-ue50mu6172_848796_2557786_350x350w50.jpg", 499.99);
        Offer off2 = new Offer("Sokowirowka", "Mieli wszystko", "https://f.allegroimg.com/s512/06f1fd/17d1637a4b0d9607346e62ff005f", 209.99);
        Offer off3 = new Offer ("Sluchawki", "Idealne na dluga podroz", "http://www.navcomm.eu/323-large_default/sluchawki-lotnicze-deluxe.jpg", 999.99);
        Category category1 = new Category("Elektronika", "Produkty elektroniczne");
        category1.setOfferList(Arrays.asList(off1, off2, off3));
        categories.add(category1);

        Offer off4 = new Offer("Regal", "Ma 4 rzedy", "https://images.obi.pl/product/PL/1500x1500/599447_1.jpg", 249.99);
        Offer off5 = new Offer("Kanapa", "Wygodna", "https://9.allegroimg.com/s512/03f723/dca7e90c40d1bbfc8bad9c7bda79", 1009.99);
        Offer off6 = new Offer("Lozko", "Da sie spac", "http://vojanmeble.pl/152-thickbox_default/lozko-havana-h21-dab-sonoma.jpg", 355.99);
        Category category2 = new Category("Meble", "Produkty meblarskie");
        category2.setOfferList(Arrays.asList(off4, off5, off6));
        categories.add(category2);
    }

    public List<Category> findAll(){
        return categories;
    }

    public Category finsById(int id){
        return categories.get(id);
    }

    public void save(Category category){
        categories.add(category);
    }
}
