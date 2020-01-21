import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Defines a library of selection methods on Collections.
 *
 * @author  Zachary Leggett (zjl0002@auburn.edu)
 * @author  Dean Hendrix (dh@auburn.edu)
 * @version 9/9/18
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
    * Returns the minimum value in the Collection coll as defined by the
    * Comparator comp. If either coll or comp is null, this method throws an
    * IllegalArgumentException. If coll is empty, this method throws a
    * NoSuchElementException. This method will not change coll in any way.
    *
    * @param coll    the Collection from which the minimum is selected
    * @param comp    the Comparator that defines the total order on T
    * @return        the minimum value in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T min(Collection<T> coll, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collecion or comparator should not be null");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      T min = coll.iterator().next();
      for (T value : coll) {
         if (comp.compare(min, value) > 0) {
            min = value;
         }
      }
      return min;
   }


   /**
    * Selects the maximum value in the Collection coll as defined by the
    * Comparator comp. If either coll or comp is null, this method throws an
    * IllegalArgumentException. If coll is empty, this method throws a
    * NoSuchElementException. This method will not change coll in any way.
    *
    * @param coll    the Collection from which the maximum is selected
    * @param comp    the Comparator that defines the total order on T
    * @return        the maximum value in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T max(Collection<T> coll, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collecion or comparator should not be null");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      T max = coll.iterator().next();
      for (T value : coll) {
         if (comp.compare(max, value) < 0) {
            max = value;
         }
      }
      return max;
   }


   /**
    * Selects the kth minimum value from the Collection coll as defined by the
    * Comparator comp. If either coll or comp is null, this method throws an
    * IllegalArgumentException. If coll is empty or if there is no kth minimum
    * value, this method throws a NoSuchElementException. This method will not
    * change coll in any way.
    *
    * @param coll    the Collection from which the kth minimum is selected
    * @param k       the k-selection value
    * @param comp    the Comparator that defines the total order on T
    * @return        the kth minimum value in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T kmin(Collection<T> coll, int k, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collecion or comparator should not be null");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      ArrayList<T> x = new ArrayList<T>();
      Iterator<T> itr = coll.iterator();
      while (itr.hasNext()) {
         T val = itr.next();
         x.add(val);
      }
      java.util.Collections.sort(x, comp);
      T kmin = null;
      int count = 0;
      for (int i = 0; i < x.size(); i++) {
         if (i == 0) {
            count++;
         }
         else if (comp.compare(x.get(i), x.get(i - 1)) > 0) {
            count++;
         }
         if (count == k) {
            kmin = x.get(i);
            break;
         }
      }
   
      if (count < k || k < 1) {
         throw new NoSuchElementException("Invalid k value.");
      }
      
      return kmin;
   }


   /**
    * Selects the kth maximum value from the Collection coll as defined by the
    * Comparator comp. If either coll or comp is null, this method throws an
    * IllegalArgumentException. If coll is empty or if there is no kth maximum
    * value, this method throws a NoSuchElementException. This method will not
    * change coll in any way.
    *
    * @param coll    the Collection from which the kth maximum is selected
    * @param k       the k-selection value
    * @param comp    the Comparator that defines the total order on T
    * @return        the kth maximum value in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T kmax(Collection<T> coll, int k, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collecion or comparator should not be null");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      ArrayList<T> x = new ArrayList<T>();
      Iterator<T> itr = coll.iterator();
      while (itr.hasNext()) {
         T val = itr.next();
         x.add(val);
      }
      java.util.Collections.sort(x, comp);
      T kmax = null;
      int count = 0;
      for (int i = x.size() - 1; i >= 0; i--) {
         if (i == 0) {
            count++;
         }
         else if (comp.compare(x.get(i), x.get(i - 1)) > 0) {
            count++;
         }
         if (count == k) {
            kmax = x.get(i);
            break;
         }
      }
   
      if (count < k || k < 1) {
         throw new NoSuchElementException("Invalid k value.");
      }
      
      return kmax;
   }


   /**
    * Returns a new Collection containing all the values in the Collection coll
    * that are greater than or equal to low and less than or equal to high, as
    * defined by the Comparator comp. The returned collection must contain only
    * these values and no others. The values low and high themselves do not have
    * to be in coll. Any duplicate values that are in coll must also be in the
    * returned Collection. If no values in coll fall into the specified range or
    * if coll is empty, this method throws a NoSuchElementException. If either
    * coll or comp is null, this method throws an IllegalArgumentException. This
    * method will not change coll in any way.
    *
    * @param coll    the Collection from which the range values are selected
    * @param low     the lower bound of the range
    * @param high    the upper bound of the range
    * @param comp    the Comparator that defines the total order on T
    * @return        a Collection of values between low and high
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> Collection<T> range(Collection<T> coll, T low, T high,
                                         Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collecion or comparator should not be null");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      ArrayList<T> x = new ArrayList<T>();
      Iterator<T> itr = coll.iterator();
      while (itr.hasNext()) {
         T val = itr.next();
         if (comp.compare(val, low) >= 0 && comp.compare(val, high) <= 0) {
            x.add(val);
         }
      }
      if (x.size() == 0) {
         throw new NoSuchElementException("No values fall in specified range");
      }
      return x;
   }


   /**
    * Returns the smallest value in the Collection coll that is greater than
    * or equal to key, as defined by the Comparator comp. The value of key
    * does not have to be in coll. If coll or comp is null, this method throws
    * an IllegalArgumentException. If coll is empty or if there is no
    * qualifying value, this method throws a NoSuchElementException. This
    * method will not change coll in any way.
    *
    * @param coll    the Collection from which the ceiling value is selected
    * @param key     the reference value
    * @param comp    the Comparator that defines the total order on T
    * @return        the ceiling value of key in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T ceiling(Collection<T> coll, T key, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collection or comparator should not be null.");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      Iterator<T> itr = coll.iterator();
      T ceiling = itr.next();
      if (itr.hasNext()) {
         for (T element: coll) {
            if (comp.compare(element, ceiling) > 0) {
               ceiling = element;
            }
         }
      
      }
      int count = 0;
      for (T element: coll) {
         if ((comp.compare(element, key) >= 0)
            && (comp.compare(element, ceiling) <= 0)) {
            ceiling = element;
            count++;
         }
      }
      
      if (count == 0) {
         throw new NoSuchElementException("No values meet criteria.");
      }
      
      return ceiling;
   }


   /**
    * Returns the largest value in the Collection coll that is less than
    * or equal to key, as defined by the Comparator comp. The value of key
    * does not have to be in coll. If coll or comp is null, this method throws
    * an IllegalArgumentException. If coll is empty or if there is no
    * qualifying value, this method throws a NoSuchElementException. This
    * method will not change coll in any way.
    *
    * @param coll    the Collection from which the floor value is selected
    * @param key     the reference value
    * @param comp    the Comparator that defines the total order on T
    * @return        the floor value of key in coll
    * @throws        IllegalArgumentException as per above
    * @throws        NoSuchElementException as per above
    */
   public static <T> T floor(Collection<T> coll, T key, Comparator<T> comp) {
      if (coll == null || comp == null) {
         throw new IllegalArgumentException("The collection or comparator should not be null.");
      }
      if (coll.size() == 0) {
         throw new NoSuchElementException("The collection should not be empty.");
      }
      
      Iterator<T> itr = coll.iterator();
      T floor = itr.next();
      if (itr.hasNext()) {
         for (T element: coll) {
            if (comp.compare(element, floor) < 0) {
               floor = element;
            }
         }
      
      }
      int count = 0;
      for (T element: coll) {
         if ((comp.compare(element, key) <= 0)
            && (comp.compare(element, floor) >= 0)) {
            floor = element;
            count++;
         }
      }
      
      if (count == 0) {
         throw new NoSuchElementException("No values meet criteria.");
      }
      
      return floor;
   
   }

}
