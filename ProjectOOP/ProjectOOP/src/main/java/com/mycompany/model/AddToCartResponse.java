
package com.mycompany.model;

public class AddToCartResponse {
    public boolean success;

    public AddToCartResponse(boolean success) {
        this.success = success;
    }

    public AddToCartResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "AddToCartResponse{" + "success=" + success + '}';
    }
    
}
