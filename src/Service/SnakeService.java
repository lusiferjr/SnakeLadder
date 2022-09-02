package Service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Ladder;
import Model.Snake;
import Repository.LadderRepository;
import Repository.SnakeRepository;

public class SnakeService {
 public void addSnake(int start, int end, SnakeRepository sr){
  Snake snake=new Snake(start,end);
  sr.addSnake(snake);
 }
}
