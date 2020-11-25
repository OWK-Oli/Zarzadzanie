package com.selgird;

public class Cloth extends Product {
    protected String size;
    protected String material;
    protected Cloth(String size, String material){
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
}
