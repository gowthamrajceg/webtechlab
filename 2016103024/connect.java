import java.net.*;
public class connect
{
public static void main(String args[]) throws UnknownHostException
{
String s="https://www.google.com";
try
{
InetAddress ip=InetAddress.getByName(new URL(s).getHost());
System.out.println(ip);
}
catch(MalformedURLException e)
{
System.out.println(e);
}
}
 }