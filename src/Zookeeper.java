public class Zookeeper extends Employee{

    private boolean cleaningHabitat;
    private boolean feedingAnimal;
    private static int zookeeperAmt = 0;


    //constructors
    public Zookeeper(String name, int age, boolean clockedIn, boolean cleaningHabitat, boolean feedingAnimal){
        super(name, "Zookeeper", age, 21.5, clockedIn);
        this.cleaningHabitat = cleaningHabitat;
        this.feedingAnimal = feedingAnimal;
        zookeeperAmt++;
    }

    public Zookeeper(boolean cleaningHabitat, boolean feedingAnimal){
        super("Zach", "Zookeeper", 26, 21.5, false);
        this.feedingAnimal = feedingAnimal;
        this.cleaningHabitat = cleaningHabitat;
        zookeeperAmt++;
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

    public static void zookeeperAmt() {
        System.out.println("We have " + zookeeperAmt + " zookeepers at our zoo.");
    }
    //introduction method
    public void introduction(){
        System.out.println("Hi, my name is " + name + " and I work as a zookeeper here." + " I'm " + age + " years old. Nice to meet you!");
    }

    //testing
    public static void main(String[] args){
        Zookeeper mike = new Zookeeper(true, false);
        System.out.println(mike);
        mike.isCleaningHabitat();
        mike.changeCleaningStatus();
        mike.isCleaningHabitat();
        mike.introduction();
        zookeeperAmt();
        employeeAmt();
    }
}
