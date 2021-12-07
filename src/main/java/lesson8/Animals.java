package lesson8;

public class Animals {
    String type;
    String name;
    String voice;

    public Animals(String type, String name, String voice) {
        this.type = type;
        this.name = name;
        this.voice = voice;
    }

    public void Voice(){
        System.out.println(this.type + " " + this.name + " " + this.voice +"кает");
    }
}
