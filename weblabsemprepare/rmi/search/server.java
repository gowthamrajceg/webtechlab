import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;



public class  server
{
public static void main(String args[]) throws Exception 
{
	Search stub=new SearchQuery();
	Naming.rebind("rmi://localhost:5000/sonoo",stub);
}

}