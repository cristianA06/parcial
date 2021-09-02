/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje.abstrat;

import udem.edu.co.peaje.interfaces.Vehiculos;

/**
 *
 * @author Cristian Avila
 */
public abstract class Otros implements Vehiculos{
    
    private String placa;
    private String marca;

    public Otros(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
