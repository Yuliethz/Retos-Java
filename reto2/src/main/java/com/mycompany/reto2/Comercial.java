/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2;

/**
 *
 * @author yulie
 */
public class Comercial extends Vehiculo{
    private int cargaMaxima; 
    public Comercial(int Velocidad, int CantidadPasajeros, String Placa, String TipoCombustible) {
        super(Velocidad, CantidadPasajeros, Placa, TipoCombustible);
    }

    Comercial(){
        
    }
    /**
     * @return the cargaMaxima
     */
    public int getCargaMaxima() {
        return cargaMaxima;
    }

    /**
     * @param cargaMaxima the cargaMaxima to set
     */
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    @Override
    public String imprimir(){
         return "\tVehículo Comercial - Placa: " + this.getPlaca() 
                +"\n\tvelocidad: "  + this.getVelocidad() 
                 + "\n\tpasajeros: " +this.getCantidadPasajeros() 
                 +"\n\tCarga máxima: " +this.getCargaMaxima();
    
    
    }
}
