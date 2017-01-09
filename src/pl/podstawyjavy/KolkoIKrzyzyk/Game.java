package pl.podstawyjavy.KolkoIKrzyzyk;

/**
 * Created by RENT on 2016-12-08.
 */
public class Game {
    private Display display;
    private GameLogic gameLogic;
    private Player player1;
    private Player player2;
    private GameBoard gameBoard;

    Game(){
        display = new Display();
        gameBoard = new GameBoard();
        gameLogic = new GameLogic();

    }

    public void start(){

        while(true){

        }

    }

}
