package ua.lviv.iot.camping;

import ua.lviv.iot.camping.manager.CampingManager;
import ua.lviv.iot.camping.models.*;
import ua.lviv.iot.camping.models.Backpack.*;
import ua.lviv.iot.camping.models.SleepingBag.*;
import ua.lviv.iot.camping.models.Tent.*;

public class main {
    public static void main(final String[] args) {
        CampingManager cm = new CampingManager();
        cm.addCampingProduct(new Tent(500, 20, "Reebok",
                4, Construction.ONE_STORY, TentForm.LODGE));
        cm.addCampingProduct(new Backpack(500, 15, "Adidas",
                40, BackpackType.BAG, Color.RED));
        cm.addCampingProduct(new SleepingBag(500, 30, "Aer", "Blanket",
                2, SleepingBagMaterial.WOOL));

        System.out.println("CP 1");
        cm.showCampingProducts();

        System.out.println("CP 2");
        cm.sortCampingProductByWeight(true);
        cm.showCampingProducts();

        System.out.println("CP 3");
        cm.sortCampingProductByProducerName();
        cm.showCampingProducts();
    }

}
