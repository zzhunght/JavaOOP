package com.mycompany.model;


public class NewProduct {
   public String name;
   public String description; 
   public String image; 
   public String BrandId; 
   public String CategoryId; 
   public Integer discount;
   public Integer price;

    public NewProduct() {
    }

   
    public NewProduct(String name, String description, String image, String BrandId, String CategoryId, Integer discount, Integer price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.BrandId = BrandId;
        this.CategoryId = CategoryId;
        this.discount = discount;
        this.price = price;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrandId() {
        return BrandId;
    }

    public void setBrandId(String BrandId) {
        this.BrandId = BrandId;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + 
                  "\"name\":\"" + name + "\", "
                + "\"description\":\"" + description + "\", "
                + "\"image\":\"" + image + "\", "
                + "\"BrandId\":\"" + BrandId + "\", "
                + "\"CategoryId\":\"" + CategoryId + "\", "
                + "\"discount\":\"" + discount + "\", "
                + "\"price\":\"" + price + "\"}";
    }
   
   
 
}
