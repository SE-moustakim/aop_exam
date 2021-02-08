package glsid.salaheddine.demo.models;

import glsid.salaheddine.demo.observer.Observable;

public class Point extends Graphic{

    private int x;
    private int y;

    public void ajouter() {

    }

    public void supprimer() {

    }

    public void afficher() {
        System.out.println("Point");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void update() {

    }

    @Override
    public void update(Observable observable) {

    }
}
