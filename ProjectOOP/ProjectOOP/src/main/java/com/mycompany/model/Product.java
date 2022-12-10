package com.mycompany.model;

public class Product {
    public String id;
    public String name;
    public String description;
    public String discount;
    public String image;
    public Integer price;
    public Brand Brand;
    public Category Category;

    public Product() {
    }
    
    
    
    public Product(String id, String name, String description, String discount, String image, Integer price, Brand Brand, Category Category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.Brand = Brand;
        this.Category = Category;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category Category) {
        this.Category = Category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return Brand.brand;
    }

    public void setBrand(Brand Brand) {
        this.Brand = Brand;
    }

    @Override
    public String toString() {
        return "{" +id + ","+ name + "," + description + "," +image  +  ", " + price + "," + Brand.brand +"," + discount + '}';
    }
    
    
}
