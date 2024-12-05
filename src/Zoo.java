import java.util.LinkedList;
public class Zoo {

    public static void main(String[] args) {
       LinkedList employeeNameList = new LinkedList();
       LinkedList employeeClockedIn = new LinkedList();


       Employee employee1 = new Employee("Ben", "Manager", 20, 30.50, true);
       Employee employee2 = new Employee();
       Zookeeper employee3 = new Zookeeper(true, false);
       employeeNameList.add(employee1.getName() + ": " + employee1.getJob());
       employeeNameList.add(employee2.getName() + ": " + employee2.getJob());
       employeeNameList.add(employee3.getName() + ": " + employee3.getJob());




       System.out.println(employee3);
       System.out.print(employeeNameList);




    }

}