import java.rmi.*;
import java.rmi.registry.*;


public class Client {

public static void main(String args[]) throws Exception
{

Search stub=(Search)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println(stub.query("ethical"));

}

}





