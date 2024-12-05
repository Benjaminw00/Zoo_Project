public class Hippo extends Animal{
    //Special hippo attribute
    //(how far they can open up their big jaws to eat those big watermelons and stuff)
    private double jawExtensionLength;

    //constructors
    public Hippo(String name, boolean hungry, double weight, int age, String birthday, double jawExtensionLength ){
        super("Hippo", name, hungry, weight, age, birthday);
        this.jawExtensionLength= jawExtensionLength;

    }
    public Hippo(){
    }

    //setters and getters already in Animal class

    public void makeNoise(){
        System.out.println(name + ": muuaaaaarrrhhh");
    }

    //toString()
    public String toString()
    {
        return "This hippo's name is " + name + ". It is " + age + " years old. It can open it's jaw " + jawExtensionLength + " inches wide vertically!!";
    }

    //testing with a runner
    public static void main(String[] args){
        Animal motto = new Hippo("Motto", true, 349.4, 20, "5/1/2004", 30.5);
        System.out.println(motto);
        motto.makeNoise();
    }
}
