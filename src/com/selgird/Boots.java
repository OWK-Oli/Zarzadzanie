package com.selgird;

public class Boots extends Product {
    protected int size;
    protected boolean isNaturalSkin;
    protected Boots(int size, boolean isNaturalSkin){
        super(id, productName, price, weight, color, productCount);
        this.isNaturalSkin = isNaturalSkin;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public boolean getIsNaturalSkin(){
        return  isNaturalSkin;
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
                ", isNaturalSkin='" + isNaturalSkin + '\'' +
                + '}';
    }
}
