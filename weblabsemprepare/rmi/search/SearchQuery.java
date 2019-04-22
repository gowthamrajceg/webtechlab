import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;


public class SearchQuery  extends UnicastRemoteObject  implements Search
{
	SearchQuery() throws Exception
	{
	super();
	}
	public String search(String ser)
	{
String result;

if(ser.equals("hello"))
result="found";
else
result="notfound";

return result;

	}
}