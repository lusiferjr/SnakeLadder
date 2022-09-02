package Service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Ladder;
import Model.Player;
import Model.Snake;
import Repository.BoardRepository;
import Repository.LadderRepository;
import Repository.PlayerRepository;
import Repository.SnakeRepository;

public class BoardService {
    public Boolean move(String name, int num, BoardRepository br, PlayerRepository pr, LadderRepository lr, SnakeRepository sr) {

        Player player = pr.getUserByName(name);
        int oldPos = br.getPlayerpices().get(player.getId());
        int newPos=-1;
        int ladderEnd=checkLadder(num,lr);
        int snakeEnd=checkSnake(num,sr);
        if(ladderEnd!=-1){
            newPos=ladderEnd;
        }else if(snakeEnd!=-1){
            newPos=snakeEnd;
        }else{
            newPos=oldPos+num;
        }


        if(checkGameCompleted(oldPos,num, br.getSize())){
            br.updatePlayer(player,br.getSize());
            System.out.println("--------New Positions-------");
            br.getPlayerpices().forEach((x,k)->{
                System.out.println(pr.getPlayer(x)+" "+k);
            });
            return true;
        }


        br.updatePlayer(player,newPos);


        System.out.println("--------New Positions-------");
        br.getPlayerpices().forEach((x,k)->{
            System.out.println(pr.getPlayer(x)+" "+k);
        });
        return false;
    }

    private Integer checkLadder(int num, LadderRepository lr) {
        Ladder lade = lr.getLadderList().parallelStream().filter(x -> x.getStart() == num).findAny().orElse(null);
        if (lade != null) {
            return lade.getEnd();
        }else{
            return -1;
        }
    }
    private Integer checkSnake(int num, SnakeRepository sr) {
        Snake snake = sr.getSnakeList().parallelStream().filter(x -> x.getStart() == num).findAny().orElse(null);
        if (snake != null) {
            return snake.getEnd();
        }else{
            return -1;
        }
    }
    public Boolean checkGameCompleted(int playerPosition,int num,int size){
        if(playerPosition+num>=size){
            return true;
        }else{
            return false;
        }
    }
}
