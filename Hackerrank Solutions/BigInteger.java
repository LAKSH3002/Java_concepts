import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        BigInteger sum = A.add(B);
        BigInteger prod = A.multiply(B);
        
        System.out.println(sum);
        System.out.println(prod);
        
        sc.close();
    }
}
