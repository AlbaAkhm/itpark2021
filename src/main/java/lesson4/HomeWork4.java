package lesson4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        //этот метод будет извлекать корень квадратный из введенного числа num

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число num = ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Нельзя извлекать квадратный корень из отрицательного числа");
            System.exit(0);
        }

        int squareRoot = 0;
        int k = 1;
        int i = num;
        while (i > 0) {
            i = i - k;
            k = k + 2;
            squareRoot = squareRoot + 1;
        }
        if (num != squareRoot * squareRoot) {
            System.out.println("Вы ввели число, из которого квадратный корень не извлекается целым числом");
        } else {
            System.out.println("Корень квадратный из числа" + " " + num + " будет равен" + " " + squareRoot);
        }
    }
}
