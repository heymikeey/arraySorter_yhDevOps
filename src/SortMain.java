import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] unsorted = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();     
        int [] sorted = Sorter.sort(unsorted);                                         
        
        for (int i : sorted) {                                                          
           System.out.print(i + " ");
        }
        
    }
}
