/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yulie
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //leo la linea de entrada que contiene todos los datos 
        int op;
        
        do {
            String s = sc.nextLine();
            String line[] = s.split("&");
            op = Integer.parseInt(line[0]);
            if (op==1) {
                //se puede añadir un nuevo vehiculoll
                //asignamos los datos a las variables correspondientes
                Agregar_vehiculo(line);

            } else if (op==2) {
                listar();
            }
        } while (op != 3);

    }

    public static void Agregar_vehiculo(String line[]) {
        //asignamos los valores 
        String tipoVehiculo = line[1];
        int NumeroPasajeros = Integer.parseInt(line[2]);
        int velocidadMaxima = Integer.parseInt(line[3]);
        String placa = line[4];
        // si es Comercial
        if ("Comercial".equals(tipoVehiculo)) {
            int peso_maximo = Integer.parseInt(line[5]);
            //creamos y se asignan valores a los atributos del nuevo objeto
            Comercial c = new Comercial();
            //llenamos el objeto con los datos   
            c.setCantidadPasajeros(NumeroPasajeros);
            c.setVelocidad(velocidadMaxima);
            c.setPlaca(placa);
            c.setCargaMaxima(peso_maximo);
            vehiculos.add(c);
            //c.imprimir();
        } else if ("Particular".equals(tipoVehiculo)) {
            String color = line[5];
            Particular p = new Particular();
            p.setCantidadPasajeros(NumeroPasajeros);
            p.setVelocidad(velocidadMaxima);
            p.setPlaca(placa);
            p.setColor(color);
            //añadimos los elementos al arraylist
            vehiculos.add(p);
        }
    }

    public static void listar() {
        //listar el inventario de vehiculos 
        System.out.println("***Inventario de vehículos***");
        for (int i = 0; i < vehiculos.size(); i++) {
            //imprimir cada uno de los vehiculos 
            System.out.println(vehiculos.get(i).imprimir());
            //get accedemos a los elementos del ArrayList
        }
    }

}
