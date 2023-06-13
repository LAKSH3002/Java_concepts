import java.io.*;
import java.util.*;

public class Solution 
{
    // outside main we declare static variables and the static initialisation block;
    private static int b;
    private static int h;
    protected static boolean status; 
    // static initialisation block
    static
    {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        sc.close();
        if(b<=0 || h<=0)
        {
          status = false;
          System.out.println("java.lang.Exception: Breadth and Height must be positive");  
        }
    }
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if(status)
        {
            int area = b*h;
            System.out.println(area);
        }
    }
}
    
        
