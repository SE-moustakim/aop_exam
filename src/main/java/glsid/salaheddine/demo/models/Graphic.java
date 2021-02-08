package glsid.salaheddine.demo.models;

import glsid.salaheddine.demo.aspect.MyLog;
import glsid.salaheddine.demo.observer.Observer;

public abstract class Graphic implements Observer {
    @MyLog
    public abstract void ajouter();
    @MyLog
    public abstract void supprimer();
    @MyLog
    public abstract void afficher();
}
