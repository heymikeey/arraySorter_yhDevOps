import java.util.Arrays;

public class SortTest {
    // 5 olika tester med olika testfall, negativa tal, 0 och positiva tal för att 
    // säkerställa att er sorteringsalgoritm fungerar för alla möjliga listor av tal
   
    private int[] typeConverter(String[] args) {
        return Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    }

    // 
    private void runTest(String[] example, String expected) {
        int[] toSort = typeConverter(example);
        String sorted = Arrays.toString(Sorter.sort(toSort));

        System.out.println("Sample array: " + Arrays.toString(example));
        System.out.println("Expected return value: " + expected);
        System.out.println("Sorted value returned: " + sorted);

        if (sorted.equals(expected)) {
            System.out.println("Successful! Returned expected value.");

        }
        else {
            System.out.println("Failed! Did not return expected value");
        }
        

    
    }
    
    public static void main(String[] args) {
        String[] array1 = {"76", "11", "-55", "2", "16", "-21", "7", "88"};
        int[] array1Expected = {-55, -21, 2, 7, 11, 16, 76, 88};

        String[] array2 = {"144", "34", "68", "0", "1", "919", "399", "8"};
        int[] array2Expected = {0, 1, 8, 34, 68, 144, 399, 919};

        String[] array3 = {"-13", "-99", "-34", "-512", "-1", "-131"};
        int[] array3Expected = {-512, -131, -99, -34, -13, -1};
        
        SortTest array2_test = new SortTest();
        SortTest array3_test = new SortTest();
        SortTest array4_test = new SortTest();
        SortTest array5_test = new SortTest();

        array3_test.runTest(array3, Arrays.toString(array3Expected));

    }
    
}
