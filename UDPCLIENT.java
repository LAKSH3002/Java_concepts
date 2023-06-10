import java.net.*;
import java.net.DatagramSocket;
import java.io.*;
import java.util.*;

public class UDPClient
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
// creating objects of datagram
        DatagramSocket ds = new DatagramSocket();
        DatagramSocket ds2 = new DatagramSocket();

// creating byte buffers
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
        byte buf2[] = null;

//Taking inputs of numbers
        System.out.println("Number 1= ");
        String inp = sc.nextLine();
        System.out.println("Number 2= ");
        String inp2 = sc.nextLine();

// converting given integers to strings to sent it ahead
        buf = inp.getBytes();
        buf2 = inp2.getBytes();

// create datagram packet for sending
        DatagramPacket dpsend = new DatagramPacket(buf, buf.length,ip , 1234);
        DatagramPacket dpsend1 = new DatagramPacket(buf2, buf2.length,ip , 1235);

// invoke the send call to actually send
        ds.send(dpsend);
        ds2.send(dpsend1);

        if(inp.equals("bye"))
        {
            System.out.println("Bye");
        }
    }
}

    //socket object is created
    // two byte arrays are created which will take the inputs and convert it into byte array
    // it is stored in packet and sent to the server
