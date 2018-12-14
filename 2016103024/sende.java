import java.io.*;
import java.net.*;
public class sende
{
public static void main(String args[]) throws  Exception
{
DatagramSocket ds=new DatagramSocket();
String s="hello there!";
InetAddress addr=InetAddress.getByName("127.0.0.1");
DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),addr,3000);
ds.send(dp);
System.out.println("message sent");
ds.close();

}
}