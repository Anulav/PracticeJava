package oop.dip.problem;

import java.util.*;
import java.util.stream.Collectors;

public class ABCWeatherApi {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("hitesh12", "anulav", "sumit34", null, "Ram");

        List<String> updatedString = a.stream().filter(e -> Optional.ofNullable(e).isPresent())
                .filter(e -> e.contains("anu"))
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(updatedString);

       /* String A="Hitesh";

        Optional<String> a = Optional.ofNullable(A);
        if(a.isPresent()) {System.out.println("Print doesn't contain null");}
        else{System.out.println("String contains null");}

*/

        /*List<String> cars = Arrays.asList("Mercedes", "BMW","Audi","Jeep");
        cars.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()){
                    return 1;
                }else if(o1.length() == o2.length()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        cars.forEach(System.out::println);

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Abha", 1));
        emps.add(new Employee("Dhaba", 5));
        emps.add(new Employee("Eab", 9));
        emps.add(new Employee("Baba", 4));

        emps.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        emps.forEach(System.out::println);

    }
    static class Employee{
        String name;
        int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
*/
    }
}









