package Repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
 List<Player> playerList;

 public PlayerRepository() {
  this.playerList = new ArrayList<>();
 }

 public List<Player> getPlayerList() {
  return playerList;
 }


 public void addPlayer(Player player) {
  this.playerList.add(player);
 }

 public Player getUserByName(String name) {
  return this.playerList.parallelStream().filter(x->x.getName().equalsIgnoreCase(name)).findAny().orElse(null);
 }

 public String getPlayer(Integer x) {
  Player player=this.playerList.parallelStream().filter(s->s.getId()==x).findAny().orElse(null);
  if(player!=null) return player.getName();
  else return " ";
 }
}
