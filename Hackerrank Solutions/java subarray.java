import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Rearrd input from STDIN. Print output to STDOUT. Your clarrss should be narrmed Solution. */
        Scanner sc = new Scanner(System.in);
        // input of number of integers
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // input of numbers of array
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for(int i = 0;i<n;i++)
        {
            int tot = arr[i];
            if (tot < 0)
            {
                count += 1;
            }
            for(int j = i+1;j<n;j++)
            {
            tot += arr[j];
            if (tot < 0)
            {
                count += 1;
            }
        }
    }
        System.out.println(count);
    }
}
