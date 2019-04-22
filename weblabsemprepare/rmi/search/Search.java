import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public interface Search extends Remote
{
	public String search(String ser) throws RemoteException;
}