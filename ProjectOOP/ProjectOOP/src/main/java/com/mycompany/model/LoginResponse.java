
package com.mycompany.model;


public class LoginResponse {
    public boolean success;
    public User user;

    public LoginResponse(boolean success, User user) {
        this.success = success;
        this.user = user;
    }

    public LoginResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LoginResponse{" + "success=" + success + ", user=" + user + '}';
    }
    
    
}
