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
public abstract class Hadas {
    private String Nombre;
    private double altura;
    private double edad;
    private double salud;
    private double poder;

    public Hadas() {
    }

    public Hadas(String Nombre, double altura, double edad, double salud, double poder) {
        this.Nombre = Nombre;
        this.altura = altura;
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    public abstract void Ataque(Hadas hada);
}
