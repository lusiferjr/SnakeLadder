/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Repository.BoardRepository;
import Repository.LadderRepository;
import Repository.PlayerRepository;
import Repository.SnakeRepository;
import Service.*;

public class Driver {

    public static void main(String[] args) {


        BoardRepository br = new BoardRepository(100);

        LadderRepository lr = new LadderRepository();
        SnakeRepository sr = new SnakeRepository();
        PlayerRepository pr = new PlayerRepository();

        BoardService bs = new BoardService();
        Dice dice = new Dice();
        LadderService ladderService = new LadderService();
        PlayerService playerService = new PlayerService();
        SnakeService snakeService = new SnakeService();


        snakeService.addSnake(99, 9, sr);
        snakeService.addSnake(30, 3, sr);
        System.out.println(sr.getSnakeList());
        ladderService.addLadder(5, 25, lr);
        ladderService.addLadder(13, 95, lr);
        System.out.println(lr.getLadderList());
        playerService.addPlayer("Player1", pr);
        playerService.addPlayer("Player2", pr);
//
//  System.out.println(lr.getLadderList());
        System.out.println(pr.getPlayerList());
        br.intizialize(pr);
        int num = dice.roll();
        String player = "Player1";
        System.out.println("dice:-" + num);
        bs.move("Player1", num, br, pr, lr, sr);


        while (!bs.move(player, num, br, pr, lr, sr)) {
            if (player.equalsIgnoreCase("Player1")) {
                player = "Player2";
            } else {
                player = "Player1";
            }
            num = dice.roll();
        }
    }
}
