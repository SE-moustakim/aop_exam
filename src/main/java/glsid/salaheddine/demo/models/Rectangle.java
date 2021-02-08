package glsid.salaheddine.demo.models;

import glsid.salaheddine.demo.aspect.MyLog;
import glsid.salaheddine.demo.observer.Observable;

import java.io.Serializable;

public class Rectangle extends Graphic implements Serializable {

    private double heuteur;
    private double largeur;

    public Rectangle(double heuteur, double largeur) {
        this.heuteur = heuteur;
        this.largeur = largeur;
    }

    public void ajouter() {

    }

    public void supprimer() {

    }

    public void afficher() {

    }

    @MyLog
    public double getSurface(){
        return heuteur * largeur;
    }
    @MyLog
    public double getCirconference(){
        return 2 * (heuteur + largeur);
    }

    @MyLog
    public void update() {

    }

    @Override
    public void update(Observable observable) {

    }
}
