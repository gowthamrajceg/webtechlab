import java.rmi.*;
import java.rmi.server.*;
public class SearchQuery extends UnicastRemoteObject implements Search
{
SearchQuery() throws RemoteException
{
super();
}
public String query(String a) throws RemoteException
{
String result="";
if(a.equals("ethical"))
result="found";
else
result="not";
return result;
}
}
