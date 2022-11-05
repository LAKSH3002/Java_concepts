import java.util.*;
public class pascals {
    public int fact(int i)
    {
        if (i == 0)
            return 1;
        return i * fact(i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int i, j;
        int n = sc.nextInt(); // n=3
        pascals g = new pascals();
        for (i = 0; i <= n; i++) // 2 to 3
        {
            for (j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
                System.out.print(" " + g.fact(i) / (g.fact(i - j) * g.fact(j))); 
            }
            System.out.println();
        }
    }
}
