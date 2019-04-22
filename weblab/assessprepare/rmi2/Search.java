import java.rmi.*;
public interface Search extends Remote
{
public String query(String q) throws RemoteException;

} 
