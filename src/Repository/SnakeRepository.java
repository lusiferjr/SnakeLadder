package Repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Snake;

import java.util.ArrayList;
import java.util.List;

public class SnakeRepository {
 List<Snake> snakeList;

 public SnakeRepository() {
  this.snakeList = new ArrayList<>();
 }

 public List<Snake> getSnakeList() {
  return snakeList;
 }

 public void setSnakeList(List<Snake> snakeList) {
  this.snakeList = snakeList;
 }

 public void addSnake(Snake snake) {
  this.snakeList.add(snake);
 }
}
