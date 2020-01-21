 /**
 * SortTest.java
 *
 * Client to run sort methods of SortingLab. 
 *
 * @author    Zachary Leggett (zjl0002@auburn.edu)
 * @version   2018-10-02
 */
import java.util.Arrays;
public class SortTest {

   public static void main(String[] args) {
      int key = 903836722;
      SortingLab<String> sls = new SortingLab<String>(key);
      
      //Runs each sort a few times before collecting data.
      String[] as = {"D", "B", "E", "C", "A"};
      for (int i = 0; i < 10; i++) {
         sls.sort1(as);
         sls.sort2(as);
         sls.sort3(as);
         sls.sort4(as);
         sls.sort5(as);
      }
      
      s1RandomTest();
      s1AscendingTest();
      s1DescendingTest();
      
      s2RandomTest();
      s2AscendingTest();
      s2DescendingTest();
      
      s3RandomTest();
      s3AscendingTest();
      s3DescendingTest();
      
      s4RandomTest();
      s4AscendingTest();
      s4DescendingTest();
      
      s5RandomTest();
      s5AscendingTest();
      s5DescendingTest();
      
      s3Stability();
      s5Stability();
         
   }
   
   
   
   
   //Uses Sort 1 to sort an array of random values.
   public static void s1RandomTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 1 Random\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         start = System.nanoTime();
         sli.sort1(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   
   
   
   //Uses Sort 1 to sort an array of ascending values.
   public static void s1AscendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 1 Ascending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         start = System.nanoTime();
         sli.sort1(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   
   
   //Uses Sort 1 to sort an array of descending values.
   public static void s1DescendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 1 Descending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         Integer[] bi = new Integer[ai.length];
         int count = 0;
         for (int i = ai.length - 1; i >= 0; i--) {
            bi[count] = ai[i];
            count++;
         }
         start = System.nanoTime();
         sli.sort1(bi);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s2RandomTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 2 Random\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         start = System.nanoTime();
         sli.sort2(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s2AscendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 2 Ascending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         start = System.nanoTime();
         sli.sort2(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s2DescendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 2 Descending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         Integer[] bi = new Integer[ai.length];
         int count = 0;
         for (int i = ai.length - 1; i >= 0; i--) {
            bi[count] = ai[i];
            count++;
         }
         start = System.nanoTime();
         sli.sort2(bi);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s3RandomTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 3 Random\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         start = System.nanoTime();
         sli.sort3(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s3AscendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 3 Ascending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         start = System.nanoTime();
         sli.sort3(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s3DescendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 3 Descending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         Integer[] bi = new Integer[ai.length];
         int count = 0;
         for (int i = ai.length - 1; i >= 0; i--) {
            bi[count] = ai[i];
            count++;
         }
         start = System.nanoTime();
         sli.sort3(bi);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s4RandomTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 4 Random\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         start = System.nanoTime();
         sli.sort4(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s4AscendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 4 Ascending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         start = System.nanoTime();
         sli.sort4(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s4DescendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 4 Descending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         Integer[] bi = new Integer[ai.length];
         int count = 0;
         for (int i = ai.length - 1; i >= 0; i--) {
            bi[count] = ai[i];
            count++;
         }
         start = System.nanoTime();
         sli.sort4(bi);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s5RandomTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 5 Random\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         start = System.nanoTime();
         sli.sort5(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s5AscendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 5 Ascending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         start = System.nanoTime();
         sli.sort5(ai);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s5DescendingTest() {
      int key = 903836722;
      SortingLab<Integer> sli = new SortingLab<Integer>(key);
      int M = 600000;
      int N = 1000;
      double start;
      double elapsedTime;
      System.out.print("Sort 5 Descending\n");
      for (; N < M; N *= 2) {
         Integer[] ai = getRandomArray(N, Integer.MAX_VALUE);
         Arrays.sort(ai);
         Integer[] bi = new Integer[ai.length];
         int count = 0;
         for (int i = ai.length - 1; i >= 0; i--) {
            bi[count] = ai[i];
            count++;
         }
         start = System.nanoTime();
         sli.sort5(bi);
         elapsedTime = (System.nanoTime() - start) / 1_000_000_000d;
         System.out.print(N + "\t");
         System.out.printf("%4.3f\n", elapsedTime);
      }
   }
   
   public static void s3Stability() {
      Data[] a = {new Data(5, 1), new Data(4, 2), new Data(3, 3), new Data(5, 4),
         new Data(2, 5), new Data(1, 6), new Data(5, 7)};
      int key = 903836722;
      SortingLab<Data> sli = new SortingLab<Data>(key);
      sli.sort3(a);
      System.out.print("Sort 3 Stability Test\n");
      for(Data b: a) {
         System.out.print(b);
      }
   }
   
   public static void s5Stability() {
      Data[] a = {new Data(5, 1), new Data(4, 2), new Data(3, 3), new Data(5, 4),
         new Data(2, 5), new Data(1, 6), new Data(5, 7)};
      int key = 903836722;
      SortingLab<Data> sli = new SortingLab<Data>(key);
      sli.sort5(a);
      System.out.print("Sort 5 Stability Test\n");
      for(Data b: a) {
         System.out.print(b);
      }
   }
   
   //Generates array of random numbers.
   private static Integer[] getRandomArray(int N, int max) {
      Integer[] a = new Integer[N];
      java.util.Random rng = new java.util.Random();
      for (int i = 0; i < N; i++) {
         a[i] = rng.nextInt(max);
      }
      return a;
   }
   
}