import java.io.*;
import java.net.*;
import java.util.*;

public class server2
{
public static void main(String args[]) throws Exception
{
ServerSocket ser=new ServerSocket(3000);
Socket soc=ser.accept();
BufferedReader keyread=new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream=soc.getOutputStream();
PrintWriter pwrite=new PrintWriter(ostream,true);
InputStream istream=soc.getInputStream();
BufferedReader receive=new BufferedReader(new InputStreamReader(istream));

String send,re;
while(true)
{
if((re=receive.readLine())!=null)
System.out.println(re);
send=keyread.readLine();
pwrite.println(send);
pwrite.flush();


}

}


}
