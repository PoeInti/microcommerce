package fr.inti.microcommerce.dao;
import fr.inti.microcommerce.model.Product;

import java.util.List;

public interface ProductDao {
    // renvoie la liste complète de tous les produits
    public List<Product>findAll();

    public Product findById(int id);
    public Product save(Product product);
}
