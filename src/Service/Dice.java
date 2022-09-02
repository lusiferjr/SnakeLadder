package Service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import java.util.Random;

public class Dice {
  public int roll(){
    return new Random().nextInt(6) + 1;
  }
}
