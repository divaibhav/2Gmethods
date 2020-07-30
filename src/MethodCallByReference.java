import java.util.Arrays;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 1:43 PM
 */
/*
Processing an array using a method add, which accept one argument of type int[]
to add all the elements, after adding
will modify the elements at each index to 0
 */
public class MethodCallByReference {
    public static void main(String[] args) {
        int[] brr = {10, 20, 30, 40};
        MethodCallByReference obj = new MethodCallByReference();
        System.out.println(obj.add(brr));
        System.out.println(Arrays.toString(brr));
    }

    public int add(int[] arr) {
        int response = 0;
        for (int i = 0; i < arr.length; i++) {
            response = response + arr[i];
            arr[i] = 0;
        }
        return response;
    }
}
