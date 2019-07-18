package MyMonopoly;

import java.util.*;

public class MainGame extends Movements {

    private int roll1;
    private int roll2;

    public MainGame(){

    }

    public int DiceRoll(){
        Random number = new Random();
        roll1 = 1 + number.nextInt(6);
        roll2 = number.nextInt(6);
        int dice = 1 + roll + roll2;
        return dice;
    }
    public void runGame(){
        Scanner input = new Scanner(System.in);
        int players;

        // do while to make sure the user enters correct amount of players


        do {
            System.out.print("Please enter amount of players: ");
            players = input.nextInt(); // inputter for amount of players
        }while(players <= 0 || players >= 5);


        // array for the number of players

        int[] numOfPlayers = new int[players];

        // array to store players name

        String[] names = new String[5];

        for (int i = 0; i < players; i++){  // for loop to set all player names
            int j = i + 1;
            System.out.printf("\nPlease enter name for player %d: ",j);
            String playerName = input.next();
            names[i] = playerName;
        }

        Player player1 = new Player(names[0]);
        Player player2 = new Player(names[1]);
        Player player3 = new Player(names[2]);


        playersMoney = 1500; // the amount each player starts off with

         // method that initializes all the players money


        Movements myPlayer1 = new Movements();
        Movements myPlayer2 = new Movements();
        Movements myPlayer3 = new Movements();



        // Method to name each player

        myPlayer1.setName(names[0]);
        myPlayer2.setName(names[1]);
        myPlayer3.setName(names[2]);

        // Money Initializer

        myPlayer1.startMoney(myPlayer1,playersMoney);
        myPlayer2.startMoney(myPlayer2,playersMoney);
        myPlayer3.startMoney(myPlayer3,playersMoney);

        // Initializes objects that initializes each player and the ability to move around the board



    }



    public static void main(String[] args){
        Scanner inputter = new Scanner(System.in);
        MainGame game = new MainGame();

        System.out.print("Do you wish to start the game?");
        System.out.print("\nType 'Yes' to start or 'No' to quit: ");
        String start = inputter.next();
        if(start.equals("Yes")){
            game.runGame();
        }


    }
}
