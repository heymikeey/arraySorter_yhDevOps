import java.util.Arrays;

public class SortTest {
    // 5 olika tester med olika testfall, negativa tal, 0 och positiva tal för att 
    // säkerställa att er sorteringsalgoritm fungerar för alla möjliga listor av tal
   
    private int[] typeConverter(String[] args) {
        return Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
    }

    // 
    private void runTest(String[] example) {
        int[] toSort = typeConverter(example);
        int[] sorted = Sorter.sort(toSort);
        System.out.print(Arrays.toString(sorted));

    
    }
    
    public static void main(String[] args) {
        String[] array1 = {"76", "11", "-55", "2", "16", "-21", "7", "88"};
        int[] array1_expected = {-55, -21, 2, 7, 11, 16, 76, 88};

        String[] array2 = {"144", "34", "68", "0", "1", "919", "399", "8"};
        String[] array3 = {"-13", "-99", "-34", "-512", "-1", "-131"};

        
        SortTest array1_test = new SortTest();
        SortTest array2_test = new SortTest();
        SortTest array3_test = new SortTest();
        SortTest array4_test = new SortTest();
        SortTest array5_test = new SortTest();

        array1_test.runTest(array1);

    }
    
}
