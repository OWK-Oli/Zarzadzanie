package com.selgird;

public class Product {
    protected String id;
    protected String productName;
    protected float price;
    protected float weight;
    protected String color;
    protected int productCount;
    protected Product(String id, String productName, float price, float weight, String color, int productCount){
        this.color = color;
        this.id = id;
        this.price = price;
        this.productCount = productCount;
        this.productName = productName;
        this.weight = weight;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    public String getId(){
        return id;
    }
    public String getProductName(){
        return productName;
    }
    public float getPrice() {
        return price;
    }
    public float getWeight() {
        return weight;
    }
    public String getColor(){
        return color;
    }
    public int getProductCount() {
        return productCount;
    }
}
