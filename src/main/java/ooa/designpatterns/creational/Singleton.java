package ooa.designpatterns.creational;

import reflection.annotation.Test;

public class Singleton {
    public static void main(String[] args) {
        TestObject testObject = TestObject.testObjectAccessor();
        testObject.methodCall();

        TestObject testObject2 = TestObject.testObjectAccessor();
        if (testObject.equals(testObject2)){
            System.out.println("Same");
        }
    }

}


class TestObject{
    private static TestObject testObject; //1

    private TestObject(){ //2
    }

    public static synchronized TestObject testObjectAccessor(){ //3
        if(testObject == null){
           testObject = new TestObject();
        }
        return testObject;
    }

    public void methodCall(){
        System.out.println("Method Called");
    }
}



/*
* Ensure that the class has only one instance and provide a global point of access to it.
* Use case: Whenever only one instance of Class is required.
* 1. Provide private static field of the same type. Holds the reference of the only instance.
* 2. Create private constructor. Restricts object creation outside of the class.
* 3. Declare public static accessor function. It allows the getInstance or invoke one time.
*    Also provide lazy initialization i.e the object is not be instantiated when the program starts
*    but when the creation is required at the runtime.
*
* Here we also provided synchronized so that only one thread can enter the accessor method at one time.
* */