import java.rmi.*;
public interface Adder extends Remote
{
public int add(int a,int b) throws RemoteException;

} 
