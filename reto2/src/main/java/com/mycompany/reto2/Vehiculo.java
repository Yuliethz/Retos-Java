/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto2;

/**
 *
 * @author yulie
 */
public class Vehiculo {
    //atributos 
    private int Velocidad;
    private int CantidadPasajeros;
    private String Placa;
    private String TipoCombustible;
    
    //constructor
    Vehiculo(int Velocidad,int CantidadPasajeros,String Placa, String TipoCombustible ){
        this.Velocidad= Velocidad;
        this.CantidadPasajeros= CantidadPasajeros;
        this.Placa= Placa;
        this.TipoCombustible= TipoCombustible;
        
    }

    Vehiculo(){
        
    }
    
   

    /**
     * @return the Velocidad
     */
    public int getVelocidad() {
        return Velocidad;
    }

    /**
     * @param Velocidad the Velocidad to set
     */
    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    /**
     * @return the CantidadPasajeros
     */
    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    /**
     * @param CantidadPasajeros the CantidadPasajeros to set
     */
    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the TipoCombustible
     */
    public String getTipoCombustible() {
        return TipoCombustible;
    }

    /**
     * @param TipoCombustible the TipoCombustible to set
     */
    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }
    
    
     public String imprimir(){
         //System.out.println("\n Vehiculo Particular - Placa: " + this.getPlaca() 
                //+"\n velocidad: "  + this.getVelocidad() + "\\n pasajeros: " +this.getCantidadPasajeros());
        return  "\tVehículo Particular - Placa: " + this.getPlaca()
                +"\n\tvelocidad: "  + this.getVelocidad() 
                 + "\n\tpasajeros: " +this.getCantidadPasajeros();
         //System.out.println("\n Vehiculo Particular - Placa: " + this.getPlaca() 
                //+"\n velocidad: "  + this.getVelocidad() + "\\n pasajeros: " +this.getCantidadPasajeros());
        
        
    }
}
