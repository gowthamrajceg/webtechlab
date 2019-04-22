import java.awt.*;
import java.applet.*;


public class MovingBanner extends Applet implements Runnable
{
String str="hello this isa simple banner";
Thread t;
Boolean b;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.yellow);
}
public void start()
{
t=new Thread(this);
b=false;
t.start();
}

public void run()
{
char ch;
for(;;)
{
try
{
repaint();
Thread.sleep(250);
ch=str.charAt(0);
str=str.substring(1,str.length());
str=str+ch;

}
catch(Exception e)
{}
}
}

public void stop()
{
b=true;
t=null;
}
public void paint(Graphics g)
{g.drawRect(10,10,300,150);
g.setColor(Color.yellow);
g.fillRect(10,10,300,150);
g.setColor(Color.red);
g.drawString(str,50,150);
}
}
