import java.util.*;
import triple.Triple;

import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args){

    Player p1 = new Player("Ram", 1000);

    System.out.println("Player is "+ p1.getPlayerName());
    Board b = new Board(9);
    
    List<Integer> col = new ArrayList<>();
    List<Integer> val = new ArrayList<>();
    
    col.add(0);
    col.add(1);

    val.add(3);
    val.add(6);
    
    b.setUpBoardConfig(0,0,3);
    b.setUpBoardConfig(0,2,6);
    b.setUpBoardConfig(0,3,5);
    b.setUpBoardConfig(0,5,8);
    b.setUpBoardConfig(0,6,4);

    b.setUpColumnwise(1, col, val);
    
    List<Triple> triple = new ArrayList<>();
    

triple.add(new Triple(0,0,3));
triple.add(new Triple(0,2,6));
triple.add(new Triple(0,3,5));
triple.add(new Triple(0,5,8));
triple.add(new Triple(0,6,4));
triple.add(new Triple(1,0,5));
triple.add(new Triple(1,1,2));
triple.add(new Triple(2,1,8));
triple.add(new Triple(2,2,7));
triple.add(new Triple(2,7,3));
triple.add(new Triple(2,8,1));
triple.add(new Triple(3,2,3));
triple.add(new Triple(3,4,1));
triple.add(new Triple(3,7,8));
triple.add(new Triple(4,0,9));
triple.add(new Triple(4,3,8));
triple.add(new Triple(4,4,6));
triple.add(new Triple(4,5,3));
triple.add(new Triple(4,8,5));
triple.add(new Triple(5,1,5));
triple.add(new Triple(5,4,9));
triple.add(new Triple(5,6,6));
triple.add(new Triple(6,0,1));
triple.add(new Triple(6,1,3));
triple.add(new Triple(6,6,2));
triple.add(new Triple(6,7,5));
triple.add(new Triple(7,7,7));
triple.add(new Triple(7,8,4));
triple.add(new Triple(8,2,5));
triple.add(new Triple(8,3,2));
triple.add(new Triple(8,5,6));
triple.add(new Triple(8,6,3));

    b.setUpBoard(triple);
    b.printBoard();

    System.out.println();
    
    Game game1 = new Game(b, p1);
    game1.play();
    }
}