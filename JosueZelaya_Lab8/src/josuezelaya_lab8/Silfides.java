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
public class Silfides extends Hadas{
private double alas;

    public Silfides() {
        super();
    }

    public Silfides(double alas, String Nombre, double altura, double edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        if (alas>=6){
        this.alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "NO menor a 6");
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
        double salud=hada.getSalud()-67.0;
        hada.setSalud(salud);
    }
    
}
