 /* problem statement
 you have to create a custom calculator with following operations:
 1 - addition
 2 - Subraction
 3 - multiplication
 4 - division
 and throws the following exceptions
    1.Invalid input exception - eg - 8 & p - input Mismatch Exception - doubt.
    2.Cannot divide by 0 exception - done
    3.Max input exception , if any of the inputs is greater than 10000 - done
    4.Max Multiplier reached exception - dont allow any multiplication input to be greater than 7000 - done
     */
 // how to go for invalid input exception.
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
class invalidException extends Exception{
    @Override
    public String toString() {
        return "INVALID INPUT";
    }
}
class MaxLimitException extends Exception{
    @Override
    public String toString() {
        return "MAX INPUT LIMIT EXCEEDED";
    }
}
class MultiplierException extends Exception{
    @Override
    public String toString() {
        return "Number greater than 7000 cant be enterd for multiplication";
    }
}
class calci
{
    public void addition()
    {
        // invalid input exception
        // maximum limit exception
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int n2 = sc.nextInt();
                try {
                    if (n1 <= 10000 && n2 <= 10000)
                    {
                        int c = n1 + n2;
                        System.out.println(c);
                    } else {
                        throw new MaxLimitException();
                    }
                }
                catch(InputMismatchException e)
                {
                    System.out.println(e);
                }
                catch (MaxLimitException e)
                {
                    System.out.println("INVALID INPUT EXCEPTION");
                }
    }
    public void subraction()
    {
        // invalid input mismatch
        // max limit reached
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int n2 = sc.nextInt();
        try {
            if (n1 <= 10000 && n2 <= 10000)
            {
                int c = n1 - n2;
                System.out.println(c);
            } else {
                throw new MaxLimitException();
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("INVALID INPUT BRO");
            System.out.println(e);
        }
        catch (MaxLimitException e)
        {
            System.out.println("INVALID INPUT EXCEPTION");
        }

    }
    public void multiplication()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int n2 = sc.nextInt();
        try{
            if(n1<7000 && n2<7000)
            {
                int m = n1*n2;
                System.out.println("The result is "+ m);
            }
            else {
                throw new MultiplierException();
            }
        }
        catch(MultiplierException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
    public void division()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int n2 = sc.nextInt();
        try{
            if(n1<=10000 && n2<=10000)
            {
                int d=n1/n2;
                System.out.println("The result is "+d);
            }
        }catch(ArithmeticException e)
        {
            System.out.println("CANNOT DIVIDE BY ZERO BRO");
            System.out.println(e);
        }
    }
}
public class calculator_ex6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULATOR");
        System.out.println("ENTER THE OPERATION TO BE PERFORMED");
        System.out.println("1 - ADDITION");
        System.out.println("2 - SUBRACTION");
        System.out.println("3 - MULTIPLICATION");
        System.out.println("4 - DIVISION");
        int ch = sc.nextInt();
        calci c = new calci();
        switch(ch)
        {
            case 1:
                c.addition();
                break;
            case 2:
                c.subraction();
                break;
            case 3:
                c.multiplication();
                break;
            case 4:
                c.division();
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
    }
}
