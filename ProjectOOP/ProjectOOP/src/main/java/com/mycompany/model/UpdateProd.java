package com.mycompany.model;

public class UpdateProd {
    public boolean success;

    public UpdateProd() {
    }

    public UpdateProd(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    
}
