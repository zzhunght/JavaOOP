package com.mycompany.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.model.AddToCartResponse;
import com.mycompany.model.LoginResponse;
import com.mycompany.model.RegisterResponse;
import com.mycompany.model.UpdateProd;
import java.io.IOException;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class POST {
  public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public Gson gson = new Gson();
   
    final OkHttpClient client = new OkHttpClient();
    public Type LoginResponseType = new TypeToken<LoginResponse>(){}.getType();    
    public Type UpdateProdResponseType = new TypeToken<UpdateProd>(){}.getType();    
    public Type RegisterResponseType = new TypeToken<RegisterResponse>(){}.getType();    
    public Type AddToCartResponseType = new TypeToken<AddToCartResponse>(){}.getType();




    public LoginResponse Login(String json) throws IOException {
        String url = "http://localhost:5000/user/login";
        RequestBody body = RequestBody.create(JSON,json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
            
            return gson.fromJson(response.body().charStream(),LoginResponseType);
        }
    }
    public AddToCartResponse AddToCart(String json) throws IOException {
        RequestBody body = RequestBody.create(JSON,json);
        String url = "http://localhost:5000/cart";
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().charStream(),AddToCartResponseType);
            
        }
    }
    public UpdateProd UpdateProd(String url,String json) throws IOException {
        RequestBody body = RequestBody.create(JSON,json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().charStream(),UpdateProdResponseType);
            
        }
    }
    public RegisterResponse Register(String url,String json) throws IOException {
        RequestBody body = RequestBody.create(JSON,json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        try (Response response = client.newCall(request).execute()) {
            return gson.fromJson(response.body().charStream(),RegisterResponseType);
            
        }
    }
}