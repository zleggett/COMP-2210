import java.util.Iterator;
public final class LinkedSetClient {
   public static void main(String[] args) {
      LinkedSet<Integer> a = new LinkedSet<Integer>();
      a.add(1);
      a.add(2);
      a.add(3);
      a.add(4);
      a.add(5);
      Iterator<Set<Integer>> powerSet = a.powerSetIterator();
      while(powerSet.hasNext()) {
         System.out.print(powerSet.next());
      }
     
      /**LinkedSet<Integer> a = new LinkedSet<Integer>(); 
      a.add(1);
      a.add(2);
      a.add(3);
      Set<Integer> b = new LinkedSet<Integer>();
      b.add(3);
      b.add(4);
      b.add(2);
      System.out.print(a.complement(b));
      */
   }
}