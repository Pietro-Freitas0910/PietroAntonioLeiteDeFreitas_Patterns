package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void subscribe(TemperatureObserver o) {
        observers.add(o);
    }

    public void unsubscribe(TemperatureObserver o) {
        observers.remove(o);
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver o : observers) {
            o.onTemperatureChanged(temperature);
        }
    }
}
