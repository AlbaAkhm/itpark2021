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
        System.out.println("Введите конвертирумое значение: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        double newValue = scanner.nextDouble();
        System.out.println("Выберите шкалу, из которой конвертирем значение : CELSIUS, KELVIN, FAHRENHEIT");
        String fromScale = scanner.next();
        System.out.println("Выберите шкалу, в которую конвертирем значение : CELSIUS, KELVIN, FAHRENHEIT");
        String toScale = scanner.next();




        if (fromScale.equals("CELSIUS")) {
            if (toScale.equals("KELVIN")){
                System.out.println();
            } else if (toScale.equals("FAHRENHEIT")){
                System.out.println();
            }else{
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
        if (fromScale.equals("KELVIN")) {
            if (toScale.equals("CELSIUS")){
                System.out.println();
            } else if (toScale.equals("FAHRENHEIT")){
                System.out.println();
            }else{
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
        if (fromScale.equals("FAHRENHEIT")) {
            if (toScale.equals("CELSIUS")){
                System.out.println();
            } else if (toScale.equals("KELVIN")){
                System.out.println();
            }else{
                System.out.println("Нет такой шкалы, либо введена та же самая шкала");
            }
        }
    }
}
