/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto1yulieth;

import java.util.Scanner;

/**
 *
 * @author yulie
 */
public class reto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //solicitar cantidad de elementos comprados
        int cantidad = sc.nextInt();
        //solicitar el precio de los elementos 
        int precio_compra = sc.nextInt();

        int costo = costoenvio(precio_compra);
        //int precio_volsa = cant_volsas(cantidad);
        int volsa= cant_volsas(cantidad);
        int precioVolsas= precioVolsas(cantidad,volsa); 
        int precio_final = precio_final(precio_compra, costo, precioVolsas);
        String texto= numeroatexto(volsa);
        //salidas
        System.out.println(precio_compra);
        System.out.println(costo);
        System.out.println(precioVolsas);
        System.out.println(precio_final);
        System.out.println(texto);
    }

    public static int costoenvio(int precio_total) {
        int precio_envio;
        if (precio_total < 50000) {
            precio_envio = 8000;
        } else if (precio_total >= 50000 && precio_total <= 200000) {
            precio_envio = (int) (precio_total * 0.03);
        } else {
            precio_envio = 0;
        }
        return precio_envio;

    }

    public static int cant_volsas(int cantidad) {
        //1 bolsa contiene 3 elementos
        int volsas = cantidad / 3;
        
        //no divisibles entre 3 - elementos ocuparan una bols
        if (cantidad % 3 != 0) {
            volsas = volsas + 1;

        }
        return volsas;

    }
    
    public static int precioVolsas(int cantidad, int volsas) {
        int precio_volsas = volsas * 100;
        //no divisibles entre 3 - elementos ocuparan una bolsa

        //if (cantidad % 3 != 0) {
            //precio_volsas = precio_volsas + 100;

        //}
        return precio_volsas;
    }
    

    public static int precio_final(int precio_total, int costo, int precio_volsa) {
        int suma_total = precio_total + costo + precio_volsa;
        return suma_total;
    }

    public static String numeroatexto(int cant_volsas) {
// Método que dado un número me lo devuelve en texto		
        switch (cant_volsas) {
            case 1:
                return "una";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 0:
                return "cero";
            case 10:
                return "diez";
            default:
                return "";
        }

    }
}
