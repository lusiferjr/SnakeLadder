package Repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Player;

import java.util.HashMap;
import java.util.Map;

public class BoardRepository {
    private int size;
    private Map<Integer, Integer> playerpices;

    public BoardRepository(int size) {
        this.size = size;
        this.playerpices = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Integer, Integer> getPlayerpices() {
        return playerpices;
    }

    public void setPlayerpices(Map<Integer, Integer> playerpices) {
        this.playerpices = playerpices;
    }

    public void intizialize(PlayerRepository pr) {
        pr.getPlayerList().forEach(x -> {
            this.playerpices.put(x.getId(), -1);
        });

    }
    public void updatePlayer(Player player,int newpos){
        this.playerpices.put(player.getId(),newpos);
    }
}
