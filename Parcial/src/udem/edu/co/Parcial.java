/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import java.util.ArrayList;
import udem.edu.co.peaje.Automovil;
import udem.edu.co.peaje.Camion;
import udem.edu.co.peaje.Moto;
import udem.edu.co.peaje.interfaces.Vehiculos;

/**
 *
 * @author Cristian Avila
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Vehiculos> lista = new ArrayList<>();

        lista.add(new Automovil("ppp409", "Renault"));
        lista.add(new Moto("CXS789", "Yamaha"));
        lista.add(new Camion("KBU680", "Renault", 1));
        lista.add(new Camion("QOJ468", "Chevrolet", 2));

        for (Vehiculos autos : lista) {

            System.out.println(autos.toString());
        }
    }

}
