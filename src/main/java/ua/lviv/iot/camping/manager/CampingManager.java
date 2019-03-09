package ua.lviv.iot.camping.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ua.lviv.iot.camping.models.CampingProduct;

public class CampingManager implements Comparator<CampingProduct> {
    private ArrayList<CampingProduct> products;

    public CampingManager() {
        products = new ArrayList<CampingProduct>();
    }

    public CampingManager(ArrayList<CampingProduct> products) {
        this.products = products;
    }

    public void showCampingProducts() {
        for (CampingProduct campingProduct : products) {
            campingProduct.show();
        }
    }

    public ArrayList<CampingProduct> findByPriceLowerThen() {
        products.sort(Comparator.comparing(CampingProduct::getPrice));
        return this.products;
    }

    public void sortCampingProductByWeight() {
        products.sort(Comparator.comparing(CampingProduct::getWeight));
    }

    public void sortCampingProductByWeight(boolean reverse) {

        if (reverse)
            products.sort(Comparator.comparing(CampingProduct::getWeight).reversed());
        else
            products.sort(Comparator.comparing(CampingProduct::getWeight));
    }

    public void sortCampingProductByProducerName() {
        products.sort(Comparator.comparing(CampingProduct::getProducerName));
    }

    public void sortCampingProductByProducerName(boolean reverse) {
        if (reverse)
            products.sort(Comparator.comparing(CampingProduct::getProducerName).reversed());
        else
            products.sort(Comparator.comparing(CampingProduct::getProducerName));
    }

    @Override
    public int compare(CampingProduct cp1, CampingProduct cp2) {
        return Double.compare(cp1.getPrice(), cp2.getPrice());
    }

    public void addCampingProduct(CampingProduct cp) {
        products.add(cp);
    }
}
