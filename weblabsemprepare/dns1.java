import java.io.*;
import java.net.*;
import java.util.*;


public class dns1
{
	public static void main(String args[])  throws Exception  {
DatagramSocket ds=new DatagramSocket(1309);
Scanner sc=new Scanner(System.in);

byte[] rb=new byte[1024];
byte[] sb=new byte[1024];
DatagramPacket receiver=new DatagramPacket(rb,rb.length);
ds.receive(receiver);
String str=new String(receiver.getData());
System.out.println("message is "+str.trim());


String s=sc.next();
sb=s.getBytes();

InetAddress addr=receiver.getAddress();
int port=receiver.getPort();
DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,port);
ds.send(sender);


ds.close();


}


}
