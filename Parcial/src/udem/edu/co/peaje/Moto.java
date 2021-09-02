/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje;

import udem.edu.co.peaje.abstrat.Otros;

/**
 *
 * @author Cristian Avila
 */
public class Moto extends Otros{

    private double valorPeaje;
    
    public Moto(String placa, String marca) {
        super(placa, marca);
        this.valorPeaje = 10000;
    }

    @Override
    public void terrestre() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String aux = "{\"Moto\":\n"
                + "    {\"valorPeaje\":\n"
                + "        \""+this.valorPeaje+"\",\n"
                + "        \"placa\":\n"
                + "        \""+super.getPlaca()+"\",\n"
                + "        \"marca\":\n"
                + "        \""+super.getPlaca()+"\"\n"
                + "    }\n"
                + "}";
        
        return "soy una moto con placa " +super.getPlaca()+ " y debo pagar de peaje " + valorPeaje +"\n"+aux;
    }
    
    
}
