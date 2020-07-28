/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 1:20 PM
 */

//Create a method called add, this method will accept two argument of type int,
// and return there sum.
// Accept integer from user.

import java.util.Scanner;

public class MethodDemoReturnValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        // creating object to call method
        MethodDemoReturnValue object = new MethodDemoReturnValue();
        // a variable to store return value of method, calling the add method
        int result = object.add(number1, number2);
        System.out.println("sum = " + result);
    }

    //defining add method
    public int add(int no1, int no2) {
        // a variable to hold return value
        int response = 0;
        //adding two numbers and storingresult of addition into response variable
        response = no1 + no2;
        // returning the value of addition
        return response;
    }
}
