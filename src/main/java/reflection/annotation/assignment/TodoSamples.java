package reflection.annotation.assignment;

public class TodoSamples {

    @Todo(author = "Anulav Sharan", priority = Priority.LOW)
    public void addTwoInts(int a, int b){
        //No status provided for this method
    }

    @Todo
    public void subtractTwoInts(int a, int b){
        //No annotation values provided for this method.
    }
}

/*
For accessing private methods. In reflection we need to set the accessibility value.
 In here I had to remove the arguments because dynamically identifying the arguments at runtime
 and passing those when invoking method on the object is way out of scope for this assignment.
 Check later commits.

 New update from previous commits: As the method invocation is not required in our case.
 We have added the args as it was there earlier. As we only need metadata.
*/
