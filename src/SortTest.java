import java.util.Arrays;

public class SortTest {
    String[] positives;
    String[] negatives;
    String[] mixed;
    String[] duplicates;
    String[] single;
    
    int[] positivesSorted;
    int[] negativesSorted;
    int[] mixedSorted;
    int[] duplicatesSorted;
    int[] singleSorted;
    
    public SortTest() {
        this.positives = new String[] {"144", "34", "68", "0", "1", "919", "399", "8"};
        this.positivesSorted = new int[] {0, 1, 8, 34, 68, 144, 399, 919};
        
        this.negatives = new String[] {"-13", "-99", "-34", "-512", "-1", "-131"};
        this.negativesSorted = new int[] {-512, -131, -99, -34, -13, -1};
        
        this.mixed = new String[] {"76", "11", "-55", "2", "16", "-21", "7", "88"};
        this.mixedSorted = new int[] {-55, -21, 2, 7, 11, 16, 76, 88};
        
        this.duplicates = new String[] {"1", "0", "1", "0", "1", "0", "1", "0"};
        this.duplicatesSorted = new int[] {0, 0, 0, 0, 1, 1, 1, 1}; 
        
        this.single = new String[] {"9"};
        this.singleSorted = new int[] {9};
    }
   
    private static int[] typeConverter(String[] args) {
        return Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    }

    // 
    private static void runTest(String[] example, String expected) {
        int[] toSort = typeConverter(example);
        String sorted = Arrays.toString(Sorter.sort(toSort));

        System.out.println("Sample array: " + Arrays.toString(example));
        System.out.println("Expected sorted value: " + expected);
        System.out.println("Sorted value returned: " + sorted);

        if (sorted.equals(expected)) {
            System.out.println("Successful! Expected value returned.");

        }
        else {
            System.out.println("Failed! Did not return expected value");
        }
        
        System.out.println(" ");

    
    }
    
    public static void main(String[] args) {

        SortTest test = new SortTest();

        SortTest.runTest(test.positives, Arrays.toString(test.positivesSorted));
        SortTest.runTest(test.negatives, Arrays.toString(test.negativesSorted));
        SortTest.runTest(test.mixed, Arrays.toString(test.mixedSorted));
        SortTest.runTest(test.duplicates, Arrays.toString(test.duplicatesSorted));
        SortTest.runTest(test.single, Arrays.toString(test.singleSorted));

    }
    
}
