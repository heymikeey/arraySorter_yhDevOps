import java.util.Arrays;

public class SortTest {
    // 5 olika tester med olika testfall, negativa tal, 0 och positiva tal för att 
    // säkerställa att er sorteringsalgoritm fungerar för alla möjliga listor av tal
   
    private int[] typeConverter(String[] args) {
        int[] ara = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        runTest(ara);
    }
    // 
    private void runTest(String[] example) {


    
    }
    
    public static void main(String[] args) {
        String[] arr1 = {"76", "11", "-55", "2", "16", "-21", "7", "88"};
        String[] arrTest2 = {"144", "34", "68", "0", "1", "919", "399", "8"};
        String[] arrTest3 = {"-13", "-99", "-34", "-512", "-1", "-131"};
        String[] arrTest4 = {"120.0", "411.0", "0.0", "-3.0", "10", "44"};
        String[] arrTest5 = {"true", "false", "true", "false", "true", "false"};
        


        //SortTest t1 = new SortTest();
        //t1.test(arr1);

    }
    
}
