import java.awt.*;
import java.applet.*;
// <applet code="DisplayImage" width=500 height=400></applet>
public class DisplayImage extends Applet{
  Image picture;
  public void init(){
      picture=getImage(getCodeBase(),"racoon.jpg");
  }
  public void paint(Graphics g){
    g.drawImage(picture,5,50,this);
  }
}
