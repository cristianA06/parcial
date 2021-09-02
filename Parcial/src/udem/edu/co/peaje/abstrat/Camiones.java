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
public abstract class Camiones implements Vehiculos{
    
    private String placa;
    private String marca;
    private int numeroEjes;

    public Camiones(String placa, String marca, int numeroEjes) {
        this.placa = placa;
        this.marca = marca;
        this.numeroEjes = numeroEjes;
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

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    
    
}
