import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        // FOR US
        NumberFormat usa = NumberFormat.getCurrencyInstance
        (Locale.US);
        String us = usa.format(payment); 
        
        // for India - creating a local locale
        Locale ind = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(ind);
        String i = india.format(payment);
        
        // for china
        NumberFormat chin = NumberFormat.getCurrencyInstance
        (Locale.CHINA);
        String china = chin.format(payment); 
        
        // for france
        NumberFormat fr = NumberFormat.getCurrencyInstance
        (Locale.FRANCE);
        String france = fr.format(payment); 
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + i);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
