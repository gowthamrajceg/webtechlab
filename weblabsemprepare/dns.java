import java.io.*;
import java.net.*;
import java.util.*;


public class dns
{
	public static void main(String args[]) throws Exception{
DatagramSocket ds=new DatagramSocket();
Scanner sc=new Scanner(System.in);
InetAddress addr=InetAddress.getByName("127.0.0.1");
byte[] rb=new byte[1024];
byte[] sb=new byte[1024];
String s=sc.next();
sb=s.getBytes();
DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,1309);
ds.send(sender);
DatagramPacket receiver=new DatagramPacket(rb,rb.length);
ds.receive(receiver);
String str=new String(receiver.getData());
System.out.println("message is "+str.trim());

ds.close();


}


}
