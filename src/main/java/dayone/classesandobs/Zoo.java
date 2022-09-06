package dayone.classesandobs;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("dog", 2,"woof woof");
        Animal animal2 = new Animal("cat", 8,"silent kill");
        Animal animal3 = new Animal("fish", 8, "blub blub");
    String result = animal1.printNameAndMakeNoise();
        System.out.println(animal1.printNameAndMakeNoise());
    }
}
