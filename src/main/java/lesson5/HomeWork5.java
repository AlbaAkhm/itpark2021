package lesson5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.print("Введите параметр n = ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int n = scanner.nextInt();
        fibonacci(n);


}

    public static void fibonacci(int value) {
        if (value < 0){
            System.out.println("Параметр не может быть отрицательным");
        } else if (value == 1){
            System.out.println("1 - ый член последовательности Фибоначчи равен 1");
        } else {
        int x1 = 0;
        int x2 = 1;
        int summa = 0;

        for (int i = 1; i < value; i++) {
            summa = x1 + x2;
            x2 = summa;
            x1 = summa - x1;
        }
        System.out.println(value + "- ый член последовательности Фибоначчи равен " + summa);
        }
    }
}
