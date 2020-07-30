/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 1:39 PM
 */
/*
create a metho add, which accept 2 arguments of type int
then, in method we modify the formal argument and check
the actual arguments for changes
 */
public class MethodCallByValue {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        MethodCallByValue obj = new MethodCallByValue();
        System.out.println(obj.add(no1, no2));
        System.out.println(no1);
        System.out.println(no2);
    }

    public int add(int no1, int no2) {
        int response = no1 + no2;
        no1 = 0;
        no2 = 0;
        return response;
    }
}
