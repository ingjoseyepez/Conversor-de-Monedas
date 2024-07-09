package com.challegen.converso.principal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion = "COP";
        
            try {
                URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2edd70d3e42e27a0386dbf47/latest/"+opcion);

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();
                JsonElement jsonElement = JsonParser.parseString(json);
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                System.out.println(json);
            } catch (NumberFormatException | IOException | InterruptedException e) {
                System.out.println("Ocurrió un error: ");
                throw new RuntimeException("Error" + e.getMessage());
            }

        }
    }
