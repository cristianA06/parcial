/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje;

import udem.edu.co.peaje.abstrat.Camiones;

/**
 *
 * @author Cristian Avila
 */
public class Camion extends Camiones{

    private double valorPeaje;
    
    public Camion(String placa, String marca, int numeroEjes) {
        super(placa, marca, numeroEjes);
        if (numeroEjes == 1) {
            this.valorPeaje = 30000;
        }else{
            this.valorPeaje = 40000;
        }
    }
    
    

    @Override
    public void terrestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "soy un camion con "+super.getNumeroEjes()+" con placa " +super.getPlaca()+ " y debo pagar de peaje " + valorPeaje ;
    }
    
    
}
