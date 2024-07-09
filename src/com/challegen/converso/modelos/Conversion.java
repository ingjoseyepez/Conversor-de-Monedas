package com.challegen.converso.modelos;

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double valor;

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void obtenerValores(String monedaBase, String monedaDestino, double valor){
        this.monedaOrigen = monedaBase;
        this.monedaDestino = monedaDestino;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Conversor{" +
                "monedaOrigen='" + monedaOrigen + '\'' +
                ", monedaDestino='" + monedaDestino + '\'' +
                ", valor=" + valor +
                '}';
    }
}
