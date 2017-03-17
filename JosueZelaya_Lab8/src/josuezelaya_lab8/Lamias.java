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
public class Lamias extends Hadas{
    private double aleta;
    private double num_branquias;
    

    public Lamias() {
        super();
    }

    public Lamias(double aleta, double num_branquias, String Nombre, double altura, double edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        if (aleta<=5){
        this.aleta = aleta;
        }else{
            JOptionPane.showMessageDialog(null, "No mayor a 5");
        }
        if (num_branquias<=8){
        this.num_branquias = num_branquias;
        }else{
            JOptionPane.showMessageDialog(null, "No mas de 8");
        }
    }

    public double getAleta() {
        return aleta;
    }

    public void setAleta(double aleta) {
        this.aleta = aleta;
    }

    public double getNum_branquias() {
        return num_branquias;
    }

    public void setNum_branquias(double num_branquias) {
        this.num_branquias = num_branquias;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    @Override
    public void Ataque(Hadas hada) {
        double salud1;
        salud1=hada.getSalud()-57.0;
        hada.setSalud(salud1);
    }
    
    
}
