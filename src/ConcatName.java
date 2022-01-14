//Concatenate First and Last Name into One String
//https://edabit.com/challenge/djMjmJMbeEFxEsPiH

public class ConcatName {
    public static void main(String[] args) {
        System.out.println("Concatenate First and Last Name into One String -> Swap Names -> (First, Last) - " + concatName("First", "Last"));

        System.out.println("Concatenate First and Last Name into One String -> Swap Names ->(John, Doe) - " + concatName("John", "Doe"));

        System.out.println("Concatenate First and Last Name into One String -> Swap Names -> (Mary, Jane) - " + concatName("Mary", "Jane"));
    }

    public static String concatName(String firstName, String lastName){
        return lastName + ", " + firstName;
    }
}
