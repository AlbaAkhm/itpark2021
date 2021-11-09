package lesson3;

import java.util.Scanner;

public class HomeWorkFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i = i + 1;
        }
        System.out.println("Факториал числа " + " " + n + " " + " равен" + " " + fact);
    }
}
