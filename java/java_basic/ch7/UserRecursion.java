import java.util.Scanner;

public class UserRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("輸入兩個數");
        System.out.print("m = ");
        int m = scanner.nextInt();
        
        System.out.print("n = ");
        int n = scanner.nextInt();
        
        System.out.println("GCD: " + gcd(m,n));
    }
    private static int gcd(int m , int n) {
        if ( n == 0 ) {
            return m;
        }
        else {
            return gcd(n, m % n);
        }
    }
}