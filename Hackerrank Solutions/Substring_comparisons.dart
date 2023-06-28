import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = " ";
        String largest = " ";
        
    // Creation of a string resultay and copying the generated substring into this resultay for evaluation.
    
       String result[]=new String[(s.length()-k)+1];
       int len = result.length;
        for(int i=0;i<=(s.length()-k);i++)
        {
            result[i]=s.substring(i,(i+k));
        }
        
        // We will sort the resultay and we can easily get the smallest and the largest string in hand.
        for(int j=0;j<len;j++)
        {
            for(int h=j+1;h<len;h++)
            {
                 if(result[h].compareTo(result[j])<0)
                 {
                String temp=result[h];
                result[h]=result[j];
                result[j]=temp;
                 }
             }
        }
        smallest=result[0];
        largest=result[len-1];
        // sorting done
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
