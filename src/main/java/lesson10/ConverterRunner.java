package lesson10;


import lesson10.convertation.FromCelsiusToKelvin;
import lesson10.convertation.FromCelsiusToFahrenheit;
import lesson10.convertation.FromKelvinToCelsius;
import lesson10.convertation.FromKelvinToFahrenheit;
import lesson10.convertation.FromFahrenheitToCelsius;
import lesson10.convertation.FromFahrenheitToKelvin;
import java.util.Scanner;

public class ConverterRunner {



    public static void main(String[] args) {


        String celsius = String.valueOf(TemperatureScale.CELSIUS).toLowerCase();
        String kelvin = String.valueOf(TemperatureScale.KELVIN).toLowerCase();
        String fahrenheit = String.valueOf(TemperatureScale.FAHRENHEIT).toLowerCase();



        System.out.println("Введите конвертирумое значение: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        double value = scanner.nextDouble();
        System.out.println("Выберите шкалу, из которой конвертирем значение : celsius, kelvin, fahrenheit");
        String fromScale = scanner.next();
        System.out.println("Выберите шкалу, в которую конвертирем значение : celsius, kelvin, fahrenheit");
        String toScale = scanner.next();





        if (fromScale.equals(celsius)) {
            if (toScale.equals(kelvin)){
                System.out.println("Результат: " + new FromCelsiusToKelvin().converter(value) + " градусов по Кельвину");
            } else if (toScale.equals(fahrenheit)){
                System.out.println("Результат: " + new FromCelsiusToFahrenheit().converter(value) + " градусов по Фаренгейту");
            }else {
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
        if (fromScale.equals(kelvin)) {
            if (toScale.equals(celsius)){
                System.out.println("Результат: " + new FromKelvinToCelsius().converter(value) + " градусов по Цельсию");
            } else if (toScale.equals(fahrenheit)){
                System.out.println("Результат: " + new FromKelvinToFahrenheit().converter(value) + " градусов по Фаренгейту");
            }else{
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
        if (fromScale.equals(fahrenheit)) {
            if (toScale.equals(celsius)){
                System.out.println("Результат: " + new FromFahrenheitToCelsius().converter(value) + " градусов по Цельсию");
            } else if (toScale.equals(kelvin)){
                System.out.println("Результат: " + new FromFahrenheitToKelvin().converter(value) + " градусов по Кельвину");
            }else{
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
    }
}
