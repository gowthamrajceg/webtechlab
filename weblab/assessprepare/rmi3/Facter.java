import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public class Facter extends UnicastRemoteObject implements fact
{
Facter() throws RemoteException
{
super();
}
public int fact(int n) 
{int f=1;
for(int i=1;i<=n;i++)
f*=i;
return f;
}

} 
