public class Main {
    public static void main(String[] args) {
        for (long i = 1; i < 15; i++) {
            System.out.println(factorial(i));
        }
    }
    
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        
        return n * factorial(n - 1);


        
    }
}