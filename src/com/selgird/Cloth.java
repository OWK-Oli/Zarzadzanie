package com.selgird;

public class Cloth extends Product {
    protected String size;
    protected String material;
    protected Cloth(String id, String productName, float price, float weight, String color, int productCount,String size, String material){
        super(id, productName, price, weight, color, productCount);
        this.material = material;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "Product: {" +
                "ID='" + id + '\'' +
                ", productName='" + productName + '\''
        ", price='" + price + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", quantiti='" + productCount + '\'' +
                ", material='" + material + '\'' +
                + '}';
    }
}
