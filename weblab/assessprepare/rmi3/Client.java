import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Client
{
public static void main(String args[]) throws Exception
{
fact stub=(fact)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println("factorial of 5 is"+stub.fact(5));
}
}
