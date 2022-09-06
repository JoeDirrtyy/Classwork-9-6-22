package dayone.classesandobs;

public class Animal {
    //default constructor
    //lost when creating a parameterized constructor


    public String animalName;
    public int eyes;
    public String animalSound;
    //make a constructor in main
    public Animal(String animalName, int eyes ,String animalSound) {
        this.animalName = animalName;
        this.eyes = eyes;
        this.animalSound = animalSound;
    }
    //overloaded constructor
    public Animal(String animalName){
        this.animalName = animalName;
    }
    //Method
    /*
        accessModifier- return data type - name -() -{}
     */
    public String printNameAndMakeNoise(){
        return this.animalName + "======>" + this.animalSound; //return anima data type value

    }
    public int getNumberOfEyes(){
        return this.eyes;
    }
}
