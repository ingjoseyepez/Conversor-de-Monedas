package com.challegen.converso.principal;

import com.challegen.converso.service.ConexionApis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el valor a convertir: ");
        double valor = Double.parseDouble(lectura.nextLine());
        String monedaOrigen = "COP";
        String monedaDestino = "USD";
        ConexionApis conexionApis = new ConexionApis();
        String resultado = conexionApis.buscaConversion(monedaOrigen, monedaDestino, valor);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
