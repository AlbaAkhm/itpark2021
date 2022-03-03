package lesson10.convertation;

import lesson10.Convertable;

public class FromCelsiusToFahrenheit implements Convertable {

    @Override
    public double converter(double value) {
        return value * X + Y;
    }
}
