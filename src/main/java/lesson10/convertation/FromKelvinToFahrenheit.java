package lesson10.convertation;

import lesson10.Convertable;
import lesson10.Temperature;

public class FromKelvinToFahrenheit implements Convertable {
    @Override
    public double converter(Temperature value) {
        return (value.getValue() - INDEX) * X + Y;
    }
}
