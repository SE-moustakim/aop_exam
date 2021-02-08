package glsid.salaheddine.demo.observer;

public interface Observable {
    public void remove(Observer observer);
    public void add(Observer observer);
    public void notifyObservers();
}
