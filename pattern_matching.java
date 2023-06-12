import java.util.Scanner;
import java.util.regex.*;

public class pattern_matching
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0)
        {
            String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                // if(Pattern.matches(p, pattern))
                System.out.println("valid");
            }
            catch(PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }
}



