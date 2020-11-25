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
}
