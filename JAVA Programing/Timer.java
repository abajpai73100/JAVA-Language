import java.awt.*;
import java.applet.*;
// <applet code="Timer" width=600 height=400></applet>
public class Timer extends Applet implements Runnable{
  int m,s;
  boolean check;
  Thread t;
  String n;
  public void init(){
    setBackground(Color.yellow);
  }
  public void start(){
    m=s=0;
    n="";
    check = false;
    t=new Thread(this);
    t.start();
  }
  public void run(){
    while(true){
      s++;
      if(s==60){
        s=0;
        m++;
      }
      repaint();
      try{
        t.sleep(1000);
      }catch(InterruptedException e){
        System.out.println(e);
      }
      if(check){
        break;
      }
    }
  }
  public void paint(Graphics g){
    String str="";
    g.setFont(new Font("Cambria",Font.BOLD,40));
    g.setColor(Color.red);
    str="["+String.valueOf(m)+" : "+String.valueOf(s)+"]";
    g.drawString(str,100,200);
    if(s%5==0)
    // g.setColor(Color.green);
    g.drawString("+5 seconds up",250,200);
  }
  public void stop(){
    check=true;
    m=s=0;
  }
}
