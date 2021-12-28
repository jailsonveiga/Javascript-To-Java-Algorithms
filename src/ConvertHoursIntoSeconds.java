// Convert Hours Into Seconds
// https://edabit.com/challenge/DmFnzAQzWhyRWdKPi

public class ConvertHoursIntoSeconds {
    public static void main(String[] urg) {
        System.out.println("Convert (2) Hours into Seconds? " + "is " + howManySeconds(2) + " Seconds");

        System.out.println("Convert (10) Hours into Seconds? " + "is " + howManySeconds(10) + " Seconds");

        System.out.println("Convert (24) Hours into Seconds? " + "is " + howManySeconds(24) + " Seconds");
    }

    public static int howManySeconds(int hours) {
        int hoursMinuteNum = 3600;
        return hours * hoursMinuteNum;
    }
}
