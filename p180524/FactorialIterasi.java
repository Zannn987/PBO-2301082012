
package pbo2301082012.p180524;


public class FactorialIterasi {
    
    static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(factorial(n));
    }
}
