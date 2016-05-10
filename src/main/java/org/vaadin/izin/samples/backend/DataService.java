package org.vaadin.izin.samples.backend;

import java.util.Collection;

import org.vaadin.izin.samples.backend.data.Category;
import org.vaadin.izin.samples.backend.data.GunlukIzin;
import org.vaadin.izin.samples.backend.data.Product;
import org.vaadin.izin.samples.backend.data.YillikIzin;
import org.vaadin.izin.samples.backend.mock.MockDataService;

/**
 * Back-end service interface for retrieving and updating product data.
 */
public abstract class DataService {

    public abstract Collection<Product> getAllProducts();
    
    public abstract Collection<YillikIzin> getAllYillikIzin();
    public abstract Collection<GunlukIzin> getAllGunlukIzin();

    public abstract Collection<Category> getAllCategories();

    public abstract void updateProduct(Product p);

    public abstract void deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public static DataService get() {
        return MockDataService.getInstance();
    }

}
