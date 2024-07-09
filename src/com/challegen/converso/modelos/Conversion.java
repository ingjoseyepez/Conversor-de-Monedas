package com.challegen.converso.modelos;

import com.challegen.converso.service.ConexionApis;

import java.util.Scanner;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double valor;
    ConexionApis conversion;
    Scanner lectura = new Scanner(System.in);
    public Conversion(ConexionApis conversion) {
        this.conversion = conversion;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void obtenerValores(String monedaBase, String monedaDestino){
        this.monedaOrigen = monedaBase;
        this.monedaDestino = monedaDestino;
        System.out.println("Ingrese el valor que deseas convertir");
        this.valor = Double.parseDouble(lectura.nextLine());
    }

    public String Mensajes() {
        String mensaje = getMonedaOrigen().toUpperCase() + " " + getValor() + " equivale a: " + getMonedaDestino().toUpperCase() + " " + conversion.buscaConversion(getMonedaOrigen(), getMonedaDestino(), getValor());
        System.out.println(mensaje);
        return mensaje;
    }
}
