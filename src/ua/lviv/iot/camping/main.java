package ua.lviv.iot.camping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ua.lviv.iot.camping.models.*;
import ua.lviv.iot.camping.models.Backpack.*;
import ua.lviv.iot.camping.models.SleepingBag.*;
import ua.lviv.iot.camping.models.Tent.*;

public class main {
	public static void main(String[] args) {
		ArrayList<CampingProduct> cps = new ArrayList<CampingProduct>();
		cps.add(new Tent(500, 20, "Reebok", 4, Construction.ONE_STORY, TentForm.LODGE));
		cps.add(new Backpack(500, 15, "Adidas", 40, BackpackType.BAG, Color.RED));
		cps.add(new SleepingBag(500, 30, "Aer", "Blanket", 2, SleepingBagMaterial.WOOL));
		
		System.out.println("CP 1");
		for (CampingProduct campingProduct : cps) {
			campingProduct.Show();
		}
		
		Collections.sort(cps, new Comparator<CampingProduct>() {
			@Override
			public int compare(CampingProduct cp1, CampingProduct cp2) {
				return Double.compare(cp1.getWeight(), cp2.getWeight());
			}
		});
		
		System.out.println("CP 2");
		for (CampingProduct campingProduct : cps) {
			campingProduct.Show();
		}
		
		Collections.sort(cps, new Comparator<CampingProduct>() {
			@Override
			public int compare(CampingProduct cp1, CampingProduct cp2) {
				return cp1.getProducerName().compareTo(cp2.getProducerName());
			}
		});
		cps.sort((cp1, cp2) -> cp1.getProducerName().compareTo(cp2.getProducerName()));
		
		System.out.println("CP 3");
		for (CampingProduct campingProduct : cps) {
			campingProduct.Show();
		}
		
	}

}
