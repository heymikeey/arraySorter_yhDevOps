import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] unsorted = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();     // converts args from String[] to int[]
        int [] sorted = Sorter.sort(unsorted);                                          // variable to hold sorted array returned from sort method 
        
        // print sorted array in terminal
        for (int i : sorted) {                                                          
           System.out.print(i + " ");
        }
        
    }
}
