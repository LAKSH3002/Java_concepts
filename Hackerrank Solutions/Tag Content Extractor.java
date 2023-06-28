import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
        // print the valid codes enclosed in html tags
        
        // create string for regex
        String expression = "<(.+)>(([^<>]+))</\\1>";
        
        // extract pattern from regex
        Pattern pattern = Pattern.compile(expression);
        
        // number of lines to be taken as an input
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine()); 
        
		while(testCases>0)
        {
			String tagline = in.nextLine();
            // use matcher
            Matcher matcher = pattern.matcher(tagline);
            // set counter variable as zero
            int c = 0;
            // repeat steps untill matcher finds data
            while(matcher.find() == true)
            {
                System.out.println(matcher.group(2));
                c++;
            }
            if(c==0)
            {
                System.out.println("None");
            }
			testCases--;
		}
        in.close();
	}
}



