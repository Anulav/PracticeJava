package reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Optional;

public class ReflectionExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class userClass = new User().getClass();
        System.out.println(userClass.getPackageName());
        Arrays.stream(userClass.getDeclaredFields()).forEach(field-> System.out.println(field.getName()));
        Arrays.stream(userClass.getDeclaredFields()).forEach(field-> System.out.println(field.getGenericType()));
        Arrays.stream(userClass.getDeclaredFields())
                .forEach(field-> System.out.println(Modifier.isPrivate(field.getModifiers())));
        Arrays.stream(userClass.getDeclaredConstructors())
                .forEach(field-> System.out.println(field.getName()));
        try {
            Class daemonDemo = Class.forName("multithreading.DaemonDemo");
            Arrays.stream(daemonDemo.getDeclaredMethods()).forEach(field -> System.out.println(field.getName()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Arrays.stream(userClass.getDeclaredMethods()).forEach(e->System.out.println(e.getName()));
        try {
            Method method = userClass.getMethod("getUserId");
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("=====================Create new instance============================");
        Constructor defaultConstructor = userClass.getDeclaredConstructor(null);
        User newUser = (User) defaultConstructor.newInstance();
        System.out.println("new instance is "+ newUser);
        Optional<Field> username  = Arrays.stream(userClass.getDeclaredFields()).filter(e-> e.getName().equals("username")).findFirst();
        if (username.isPresent()){
           Field usernameField = username.get();
           usernameField.setAccessible(true);
           usernameField.set(newUser,"Elon Musk");
            System.out.println(newUser);
        }
        Field username2 = userClass.getDeclaredField("username");
        username2.setAccessible(true);
        username2.set(newUser,"Bill Gates");
        System.out.println(newUser);



    }

}


class User{
    private int userId;
    private String username;
    private String description;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


// For private methods and field use getDeclared* methods from reflection package.