import java.util.*;
public class Exceptions{
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }catch(Exception e)// e is like an argument to a function.
        {
            System.out.println("WE FAILED TO DIVIDE");
            System.out.println(e);
        }


// handling array and other exceptions
        int marks[] = new int[7];
        marks[0] = 7;
        marks[1]=56;
        marks[2] = 6;
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE ARRAY INDEX");
        int ind = sc.nextInt();

        System.out.println("ENTER THE NUMBER YOU WANT TO DIVIDE THE VALUE WITH");
        int no = sc.nextInt();
        try{
            System.out.println("THE VALUE AT ARRAY INDEX ENTERED IS "+marks[ind]);
            System.out.println("THE VALUE OF ARRAY-VALUE/NUMBER IS "+marks[ind]/no);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ArithmeticException OCCURED");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException OCCURED");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("SOME OTHER EXCEPTION OCCURED");
            System.out.println(e);
        }


    }
}
