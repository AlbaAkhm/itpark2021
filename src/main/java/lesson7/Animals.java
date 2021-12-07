package lesson7;

import java.util.Scanner;

public class Animals {
    String name;
    int maxRun;
    int maxSwim;

    public Animals() {
    }

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void Run() {
        System.out.print("Введите расстояние, которое потенциально должен пробежать " + this.name + " = ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int run = scanner.nextInt();
        if (run < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        } else if (run > this.maxRun) {
            System.out.println(this.name + " не сможет пробежать " + run + " метров");
        } else {
            System.out.println(this.name + " пробежал " + run + " метров");
        }
    }


    public void Swim() {
        System.out.print("Введите расстояние, которое потенциально должен проплыть " + this.name + " = ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int swim = scanner.nextInt();
        if (swim < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        } else if (swim > this.maxSwim) {
            System.out.println(this.name + " не сможет проплыть " + swim + " метров");
        } else {
            System.out.println(this.name + " проплыл " + swim + " метров");
        }
    }
}
