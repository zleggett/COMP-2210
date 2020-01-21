import java.util.Arrays;

/**
* Defines a library of selection methods
* on arrays of ints.
*
* @author   Zachary Leggett (zjl0002@auburn.edu)
* @author   Dean Hendrix (dh@auburn.edu)
* @version  08-23-2018
*
*/
public final class Selector {

   /**
    * Can't instantiate this class.
    *
    * D O   N O T   C H A N G E   T H I S   C O N S T R U C T O R
    *
    */
   private Selector() { }


   /**
    * Selects the minimum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int min(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
      int min = a[0];
      for (int i = 1; i < a.length; i++) {
         if (a[i] < min) {
            min = a[i];
         }
      }
      return min;
   }


   /**
    * Selects the maximum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int max(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
      int max = a[0];
      for (int i = 1; i < a.length; i++) {
         if (a[i] > max) {
            max = a[i];
         }
      }
      return max;
   }


   /**
    * Selects the kth minimum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth minimum value. Note that there is no kth
    * minimum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmin(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
      if (k < 1 || k > a.length) {
         throw new IllegalArgumentException("Invalid k value.");
      }
      
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      int count = 1;
      for (int i = 0; i < b.length - 1; i++) {
         if (b[i] != b[i + 1]) {
            count++;
         }
      }
      
      if (k > count) {
         throw new IllegalArgumentException("Invalid k value.");
      }
      
      int[] c = new int[count];
      int count1 = 0;
      for (int i = 0; i < b.length - 1; i++) {
         if (b[i] != b[i + 1]) {
            c[count1] = b[i];
            count1++;
         }
      }
      c[count - 1] = b[b.length - 1];
      
      return c[k - 1];
   }


   /**
    * Selects the kth maximum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth maximum value. Note that there is no kth
    * maximum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmax(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
      if (k < 1 || k > a.length) {
         throw new IllegalArgumentException("Invalid k value.");
      }
      
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      int count = 1;
      for (int i = 0; i < b.length - 1; i++) {
         if (b[i] != b[i + 1]) {
            count++;
         }
      }
      
      if (k > count) {
         throw new IllegalArgumentException("Invalid k value.");
      }
      
      int[] c = new int[count];
      int count1 = 0;
      for (int i = 0; i < b.length - 1; i++) {
         if (b[i] != b[i + 1]) {
            c[count1] = b[i];
            count1++;
         }
      }
      c[count - 1] = b[b.length - 1];
      
      return c[c.length - k];
   }


   /**
    * Returns an array containing all the values in a in the
    * range [low..high]; that is, all the values that are greater
    * than or equal to low and less than or equal to high,
    * including duplicate values. The length of the returned array
    * is the same as the number of values in the range [low..high].
    * If there are no qualifying values, this method returns a
    * zero-length array. Note that low and high do not have
    * to be actual values in a. This method throws an
    * IllegalArgumentException if a is null or has zero length.
    * The array a is not changed by this method.
    */
   public static int[] range(int[] a, int low, int high) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
      int length = 0;
      for (int i = 0; i < a.length; i++) {
         if (low <= a[i] && a[i] <= high) {
            length++;
         }
      }
      int[] x = new int[length];
      int count = 0;
      for (int i = 0; i < a.length; i++) {
         if (low <= a[i] && a[i] <= high) {
            x[count] = a[i];
            count++;
         }
      }
      return x;
   }


   /**
    * Returns the smallest value in a that is greater than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int ceiling(int[] a, int key) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
   
      int length = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= key) {
            length++;
         }
      }
      
      int[] x = new int[length];
      if (x.length == 0) {
         throw new IllegalArgumentException("No values meet criteria.");
      }
      int count = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= key) {
            x[count] = a[i];
            count++;
         }
      }
      return min(x);
   }


   /**
    * Returns the largest value in a that is less than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int floor(int[] a, int key) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array should not be empty");
      }
   
      int length = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] <= key) {
            length++;
         }
      }
      
      int[] x = new int[length];
      if (x.length == 0) {
         throw new IllegalArgumentException("No values meet criteria.");
      }
      int count = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] <= key) {
            x[count] = a[i];
            count++;
         }
      }
      return max(x);
   }

}
