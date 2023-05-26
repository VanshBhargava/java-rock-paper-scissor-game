import java.util.*;
class main{
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player1 = scan.nextInt();
        System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player2 = scan.nextInt();
     
        if (player1 == player2)
        {
            System.out.print("It is a tie");
        } else {
            switch (player1){
            case 1:
                if (player2 == 2)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case 2:
                if (player2 == 3)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case 3:
                if (player2 == 1)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
        scan.close();
    }
}