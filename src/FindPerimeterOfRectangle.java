// Find The Perimeter Of a Rectangle
// https://edabit.com/challenge/cMKLM7ExBd3TFJwPA

public class FindPerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Find The Perimeter Of a Rectangle (6 in length and 7 in width) " +
                "is " + findPerimeter(6, 7));

        System.out.println("Find The Perimeter Of a Rectangle (20 in length and 10 in width) " +
                "is " + findPerimeter(20, 10));

        System.out.println("Find The Perimeter Of a Rectangle (2 in length and 9 in width) " +
                "is " + findPerimeter(2, 9));
    }
    public static int findPerimeter(int length, int width) {
        int lengthWidthTotal = length + width; // Add length and width and the total value assign to a lengthWidthTotal variable name

        return lengthWidthTotal * 2; // multiply the value of lengthWidthTotal variable name by 2
    }
}
