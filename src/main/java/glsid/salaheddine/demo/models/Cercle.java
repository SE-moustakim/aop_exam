package glsid.salaheddine.demo.models;

import glsid.salaheddine.demo.aspect.MyLog;
import glsid.salaheddine.demo.aspect.SecuredAspect;
import glsid.salaheddine.demo.observer.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Cercle extends Graphic implements Serializable {

    private double rayon;
    private Point point;

    @MyLog
    public double getSurface(){
        return (Math.PI * rayon * rayon);
    }

    public double getCirconference(){
        return 2 * Math.PI * rayon;
    }

    public void update() {

    }

    @MyLog
    @SecuredAspect(roles = {"ADMIN"})
    public void update(Observable observable) {

    }

    public void ajouter() {

    }

    public void supprimer() {

    }

    public void afficher() {
        System.out.println("cercle");
    }
}
