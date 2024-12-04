public class Employee {
    //TODO: create employee class variables
    protected String name;
    protected String job;
    protected int age;
    protected double wagePerHour;
    protected boolean clockedIn;

    //TODO: create constructors
    public Employee(String name, String job, int age, double wagePerHour, boolean clockedIn){
        this.name = name;
        this.job = job;
        this.age = age;
        this.wagePerHour = wagePerHour;
        this.clockedIn = clockedIn;
    }

    public Employee(){
        this.name = "Leah";
        this.job = "CEO";
        this.age = 42;
        this.wagePerHour = 70.50;
        this.clockedIn = true;
    }
    //TODO: create getters and setters

    //getters
    public String getName(){
        return name;
    }
    public String getJob(){
        return job;
    }
    public int getAge(){
        return age;
    }
    public double getWagePerHour(){
        return wagePerHour;
    }
    public boolean getClockedIn(){
        return clockedIn;
    }

    //setters
    public void changeWage(double newWage){
        this.wagePerHour = newWage;
    }
    public void changeAge(int newAge){
        this.age = newAge;
    }
    public void changedClockedInStatus(){
        this.clockedIn = !clockedIn;
    }
    //TODO: any other methods?
    public String toString(){
        return name + " is working as our " + job + ". They are currently " + age +" years old. They make $" + wagePerHour + " per hour.";


    }
    //TODO: create main method test
    public static void main(String[] args){
        Employee jack = new Employee("jack", "manager", 42, 16.46, true);
        System.out.println(jack);
        jack.changedClockedInStatus();
        System.out.println(jack.getClockedIn());
    }

}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo
















