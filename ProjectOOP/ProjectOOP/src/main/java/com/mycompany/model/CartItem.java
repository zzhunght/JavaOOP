
package com.mycompany.model;

public class CartItem {
    public String id;
    public String cartId;
    public String productId;
    public String amount;
    public Product product;

    public CartItem() {
    }

    public CartItem(String id, String cartId, String productId, String amount, Product product) {
        this.id = id;
        this.cartId = cartId;
        this.productId = productId;
        this.amount = amount;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setProductId(String ProductId) {
        this.productId = ProductId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartItem{" + "id=" + id + ", cartId=" + cartId + ", ProductId=" + productId + ", amount=" + amount + ", product=" + product + '}';
    }
    
}
