public class FlipTheBoolean {
    public static void main (String[] args) {
        System.out.println("Flip the int: (1) -> " + flipIntBool(1));
        System.out.println("Flip the int: (0) -> " + flipIntBool(0));
    }
    public static int flipIntBool(int intBool) {
        if(intBool == 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
