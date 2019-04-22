import java.rmi.*;
import java.rmi.registry.*;


public class Server {

public static void main(String args[]) throws Exception
{

Adder stub=new AdderRemote();
Naming.rebind("rmi://localhost:5000/sonoo",stub);
}

}





