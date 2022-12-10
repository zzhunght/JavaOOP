
package com.mycompany.model;

public class AddToCart {
    public String cartId;
    public String productId;
    public Integer amount;

    public AddToCart() {
    }

    public AddToCart(String cartId, String productId, Integer amount) {
        this.cartId = cartId;
        this.productId = productId;
        this.amount = amount;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" + "\"cartId\":\"" + cartId + "\", \"productId\":\"" + productId + "\", \"amount\":" + amount + '}';
    }
    
    
}
