import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
<html>
<applet code="N4_randomCircle.class" height=500 width=500>
</applet>
</html>
*/

public class N4_randomCircle extends Applet
{
	int x, diameter, radius;
	double area, circumference;
	Random r=new Random();
	
	public void init()
	{
		x=r.nextInt(100);
		diameter=x;
		radius=diameter/2;
		area=(22/7)*radius*radius;
		circumference=2*(22/7)*radius;
		
		repaint();
	}
	
	
	public void paint(Graphics g)
	{
		g.drawOval(0,0,x,x);
		g.drawString("Radius = "+radius,10,110);
		g.drawString("Diameter = "+diameter,10,120);
		g.drawString("Circumference = "+circumference,10,130);
		g.drawString("Area = "+area,10,140);
	}
}
