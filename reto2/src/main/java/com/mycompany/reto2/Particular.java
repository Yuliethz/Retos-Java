/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2;

/**
 *
 * @author yulie
 */
public class Particular extends Vehiculo{
    private String color;
    public Particular(int Velocidad, int CantidadPasajeros, String Placa, String TipoCombustible) {
        super(Velocidad, CantidadPasajeros, Placa, TipoCombustible);
    }
    Particular(){
        
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     *
     * @return 
     */
    
    @Override
    //imprimir lo que tiene particular 
    public String imprimir(){
        return "\tVehículo Particular - Placa: " + this.getPlaca()
                +"\n\tvelocidad: "  + this.getVelocidad() 
                 + "\n\tpasajeros: " +this.getCantidadPasajeros()+
                 "\n\tcolor: " +this.color;
        
    }
}
