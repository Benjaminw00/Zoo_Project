public class Zookeeper extends Employee{

    boolean cleaningHabitat;
    boolean feedingAnimal;

    //constructors
    public Zookeeper(String name, int age, boolean clockedIn, boolean cleaningHabitat, boolean feedingAnimal){
        this.name = name;
        this.age = age;
        this.clockedIn = clockedIn;
        this.cleaningHabitat = cleaningHabitat;
        this.feedingAnimal = feedingAnimal;
        this.wagePerHour = 21.5;
        this.job = "Zookeeper";
    }

    public Zookeeper(boolean cleaningHabitat, boolean feedingAnimal){
        this.feedingAnimal = feedingAnimal;
        this.cleaningHabitat = cleaningHabitat;
        this.name = "Zach";
        this.age = 26;
        this.clockedIn = false;
        this.wagePerHour = 21.5;
        this.job = "Zookeeper";
    }


    //getters and setters
    public void isCleaningHabitat(){
        if(cleaningHabitat){
            System.out.println(name + " is currently cleaning the habitat.");
        }
        else{
            System.out.println(name + " is not currently cleaning the habitat.");
        }
    }

    public void isFeedingAnimal(){
        if (feedingAnimal){
            System.out.println(name + " is currently feeding the animals.");
        }
        else {
            System.out.println(name + " is not currently feeding the animals.");
        }
    }

    public boolean changeCleaningStatus(){
        return this.cleaningHabitat = !cleaningHabitat;
    }

    public boolean changeFeedingStatus(){
        return this.feedingAnimal = !feedingAnimal;
    }


    //testing
    public static void main(String[] args){
        Zookeeper mike = new Zookeeper(true, false);
        System.out.println(mike);
        mike.isCleaningHabitat();
        mike.changeCleaningStatus();
        mike.isCleaningHabitat();
    }





}
