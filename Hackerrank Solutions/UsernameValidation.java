import java.util.Scanner;
import java.util.regex.*;

class UsernameValidator 
{
    public static final String regularExpression = "[A-Za-z][A-Za-z0-9_]{7,29}";
    // this was the regular expression for the username
    // the first bracket for first character either uppercase letter or the lowercase letter ,
    // 2nd bracket for alphanumeric characters
    // 3rd bracket for 8 to 30 characters.
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
