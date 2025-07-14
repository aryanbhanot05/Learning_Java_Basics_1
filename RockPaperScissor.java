import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Let's play Rock Paper Scissor Game and remember the old childhood days!");
        System.out.println(
                "Here is the guide:-\nPress \"R\" for Rock, \"P\" for Paper & \"S\" for Scissors\nEnjoy the Game!");

        // System.out.print("Enter the number of rounds you want to play: ");
        // int i = sc.nextInt();
        // int a = 0;
        // int win = 0;
        // int lose = 0;

        // while (a < i) {

        int comp_num = rd.nextInt(3) + 1;
        String comp_move;
        if (comp_num == 1) {
            comp_move = "R";
        } else if (comp_num == 2) {
            comp_move = "P";
        } else {
            comp_move = "S";
        }

        System.out.print("Play your move: ");
        String user = sc.nextLine();
        user = user.toUpperCase();

        if (user.equals(comp_move)) {
            System.out.println("It's a tie!");
        } else if ((user.equals("R") && comp_move.equals("P")) ||
                (user.equals("P") && comp_move.equals("S")) ||
                (user.equals("S") && comp_move.equals("R"))) {
            System.out.println("You Lose!");
            // lose++;
        } else if ((user.equals("R") && comp_move.equals("S") ||
                (user.equals("P") && comp_move.equals("R")) ||
                (user.equals("S") && comp_move.equals("P")))) {
            System.out.println("You Win!");
            // win++;
        }
        // a++;
        // }

        // if (win > lose) {
        // System.out.println("Congratulations! You won the series of game!\nYou won "
        // + win + " matches out of " + i + " from the computer!");
        // } else {
        // System.out.println("Congratulations! You lose the series of game!\nYou lose "
        // + lose + " matches out of " + i + " from the computer!");
        // }

        sc.close();
    }
}