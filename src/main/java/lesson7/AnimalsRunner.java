package lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.name = "Бобик";
        dog.maxRun = 500;
        dog.maxSwim = 10;
        Animals cat = new Animals("Барсик",200, 0);
        Animals tiger = new Animals("Бони",900,30);
        dog.Run();
        dog.Swim();
        cat.Run();
        cat.Swim();
        tiger.Run();
        tiger.Swim();
    }
}
