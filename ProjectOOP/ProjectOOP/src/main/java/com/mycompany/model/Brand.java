
package com.mycompany.model;


public class Brand {
    public String id;
    public String brand;

    public Brand() {
    }
    
    public Brand(String id, String brand) {
        this.id = id;
        this.brand = brand;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand{" + "id=" + id + ", brand=" + brand + '}';
    }

   
    
}
