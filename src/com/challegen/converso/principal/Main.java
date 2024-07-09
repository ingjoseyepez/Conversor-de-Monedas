package com.challegen.converso.principal;

import com.challegen.converso.modelos.Conversion;
import com.challegen.converso.service.ConexionApis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el valor a convertir: ");
        double valor = Double.parseDouble(lectura.nextLine());
        String monedaOrigen = "COP";
        String monedaDestino = "USD";

        // Crear instancia de Conversor y establecer valores
        Conversion conversor = new Conversion();
        conversor.obtenerValores(monedaOrigen, monedaDestino, valor);

        // Mostrar información del conversor
        System.out.println(conversor);

        // Usar la clase ConexionApis para obtener la conversión
        ConexionApis conexionApis = new ConexionApis();
        String resultado = conexionApis.buscaConversion(monedaOrigen, monedaDestino, valor);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
