/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuezelaya_lab8;

/**
 *
 * @author usuario
 */
public class Hamadriades extends Hadas{
    private double salud_extra;

    public Hamadriades() {
        super();
    }

    public Hamadriades(String Nombre, double altura, double edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
    }

    public Hamadriades(double salud_extra, String Nombre, double altura, double edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        this.salud_extra = 173.0;
    }

    public double getSalud_extra() {
        return salud_extra;
    }

    public void setSalud_extra(double salud_extra) {
        this.salud_extra =salud_extra;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
    @Override
    public void Ataque(Hadas hada) {
       double salud=hada.getSalud()-78.0;
       hada.setSalud(salud);
    }
    
}
