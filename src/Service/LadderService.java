package Service;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Ladder;
import Repository.LadderRepository;

public class LadderService {
 public void addLadder(int start, int end, LadderRepository lr){
  Ladder ladder=new Ladder(start,end);
   lr.addLadder(ladder);
 }
}
