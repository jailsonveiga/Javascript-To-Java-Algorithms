/* Create a function that takes a number
as an argument, increments the number
by +1 and returns the result */

public class NextNumber {
    public static void main(String[] args) {
        System.out.println("Next number of - 0 - is: " + nextNumber(0));
        System.out.println("Next number of - 9 - is: " + nextNumber(9));
        System.out.println("Next number of - -3 - is: " + nextNumber(-3));
    }

    public static int nextNumber(int num) {
        num = num + 1;
        return num;
    }
}
