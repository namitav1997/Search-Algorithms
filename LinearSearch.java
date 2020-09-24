/**
 * In computer science, linear search or sequential search is a method for finding a target value within a list. It sequentially checks each element of the list for the target value until a match is 
 * found or until all the elements have been searched.
 * 
 * Worst-case performance      O(n)
 * Best-case performance       O(1)
 * Average performance         O(n)
 * Worst-case space complexity O(1)
 * 
 * Refer to: "https://en.wikipedia.org/wiki/Linear_search" [Linear Search (Wikipedia)]
 */
public class LinearSearch {

    public static final int find(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int iValue = array[i];
            if (value == iValue)
                return i;
        }
        return Integer.MAX_VALUE;
    }
}
