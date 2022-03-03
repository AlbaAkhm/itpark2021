package lesson10.convertation;

import lesson10.Convertable;

public class FromKelvinToCelsius implements Convertable {
    @Override
    public double converter(double value) {
        return value - INDEX;
    }
}
