// Football Points
// https://edabit.com/challenge/wWsD84bEGZgWp6NN5

public class FootballPoints {
    public static void main(String[] args) {
        System.out.println(" - Football team has obtained so far - " + footballPoints(3, 4, 2) + " - points");
        System.out.println(" - Football team has obtained so far - " + footballPoints(5,0,2) + " - points");
        System.out.println(" - Football team has obtained so far - " + footballPoints(0,0,1) + " - points");
    }
    public static int footballPoints(int wins, int draws, int loses) {
        int winsNum = wins * 3; // Wins get 3 points (multiply wins by 3) and assign the value to winsNum
        int drawsNum = draws;// draws get 1 point (multiply wins by 1) and assign the value to drawsNum
        int wdlTotal = winsNum + drawsNum; // Add variable winsNum value and variable drawsNum value and assign the total value to wdlTotal variable
        return wdlTotal;// return
    }
}
