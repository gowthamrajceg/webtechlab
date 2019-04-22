import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;



public class  client
{
public static void main(String args[])  throws Exception
{
	Adder stub= (Adder)Naming.lookup("rmi://localhost:5000/sonoo");
	System.out.println("addition is "+stub.add(3,4));

}

}