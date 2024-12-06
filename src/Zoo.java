import java.util.LinkedList;
public class Zoo {

   LinkedList<Animal> animals = new LinkedList<Animal>();
   LinkedList<Employee> empList = new LinkedList<Employee>();

   public void addAnimal(Animal newAnimal){
      animals.add(newAnimal);
   }

    public static void main(String[] args) {
       LinkedList employeeNameList = new LinkedList();
       LinkedList employeeClockedIn = new LinkedList();


       Employee employee1 = new Employee("Ben", "Manager", 20, 30.50, true);
       Employee employee2 = new Employee();
       Zookeeper employee3 = new Zookeeper(true, false);
       Hippo motto = new Hippo("Motto", true, 123.23, 15, "11/23/09", 32);





       System.out.println(employee3);
       System.out.println(employeeNameList);
       System.out.println(motto);
       motto.makeNoise();




    }

}