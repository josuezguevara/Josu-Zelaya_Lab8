package josuezelaya_lab8;


import javafx.scene.control.ProgressBar;
import josuezelaya_lab8.Hadas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Hilo extends Thread{
    private ProgressBar p1;
    private ProgressBar p2;
    private Hadas hada1;
    private Hadas hada2;
    private boolean vive;
    private boolean runs;

    public Hilo() {
    }

    public Hilo(ProgressBar p1, ProgressBar p2, Hadas hada1, Hadas hada2) {
        this.p1 = p1;
        this.p2 = p2;
        this.hada1 = hada1;
        this.hada2 = hada2;
        this.vive = true;
        this.runs = true;
    }

    public ProgressBar getP1() {
        return p1;
    }

    public void setP1(ProgressBar p1) {
        this.p1 = p1;
    }

    public ProgressBar getP2() {
        return p2;
    }

    public void setP2(ProgressBar p2) {
        this.p2 = p2;
    }

    public Hadas getHada1() {
        return hada1;
    }

    public void setHada1(Hadas hada1) {
        this.hada1 = hada1;
    }

    public Hadas getHada2() {
        return hada2;
    }

    public void setHada2(Hadas hada2) {
        this.hada2 = hada2;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }
    public void run() {
        while (vive) {
            if (runs) {
                if (hada1 instanceof Salamandras && ((hada2 instanceof Hamadriades))) {
                    hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
                } else if (((hada1 instanceof Lamias) || (hada1 instanceof Silfides)) && (hada2 instanceof Hamadriades)) {
                    if (hada1 instanceof Lamias) {
                        hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.42))));
                    }
                    if (hada1 instanceof Silfides) {
                        hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
                    }
                } else {
                    hada2.setSalud(hada2.getSalud() - (hada1.getPoder()));
                }
                if (hada2 instanceof Salamandras && ((hada1 instanceof Hamadriades))) {
                    hada1.setSalud((int) (hada1.getSalud() - (hada1.getPoder() + (hada2.getPoder() * 0.37))));
                } else if (((hada2 instanceof Lamias) || (hada2 instanceof Silfides)) && (hada1 instanceof Hamadriades)) {
                    if (hada2 instanceof Lamias) {
                        hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.42))));
                    }
                    if (hada2 instanceof Silfides) {
                        hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37))));
                    }
                } else {
                    hada1.setSalud(hada1.getSalud() - (hada2.getPoder()));
                }
            }
        }
    }
}
