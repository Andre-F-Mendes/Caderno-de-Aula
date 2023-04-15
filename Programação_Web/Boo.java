import java.util.*;
class Boo implements Comparable{
    public int x;
 
    public Boo(int x){
      this.x = x;
    }

    public int compareTo(Object obj){
      Boo b = (Boo)obj;
      return (this.x - b.x);
    }
}