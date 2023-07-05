import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Two dimensional ArrayList
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) 
        {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            // One dimensional Array List
            List<Integer> arrRowItems = new ArrayList<>();
            
            // Input of elements in every row.
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();
        // We have the 2D Array Ready , now we have to create hour glass in the problem.
        // 16 hourglasses is possible in a 6 by 6 matrix.
int largest = 0;      
int a, b, c, d, e, f, g;
for (int x=0;x<4;x++)
{
    for (int y=0;y<4;y++)
    {
        // Upper row
        a = arr.get(x).get(y);
        b = arr.get(x).get(y+1);
        c = arr.get(x).get(y+2);
        // middle row
        d = arr.get(x+1).get(y+1);
        // lower Row
        e = arr.get(x+2).get(y);
        f = arr.get(x+2).get(y+1);
        g = arr.get(x+2).get(y+2);
                
        int sum = a + b + c + d +e + f + g;
        
        if(sum < 0 && largest==0)
        {
            largest = 0;
        }
        if(sum > largest)
        {
            largest = sum;
        }
    }
}
System.out.println(largest);
}
}
