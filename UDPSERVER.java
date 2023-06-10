// Java program to illustrate Server side
// Implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer
{
    public static void main(String[] args) throws IOException
    {

        // Step 1 : Create a socket to listen at port 1234
        DatagramSocket ds = new DatagramSocket(1234); // one datagram for client node
        DatagramSocket ds2 = new DatagramSocket(1235); // one datagram for server node
        byte[] receive = new byte[65535];
        byte[] receive2 = new byte[65535];

        DatagramPacket DpReceive = null; // these are packets received by client and server basically
        DatagramPacket DpReceive2 = null;
        System.out.println("Connection Established");

        try{
            // Step 2 : create a DatgramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);
            DpReceive2 = new DatagramPacket(receive2, receive2.length);

            // Step 3 : revieve the data in byte buffer.
            ds.receive(DpReceive);
            ds2.receive(DpReceive2);
            System.out.println("Client:" + data(receive));
            System.out.println("Client 2:" + data(receive2));

            // Exit the server if the client sends "bye"
            if (data(receive).toString().equals("bye"))
            {
                System.out.println("Client sent bye.....EXITING");
            }

            String n1 = data(receive).toString();
            String n2 =data(receive2).toString();

            if (data(receive2).toString().equals("0"))
            {
                System.out.println("Divide By 0 not possible");
                }
            else
            {
                int j;
                for(j=n1.length();j>=0;j--)
                {
                    System.out.print(n1.charAt(j));
                }
                int no1 = Integer.parseInt(n1);
                int no2 = Integer.parseInt(n2);
                int ans = no1/no2;
                // we will also print factorial of the number
                int i; int f=1;
                for(i=no1;i>0;i--)
                {
                    f = f*i;
                }
                System.out.println("Division = "+ ans );
                System.out.println("factorial = "+ f );
                }
                // Clear the buffer after every message.
                receive = new byte[65535];
                receive2 = new byte[65535];
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}

// server and client both get a datagram socket in hand
// both of them have datagram packets with byte array included in it
// if connection eastablished - it goes to client part

// server recieves the input in form of bytes in the packets
// then the values recieved are converted into string using string builder
// if the value entered is bye then exit the program
// for division process we check whether the input string is zero or not - if it is then division is not possible
// else the two strings we got is converted into integers and divided and result is printed.
