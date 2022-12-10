package com.mycompany.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.model.Brand;
import com.mycompany.model.Cart;
import com.mycompany.model.Category;
import com.mycompany.model.LoginResponse;
import com.mycompany.model.Product;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GET {
    final OkHttpClient client = new OkHttpClient();
    
    public Type CartType = new TypeToken<Cart>(){}.getType();    
    public Type LoginResponseType = new TypeToken<LoginResponse>(){}.getType();

    public Type ArrayProduct = new TypeToken<ArrayList<Product>>(){}.getType();
    public Type ArrayCategory = new TypeToken<ArrayList<Category>>(){}.getType();
    public Type ArrayBrand = new TypeToken<ArrayList<Brand>>(){}.getType();

    public Gson gson = new Gson();
    public ArrayList<Product> GetProduct(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            ArrayList<Product> list;
            list = gson.fromJson(response.body().charStream(), ArrayProduct);
            return list;
        }
    }
    public ArrayList<Product> GetProductByText(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            ArrayList<Product> list;
            list = gson.fromJson(response.body().charStream(), ArrayProduct);
            return list;
        }
    }
    public Cart GetCart(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            Cart cart;
            cart = gson.fromJson(response.body().charStream(), CartType);
            return cart;
        }
    }
    
    public ArrayList<Category> GetCategory(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().charStream(), ArrayCategory);
             
        }
    }
    public ArrayList<Brand> GetBrand(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().charStream(), ArrayBrand);
             
        }
    }
}