import java.util.ArrayList;
import java.util.Scanner;
// arraylist program
// methods of array list used are
// .add() , .addAll() , .size() , .set() , . clear() , . indexOf()
// .lastIndexOf() , .contains() , .remove()
public class array_list
{
    public static void main(String[] args)
    {
        // generic syntax
        ArrayList<Integer> AL = new ArrayList<>();
        // modified array
        // can do some new operations with this array
        // can resize , can insert elements
        AL.add(6);
        AL.add(9);
        AL.add(5);
        AL.add(2);
        AL.add(0,5);
        // add() - inserts an element in the array list
        // size() - returns number of number of elements in the list
        System.out.println("ARRAY LIST ONE IS");
        for(int i =0;i<AL.size();i++)
        {
            System.out.print(AL.get(i)+ " ");
        }
        System.out.println();
        // .get - to access elements
        // .addAll()
        ArrayList<Integer> Al = new ArrayList<>(8);
        // can give capacity of arraylist also
        Al.add(16);
        Al.add(19);
        Al.add(15);
        Al.add(12);
        Al.add(0,14);
       // Al.clear(); - clears all the elements in the list
        // try this function
        System.out.println("ARRAY LIST TWO IS:");
        for (int i = 0;i<Al.size();i++)
        {
            System.out.print(Al.get(i)+" ");
        }
        System.out.println();
        // combining both
        System.out.println("COMBINING BOTH LISTS");
        AL.addAll(Al);
        for(int j=0;j<AL.size();j++)
        {
            System.out.print(AL.get(j)+" ");
        }
        //.contains() - boolean function - returrs true or false
        System.out.println();
        System.out.println(Al.contains(22));
        // .indexof() - returns index of the element at which it is present
        // .lastindexof() - returns the last occurence of an element
        System.out.println(AL.indexOf(6));
        System.out.println(AL.indexOf(15));
        System.out.println(AL.lastIndexOf(0));
        // remove() - removes element from the list
        // set() - you have a control of the list in hand
        System.out.println(Al.set(2,22));
    }
}
