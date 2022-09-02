package Service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Player;
import Repository.PlayerRepository;

import static Utils.Utils.getUUid;

public class PlayerService {
 public void addPlayer(String name, PlayerRepository pr){
  Player player =new Player(getUUid(),name);
  pr.addPlayer(player);
 }
}
