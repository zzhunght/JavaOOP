package com.mycompany.model;

public class User {
    public String id;
    public String name;
    public String phone;
    public String address;
    public String email;
    public String gender;
    public Cart Carts;
    public User() {
    }
    
    public User(String id, String name, String phone, String address, String email, String gender) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }
    public User(String id, String name, String phone, String address, String email, String gender, Cart Carts) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.Carts = Carts;
    }

    public Cart getCarts() {
        return Carts;
    }

    public void setCarts(Cart Carts) {
        this.Carts = Carts;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" + 
                  "\"id\":\"" + id + "\", "
                + "\"name\":\"" + name + "\", "
                + "\"phone\":\"" + phone + "\", "
                + "\"address\":\"" + address + "\", "
                + "\"email\":\"" + email + "\", "
                + "\"gender\":\"" + gender + "\"}";
    }
    
    
}
