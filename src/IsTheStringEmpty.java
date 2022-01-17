//Is the String Empty?
//https://edabit.com/challenge/wr8zTBNNeLtspmLLT

public class IsTheStringEmpty {
    public static void main(String[] args) {
        System.out.println("Returns true if a string is empty and false otherwise -> ('') " + isEmpty(""));
        System.out.println("Returns true if a string is empty and false otherwise -> (' ') " + isEmpty(" "));
        System.out.println("Returns true if a string is empty and false otherwise -> ('a') " + isEmpty("a"));
    }
    public static boolean isEmpty(String str){
        if(str == "") {
            return true;
        }
        else{
            return false;
        }
    }
}
