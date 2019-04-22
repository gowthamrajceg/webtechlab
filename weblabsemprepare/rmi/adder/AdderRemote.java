import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public class AdderRemote  extends UnicastRemoteObject implements  Adder
{
	AdderRemote() throws  Exception
	{
	super();
	}

	public int add(int x,int y)
	{
	return x+y;
	}

}