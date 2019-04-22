import java.io.*;
import java.net.*;
import java.util.*;

public class client2
{
public static void main(String args[])  throws Exception
{
Socket soc=new Socket("127.0.0.1",3000);
BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream=soc.getOutputStream();
PrintWriter pwrite=new PrintWriter(ostream,true);
InputStream istream=soc.getInputStream();
BufferedReader receive=new BufferedReader(new InputStreamReader(istream));

String send,re;
while(true)
{
send=keyread.readLine();
pwrite.println(send);
pwrite.flush();
if((re=receive.readLine())!=null)
System.out.println(re);

}

}


}
