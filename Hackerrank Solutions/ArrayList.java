import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // N number of integer lines
        int n = sc.nextInt();
        // Two Dimensional ArrayList
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
         // Input of numbers in the line
        for(int i=1;i<=n;i++)
        {
            int d = sc.nextInt();
            ArrayList<Integer> inner_list=new ArrayList<>();
            for(int j=1;j<=d;j++)
            {
            int no = sc.nextInt();
            inner_list.add(no);
            }
            list.add(inner_list);
        }
        // queries
        int q = sc.nextInt();
        for(int k=0;k<q;k++)
        {
            int x =  sc.nextInt();
            int y =  sc.nextInt();
            
        // To check for the numbers if it availaible or not  
        try{
           System.out.println(list.get(x-1).get(y-1));
        }
        catch(Exception e){
            System.out.println("ERROR!");
        }
        }
    }
}
