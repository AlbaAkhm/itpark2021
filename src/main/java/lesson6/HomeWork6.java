package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива = ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int length = scanner.nextInt();
        double[] array = array(length);
        System.out.println(Arrays.toString(array));
        double maxArray = maxArray(array);
        System.out.println("Максимальное значение = " + maxArray);
        double minArray = minArray(array);
        System.out.println("Минимальное значение = " + minArray);
        double averageArray = averageArray(array);
        System.out.println("Среднее значение = " + averageArray);

    }

    public static double[] array(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = (Math.random());
        }
        return array;
    }

    public static double maxArray(double[] array) {

        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double minArray(double[] array) {

        double min = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double averageArray(double[] array) {
        double summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
            }
        double averageArray;
        averageArray = summa / (array.length);
        return  averageArray;
    }

}


