import java.util.*;

public class vector_prog {
    public static void main(String[] args) {
        int a[] = {21,23,25};
        int i;
        Vector list = new Vector(); // vector object created
        for(i=0;i<=10;i++)
        {
            list.add(i); // elements from 1 to 10 added in the list
        }
        // adding more three elements in the list
        list.addElement(5);
        list.addElement(10);
        list.addElement(20);
        // displaying initial list
        System.out.println("INITIAL LIST IS "+list);
        //inserting an element at index 5
        list.insertElementAt(25,5);
        System.out.println("FINAL LIST IS "+list);
        // displaying the size of the list
        System.out.println("THE SIZE OF VECTOR IS "+list.size());
        System.out.println("LIST CAPACITY IS "+list.capacity());
        // the capacity of the vector is the size of the array
        //We will take user input to take out the number present at a particular index
        Scanner sc = new Scanner(System.in);
        System.out.println("YOU CAN ACCESS ANY NUMBER THROUGH THE INDEX NUMBER");
        System.out.println("ENTER THE INDEX NUMBER");
        int n = sc.nextInt();
        System.out.println(list.elementAt(n));
    }
    // vector functions used in the program are:
    // .addElement , .insertElement , .add , .addAll , .size , .capacity , .elementAt
}
