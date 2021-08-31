package inheritance;

public class EmployeeUseCase {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "John", "Travel", 2000, new String[]{"LMS", "CMS"});
        manager.work();
        Developer developer = new Developer(1, "Devfxa", "Engineering", 3000, "Java, React.js and AWS");
        developer.work();
        System.out.println("------------------------");
        System.out.println("Shadow test");
        System.out.println(developer.salary);

//        Output:
//        Inside Employee constructor
//        Inside Manager constructor
//        Common working for everyone
//        Manager is working on:
//        LMS
//                CMS
//        Inside Employee constructor
//        Common working for everyone
//        Developer is working on: Java, React.js and AWS
//        ------------------------
//                Shadow test
//        3000.0
    }

}

class Employee{
    int id;
    String name, dept;
    double salary;
    Employee(int id, String name, String dept, double salary){
        this.id = id;
        this.dept = dept;
        this.name = name;
        this.salary = salary;
        System.out.println("Inside Employee constructor");
    }
    protected void work(){
        System.out.println("Common working for everyone");
    }
    protected final void work2() {System.out.println("Can't change the method");}
}
class Manager extends Employee{

    String[] projects;
    Manager(int id, String name, String dept, double salary,String[] projects) {
        super(id, name, dept, salary);
        this.projects = projects;
        System.out.println("Inside Manager constructor");
    }
    @Override
    protected void work(){
    super.work();
        System.out.println("Manager is working on: ");
        for (int i = 0; i < projects.length ; i++) {
            System.out.println(projects[i]);
        }
    }

//    @Override
//    protected void work2(){  //Gives compilation error as work2()' cannot override 'work2()' in 'Inheritance.Employee'; overridden method is final.
//        super.work();
//        System.out.println("Manager is working on: ");
//        for (int i = 0; i < projects.length ; i++) {
//            System.out.println(projects[i]);
//        }
//    }
}
class Developer extends Employee{

    double salary; //This shadows the Superclass's salary field. Hence need to explicitly initialise in the constructor.
    String technology;
    Developer(int id, String name, String dept, double salary, String technology) {
        super(id, name, dept, salary);
        this.technology = technology;
        this.salary = salary; //Without this statement.
                              // Whenever the salary is accessed it will return as 0.0 As the current class's salary is not initialise
    }
    @Override
    protected void work(){
        super.work();
        System.out.println("Developer is working on: "+ technology);
    }
}
class Tester extends Employee{

    String tools[];
    Tester(int id, String name, String dept, double salary, String tools[]) {
        super(id, name, dept, salary);
        this.tools = tools;
    }

    @Override
    protected void work(){
        super.work();
        System.out.println("Tester is testing using: ");
        for (int i = 0; i < tools.length ; i++) {
            System.out.println(tools[i]);
        }
    }
}