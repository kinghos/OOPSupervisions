package SV3;

import java.util.List;

class Rectangle extends Shape {
    List<ObserverBorder> observers;
    public void attach(ObserverBorder o) {observers.add(o);}
    public void detatch(ObserverBorder o) {observers.remove(o);}
    @Override
    public void draw() {
        for (ObserverBorder o : observers) {
            o.notifyObserver();
        }
    }

    public void drawBorder() {}
}
public class ObserverBorder {
    private Shape subject;
    public void notifyObserver() {
        ScreenRefresh.drawBorders();
    }

    public void setSubject(Shape subject) {
        this.subject = subject;
    }
}
