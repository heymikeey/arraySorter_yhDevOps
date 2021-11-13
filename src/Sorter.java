public class Sorter {

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
