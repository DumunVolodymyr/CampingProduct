package ua.lviv.iot.camping.models;

public class Tent extends CampingProduct {
    public enum TentForm {
        LODGE, HEMISPHERE, MAQUEE

    }

    public enum Construction {
        ONE_STORY, TWO_STORY

    }

    private int capacity;
    private Construction construction;
    private TentForm tentForm;

    public Tent() {
    }

    public Tent(final double price, final double weight,
            final String producerName,
            final int capacity, final Construction construction,
            final TentForm tentForm) {
        super(price, weight, producerName);
        this.capacity = capacity;
        this.construction = construction;
        this.tentForm = tentForm;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(final Construction construction) {
        this.construction = construction;
    }

    public TentForm getTentForm() {
        return tentForm;
    }

    public void setTentForm(final TentForm tentForm) {
        this.tentForm = tentForm;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(capacity + " " + construction + " " + tentForm);
    }

}
