package com.challegen.converso.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApis {
    public String buscaConversion(String monedaOrigen, String monedaDestino, double valor) {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5218c5b28a23cd05b9b2466b/pair/" +
                    monedaOrigen + "/" + monedaDestino + "/" + valor);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            
            return jsonObject.get("conversion_result").getAsString();

        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al conectar con la API: " + e.getMessage());
            throw new RuntimeException("Error en la conexión con la API", e);
        }
    }
}
