import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// <applet code="GUI" height=300 width=500></applet>
public class GUI extends Applet{
  int c,x,y;
  char ch;
  public void init(){
    addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent me){
        x=me.getX();
        y=me.getY();
        c=1;
        repaint();
      }
      public void mousePressed(MouseEvent me){
        x=me.getX();
        y=me.getY();
        c=2;
        repaint();
      }
      public void mouseReleased(MouseEvent me){
        x=me.getX();
        y=me.getY();
        c=3;
        repaint();
      }
    });
    addKeyListener(new KeyAdapter(){
      public void keyTyped(KeyEvent ke){
        String tmp="Key typed is : "+ke.getKeyChar();
        showStatus(tmp);
      }
    });
  }
  public void paint(Graphics g){
    if(c==1){g.drawOval(x-35,y-35,70,70);}
    else if(c==2){g.drawRect(x,y,70,40);}
    else if(c==3){g.drawRect(x,y,50,50);}
  }
}
