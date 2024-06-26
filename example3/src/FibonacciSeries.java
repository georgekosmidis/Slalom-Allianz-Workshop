
public class FibonacciSeries {
    public static void printFibonacciSeries(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); //printing 0 and 1    
        
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    
    public static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci Series of " + count + " numbers: ");
        printFibonacciSeries(count);
    }
}