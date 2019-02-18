package ua.lviv.iot.camping.manager;

import java.util.ArrayList;
import java.util.Comparator;

import ua.lviv.iot.camping.models.CampingProduct;

public class CampingManager implements Comparator<CampingProduct>{
	private ArrayList<CampingProduct> products;
	
	public CampingManager() {
		products = new ArrayList<CampingProduct>();
	}
	
	public CampingManager(ArrayList<CampingProduct> products) {
		this.products = products;
	}
	
	public void ShowCampingProducts() {
		for (CampingProduct campingProduct : products) {
			campingProduct.Show();
		}
	}
	
	public ArrayList<CampingProduct> findByPriceLowerThen(){
		products.sort(Comparator.comparing(CampingProduct::getPrice));
		return this.products;
	}

	@Override
	public int compare(CampingProduct cp1, CampingProduct cp2) {
		return Double.compare(cp1.getPrice(), cp2.getPrice());
	}
}


