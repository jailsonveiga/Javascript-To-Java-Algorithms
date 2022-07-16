/* Create a function that takes an array
   containing only numbers and
   return the first element */

public class GetFirstElement {
    public static void main(String[] args) {
        System.out.println("Get the first Element in an Array - " + getFirstValue (new int[]{2, 5, 3, 9, 0}));
    }

    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
}
