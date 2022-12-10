
package com.mycompany.model;

import java.util.ArrayList;

public class Cart {
    public String id;
    public String userId;
    public ArrayList<CartItem> CartDetails;

    public Cart() {
    }

    public Cart(String id, String userId, ArrayList<CartItem> CartDetails) {
        this.id = id;
        this.userId = userId;
        this.CartDetails = CartDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<CartItem> getCartDetails() {
        return CartDetails;
    }

    public void setCartDetails(ArrayList<CartItem> CartDetails) {
        this.CartDetails = CartDetails;
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", userId=" + userId + ", CartDetails=" + CartDetails + '}';
    }
    
    
}
