package collections.maps;

import java.util.*;
import java.util.stream.Collectors;

public class MapUsage {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Batman",1, User.Department.IT, 90, User.Comic.DC),
                new User("Superman",2, User.Department.ADMIN, 70, User.Comic.DC),
                new User("Ironman",3, User.Department.IT, 92, User.Comic.MARVEL),
                new User("Captain America",4, User.Department.ADMIN, 65, User.Comic.MARVEL)
        );

        Map<User.Department, List<User>> usersByDept = users.stream().collect(Collectors.groupingBy(e-> e.getDepartment()));
        for (Map.Entry<User.Department, List<User>> e: usersByDept.entrySet() ) {
            System.out.println(e.getKey());
            e.getValue().forEach(ele-> System.out.println(ele.getUsername()));
            System.out.println("===================================");
        }

        Map<User.Department, Integer> scoresByDept = users.stream().collect(Collectors.groupingBy(e-> e.getDepartment(),
                Collectors.summingInt(User::getReviewScore)));

        for (Map.Entry<User.Department, Integer> entry: scoresByDept.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map<User.Comic, Map<User.Department,List<User>>> usersByComicAndDepartment = users.stream().collect(
                Collectors.groupingBy(e-> e.getComic(), Collectors.groupingBy(User::getDepartment)));

        for (Map.Entry<User.Comic, Map<User.Department,List<User>>> entry: usersByComicAndDepartment.entrySet()) {
            System.out.println("===============================================");
            System.out.println(entry.getKey());
            entry.getValue().forEach((k, v)-> {
                System.out.println(k);
                v.forEach(element -> System.out.println(element.getUsername()));
            });
        }
        System.out.println("=====================================");
        frequencyCheck();

    }

    public static void frequencyCheck(){
        Map<String, Integer> freqMap= new Hashtable<>();
        List<String> strings = Arrays.asList("java", "Freq", "if","it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate");

        //Naive way
        for (String word: strings) {
                Integer freq = freqMap.get(word);
                freqMap.put(word,freq == null? 1: freq+1);
        }

        freqMap.forEach((k,v)-> System.out.println(k+" "+ v));
        System.out.println("=====================================");
        //Freq table in alphabetical order (Natural ordering of Strings)

        Map<String, Integer> freqTreeMap = new TreeMap<>(freqMap);
        freqTreeMap.forEach((k,v)-> System.out.println(k+"="+v));




    }
}
