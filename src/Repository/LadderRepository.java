package Repository;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

import Model.Ladder;

import java.util.ArrayList;
import java.util.List;

public class LadderRepository {
    List<Ladder> ladderList;

    public LadderRepository() {
        this.ladderList = new ArrayList<>();
    }

    public List<Ladder> getLadderList() {
        return ladderList;
    }

    public void setLadderList(List<Ladder> ladderList) {
        this.ladderList = ladderList;
    }

    public void addLadder(Ladder ladder) {
        this.ladderList.add(ladder);
    }
}
