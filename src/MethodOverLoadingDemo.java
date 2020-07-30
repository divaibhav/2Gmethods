/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 1:29 PM
 */
/*
Create a method called add which accept 2 integer arguments
, create another method with same name but this mehtod will accept
2 double arguments,
to demonstrate method overloading
 */
public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
        System.out.println(obj.add(10, 12.7));

    }

    public int add(int no1, int no2) {
        System.out.println("int arguments");
        int response = 0;
        response = no1 + no2;
        return response;
    }

    public double add(double no1, double no2) {
        System.out.println("double arguments");
        double response = 0.0;
        response = no1 + no2;
        return response;
    }

    public double add(int no1, double no2) {
        System.out.println("int double arguments");
        double response = 0.0;
        response = no1 + no2;
        return response;
    }
}
