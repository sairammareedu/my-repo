import java.util.*;
class Fibonacci
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            int x = a + b;
            a = b;
            b = x;
        }
    }
}