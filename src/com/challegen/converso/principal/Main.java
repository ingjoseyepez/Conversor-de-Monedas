package com.challegen.converso.principal;
import com.challegen.converso.modelos.Conversion;
import com.challegen.converso.service.ConexionApis;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;
        ConexionApis consulta = new ConexionApis();
        Conversion calculos = new Conversion(consulta);


        String menu = """
                \n
                      *** Conversor de Monedas ***
                ********** Menus de Opciones **********
                
                1) Peso Colombiano => Dólar Estadounidense
                2) Peso Colombiano => Euro
                3) Peso Colombiano => Bolivares 
                4) Dólar Estadounidense => Peso Colombiano 
                5) Euro => Peso Colombiano 
                6) Bolivares => Peso Colombiano 
                
                8) Salir
                ---------------------------------------------
                """;

        while (opcionElegida != 8) {
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());


                switch (opcionElegida) {
                    case 1:
                        calculos.obtenerValores("COP", "USD");
                        System.out.println("Resultado de la conversion es: "+ calculos.Mensajes());
                        break;
                    case 2:
                        calculos.obtenerValores("COP", "EUR");
                        System.out.println("Resultado de la conversion es: " + calculos.Mensajes());
                        break;
                    case 3:
                        calculos.obtenerValores("COP", "VES");
                        System.out.println("Resultado de la conversion es: "+ calculos.Mensajes());
                        break;
                    case 4:
                        calculos.obtenerValores("USD", "COP");
                        System.out.println("Resultado de la conversion es: "+ calculos.Mensajes());
                        break;
                    case 5:
                        calculos.obtenerValores("EUR", "COP");
                        System.out.println("Resultado de la conversion es: "+ calculos.Mensajes());
                        break;
                    case 6:
                        calculos.obtenerValores("VES", "COP");
                        System.out.println("Resultado de la conversion es: " + calculos.Mensajes());
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }
            }  catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }

        System.out.println("Finalizando programa");
    }
}
