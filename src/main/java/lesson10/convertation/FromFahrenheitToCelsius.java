package lesson10.convertation;

import lesson10.Convertable;

public class FromFahrenheitToCelsius implements Convertable {
    @Override
    public double converter(double value) {
        return (value-Y) * (1/X);
    }
}
