package glsid.salaheddine.demo.observer;

import glsid.salaheddine.demo.aspect.MyLog;
import glsid.salaheddine.demo.aspect.SecuredAspect;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable{

    private List<Observer> observers = new ArrayList<Observer>();

    private int couleurContour;
    private int couleurSurface;
    private int epaisseur;


    public Parametrage(int couleurContour, int couleurSurface, int epaisseur) {
        this.couleurContour = couleurContour;
        this.couleurSurface = couleurSurface;
        this.epaisseur = epaisseur;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
    }

    public int getCouleurSurface() {
        return couleurSurface;
    }

    public void setCouleurSurface(int couleurSurface) {
        this.couleurSurface = couleurSurface;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    @MyLog
    @SecuredAspect(roles = {"ADMIN"})
    public void remove(Observer observer) {

    }



    @MyLog
    @SecuredAspect(roles = {"ADMIN"})
    public void add(Observer observer) {

    }

    public void notifyObservers() {

    }
}
