/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 1:07 PM
 */

//creating a method to print hello world. That method does not accept any argument and will not return any value.
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("method demo");
        // creating object to call method, as display is in this class
        // but it is non static mehtod so will be called by object
        MethodDemo object = new MethodDemo();
        //calling a method
        object.display();
        System.out.println("exiting....");

    }
    //declaring and defining out method display

    public void display() {
        System.out.println("hello world");
    }
}
