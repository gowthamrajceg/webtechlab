import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;



public class  client
{
public static void main(String args[])  throws Exception
{
	Search stub= (Search)Naming.lookup("rmi://localhost:5000/sonoo");
	System.out.println("result is "+stub.search("hello"));

}

}