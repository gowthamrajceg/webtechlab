import java.io.*;
import java.net.*;
import java.util.*;

public class server1
{
public static void main(String args[])  throws Exception {
Scanner sc=new Scanner(System.in);
Socket soc=new Socket("127.0.0.1",3000);
System.out.println("connected ............");
System.out.println("............");
DataOutputStream out=new DataOutputStream(soc.getOutputStream());
DataInputStream in=new DataInputStream(new BufferedInputStream(soc.getInputStream()));

String s=sc.next();
out.writeUTF(s);



}

}
