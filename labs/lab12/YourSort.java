/* YourSort.java */

public class YourSort {

  public static void sort(int[] A) {
      if(A.length < 50) {
	  Sort.insertionSort(A);
      } else {
	  Sort.quicksort(A);
      }
  }
}
