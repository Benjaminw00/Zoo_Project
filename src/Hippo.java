public class Hippo extends Animal{


    //constructors
    public Hippo(String name, boolean hungry, double weight, int age, String birthday ){
        this.name = name;
        this.species = "Hippo";
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
    }


    public Hippo(){
    }


    //setters and getters already in Animal class


    public void makeNoise(){
        System.out.println(name + ": muuaaaaarrrhhh");
    }


    public static void main(String[] args){
        Animal motto = new Hippo("Motto", true, 349.4, 20, "5/1/2004");
        System.out.println(motto);
        motto.makeNoise();
    }
}
