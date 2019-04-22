import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public interface  Adder extends  Remote   {

public int add(int a,int b) throws RemoteException;


}
