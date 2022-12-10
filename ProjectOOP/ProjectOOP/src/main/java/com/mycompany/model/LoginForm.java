
package com.mycompany.model;

public class LoginForm {
    public String email;
    public String password;

    public LoginForm() {
    }
    
    
    
    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" + "\"email\":\"" + email + "\", \"password\":\"" + password + "\"}";
    }
    
    
}
