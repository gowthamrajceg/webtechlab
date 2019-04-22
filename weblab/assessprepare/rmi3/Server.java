import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Server
{
public static void main(String args[]) throws Exception
{
fact stub=new Facter();
Naming.rebind("rmi://localhost:5000/sonoo",stub);
System.out.println("server started");
}
}
