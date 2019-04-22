import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public interface fact extends Remote
{
public int fact(int n) throws RemoteException;

} 
