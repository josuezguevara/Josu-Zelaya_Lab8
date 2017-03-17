/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab8;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Salamandras extends Hadas{
private double alas;

    public Salamandras() {
        super();
    }

    public Salamandras(double alas, String Nombre, double altura, double edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        if (alas>=16){
        this.alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "No menor de 16");
        }
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    @Override
    public void Ataque(Hadas hada) {
     double salud=hada.getSalud()-71.0;
     hada.setSalud(salud);
    }
    
}
