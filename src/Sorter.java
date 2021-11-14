public class Sorter {

    // sorting method to sort int[] elements from smallest to biggest
    // compares iterated element [i] with the next element [j] in the array
    // elements switch place if [i] is bigger than [j] 
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int low = 0;
                if (array[i] > array[j]) {
                   low = array[i];
                   array[i] = array[j];
                   array[j] = low;
                } 
            }
            
        }
        return array;

        
    }
    
}
