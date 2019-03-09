package ua.lviv.iot.camping.models;

public abstract class CampingProduct {
    private  String producerName;
    private double price;
    private double weight;

    public CampingProduct() {
    }

    public CampingProduct(final double price, final double weight,
        final String producerName) {
        this.price = price;
        this.weight = weight;
        this.producerName = producerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(final String producerName) {
        this.producerName = producerName;
    }

    public void show() {
        System.out.println(price + " " + weight + " " + producerName);
    }

}
