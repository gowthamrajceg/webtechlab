import java.net.*;
import java.util.*;
import java.io.*;

public class client
{
public static void main(String args[]) throws Exception
{
	DatagramSocket soc=new DatagramSocket();
	InetAddress addr=InetAddress.getByName("127.0.0.1");
	byte[]  sb=new byte[1024];
	byte[] rb=new byte[1024];
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	String str=in.readLine();
	
	sb=str.getBytes();
	DatagramPacket sender=new DatagramPacket(sb,sb.length,addr,3000);
	soc.send(sender);
		DatagramPacket receiver=new DatagramPacket(rb,rb.length);
	soc.receive(receiver);
	String s=new String(receiver.getData());
	System.out.println("ip address"+s.trim());
	soc.close();
}
}