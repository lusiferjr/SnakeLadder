package Model;

/*
 * Author:- lusiferjr
 * Created on :- 02/09/22
 */

public class Entity {
 private Integer start;
 private Integer end;

 public Integer getStart() {
  return start;
 }

 public void setStart(Integer start) {
  this.start = start;
 }

 public Integer getEnd() {
  return end;
 }

 public void setEnd(Integer end) {
  this.end = end;
 }

 public Entity(Integer start, Integer end) {
  this.start = start;
  this.end = end;
 }

 @Override
 public String toString() {
  return "Entity{" +
          "start=" + start +
          ", end=" + end +
          '}';
 }
}
