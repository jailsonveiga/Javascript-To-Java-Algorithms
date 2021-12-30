// Is The Number Less Than Or Equal To Zero
// https://edabit.com/challenge/EP66YmuNMWhRZdniY

public class IsNumberLessThanOrEqualToZero {

    public static void main(String[] args) {
        System.out.println( "Return (True) If (5) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " + lessThanOrEqualToZero(5));

        System.out.println( "Return (True) If (0) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " + lessThanOrEqualToZero(0));

        System.out.println( "Return (True) If (-2) Is Less Than Or Equal To (0) Otherwise Return False - Answer: " + lessThanOrEqualToZero(-2));
    }

    public static boolean lessThanOrEqualToZero(int num) {
        if(num <= 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
