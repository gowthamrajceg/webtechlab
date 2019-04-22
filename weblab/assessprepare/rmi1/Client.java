import java.rmi.*;
import java.rmi.registry.*;


public class Client {

public static void main(String args[]) throws Exception
{

Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println(stub.add(3,4));

}

}





