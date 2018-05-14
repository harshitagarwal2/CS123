import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<html>
<applet code="N2_drawShapesMenu.class" height=500 width=500>
</applet>
</html>
*/

public class N2_drawShapesMenu extends Applet implements MouseListener, ActionListener
{
	int x1,y1,x2,y2,length,breadth, area;
	Button b1,b2,b3;
	int rectangle=0, line=0, oval=0;
	
	
	public void init()
	{
		b1=new Button("Oval");
		b2=new Button("Line");
		b3=new Button("Rectangle");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		this.addMouseListener(this);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==b1)
		{
			oval=1;
			rectangle=0;
			line=0;
		}
		else if (ae.getSource()==b2)
		{
			line=1;
			rectangle=0;
			oval=0;
		}
		else if (ae.getSource()==b3)
		{
			rectangle=1;
			oval=0;
			line=0;
		}
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
		showStatus("Mouse: ("+x2+", "+y2+")");
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
		if (oval==1)
		{
			g.drawOval(x1,y1,length*3,breadth*3);
		}
		
		else if (rectangle==1)
		{
			g.drawRect(x1,y1,length,breadth);
		}
		
		else if (line==1)
		{
			g.drawLine(x1,y1,x2,y2);
		}

	}
}
