import java.util.LinkedList;
public class Zoo {

   static LinkedList<Animal> animals = new LinkedList<Animal>();
   static LinkedList<Employee> empList = new LinkedList<Employee>();

   public static void addAnimal(Animal newAnimal){
      animals.add(newAnimal);
   }

   public static void addEmployee(Employee newEmployee){
      empList.add(newEmployee);
   }

   public static void fireEmployee(Employee employee){
      empList.remove(employee);
   }

   public static void releaseAnimal(Animal animal){
      animals.remove(animal);
   }


    public static void main(String[] args) {

       Employee employee1 = new Employee("Ben", "Manager", 20, 30.50, true);
       Employee employee2 = new Employee();
       Zookeeper employee3 = new Zookeeper(true, false);
       Hippo motto = new Hippo("Motto", true, 123.23, 15, "11/23/09", 32);

       addAnimal(motto);
       addEmployee(employee1);
       addEmployee(employee2);
       addEmployee(employee3);






    }

}