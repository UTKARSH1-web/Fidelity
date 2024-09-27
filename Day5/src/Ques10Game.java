import java.util.Scanner;

public class Ques10Game {
    private String name;
    private  int maxNumPlayers;

    public Ques10Game(String name, int maxNumPlayers) {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }
    public String getName() {
        return name;
    }
    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }
    @Override
    public String toString() {
        return "Maximum number of player for " + name + " is " + maxNumPlayers;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the game: ");
        String name = sc.nextLine();

        System.out.println("Enter the max number of players: ");
        int maxNumPlayers = sc.nextInt();
        sc.nextLine();
        Ques10Game game = new Ques10Game(name, maxNumPlayers);
        System.out.println("Enter the game that has time limits:");
        String gameTime = sc.nextLine();
        System.out.println("Enter the max number of players: ");
        int maxNumPlayers2 = sc.nextInt();
        System.out.println("Enter the time limits in minutes: ");
        int minTimeLimit = sc.nextInt();
        GameWithTime game2 = new GameWithTime(gameTime,maxNumPlayers,minTimeLimit);

        System.out.println(game.toString());
        System.out.println(game2.toString());

        sc.close();
    }
}
class GameWithTime extends Ques10Game {
    private int timeLimits;

    public GameWithTime(String name, int maxNumPlayers,int minTimeLimit) {
        super(name, maxNumPlayers);
        this.timeLimits = timeLimits;
    }
    public int getTimeLimits() {
        return timeLimits;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTime limit for " + getName() + " is " + timeLimits + " minutes";
    }
}

