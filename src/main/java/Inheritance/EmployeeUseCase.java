package Inheritance;

public class EmployeeUseCase {
    public static void main(String[] args) {

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
    }
    protected void work(){
        System.out.println("Common working for everyone");
    }

}
class Manager extends Employee{

    String[] projects;
    Manager(int id, String name, String dept, double salary,String[] projects) {
        super(id, name, dept, salary);
        this.projects = projects;
    }
    @Override
    protected void work(){
    super.work();
        System.out.println("Manager is working on: ");
        for (int i = 0; i < projects.length ; i++) {
            System.out.println(projects[i]);
        }
    }
}
class Developer extends Employee{

    String technology;
    Developer(int id, String name, String dept, double salary, String technology) {
        super(id, name, dept, salary);
        this.technology = technology;
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