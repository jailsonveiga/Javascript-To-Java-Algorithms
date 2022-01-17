//Is the Number Even or Odd?
//https://edabit.com/challenge/umRwYETG7ogToZhSi

public class ItsTheNumberEvenOrOdd {
    public static void main(String[] args){
        System.out.println("Is the number even or odd (3) -> " + isEvenOrOdd(3));
        System.out.println("Is the number even or odd (126) -> " + isEvenOrOdd(126));
        System.out.println("Is the number even or odd (19) -> " + isEvenOrOdd(19));
        System.out.println("Is the number even or odd (1) -> " + isEvenOrOdd(1));
    }
    public static String isEvenOrOdd(int num) {
        if(num % 2 == 0) {
            return "even";
        }
        else{
            return "odd";
        }
    }
}
