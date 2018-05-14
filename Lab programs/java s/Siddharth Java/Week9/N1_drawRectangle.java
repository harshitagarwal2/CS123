import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<html>
<applet code="N1_drawRectangle.class" height=500 width=500>
</applet>
</html>
*/

public class N1_drawRectangle extends Applet implements MouseListener
{
	int x1,y1,x2,y2,length,breadth, area;
	
	public void init()
	{
		this.addMouseListener(this);
	}
	
	public void mousePressed(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		length=x2-x1;
		breadth=y2-y1;
		area=length*breadth;
		repaint();
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
		
	}
	
	public void mouseEntered(MouseEvent me)
	{
		
	}
	
	public void mouseExited(MouseEvent me)
	{
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Area: "+area,10,10);
		g.drawRect(x1,y1,length,breadth);
	}
}
