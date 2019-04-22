import java.io.*;
import java.net.*;
import java.util.*;

public class client1
{
public static void main(String args[])  throws Exception {
Scanner sc=new Scanner(System.in);
ServerSocket soc=new ServerSocket(3000);
System.out.println("server establish ............");
System.out.println("waiting for connnection............");


Socket conn=soc.accept();

DataInputStream in=new DataInputStream(new BufferedInputStream(conn.getInputStream()));


String v=in.readUTF();
System.out.println("received"+v);

}
}

