package lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        if (a == 0) {
            do {
                System.out.println("Первый коэффициент не может быть 0");
                System.out.print("a = ");
                a = in.nextDouble();
            }
            while (a == 0);
        }

        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        double disk = ((Math.pow(b, 2)) - (4 * a * c));

        if (disk < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (disk == 0) {
            double x = ((-b) / (2 * a));
            System.out.println("x = " + x);
        } else {
            double x1 = ((-b + Math.sqrt(disk)) / (2 * a));
            double x2 = ((-b - Math.sqrt(disk)) / (2 * a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        in.close();
    }
}



