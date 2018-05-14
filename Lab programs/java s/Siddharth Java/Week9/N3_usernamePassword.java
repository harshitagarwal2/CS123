import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<html>
<applet code="N3_usernamePassword.class" height=500 width=500>
</applet>
</html>
*/

public class N3_usernamePassword extends Applet implements ActionListener
{
	Label l1, l2;
	Button b1;
	TextField t1, t2;
	int c=-1;
	
	public void init()
	{
		l1=new Label("Username: ");
		l2=new Label("Password: ");
		b1=new Button("Login");
		t1=new TextField (10);
		t2=new TextField (10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(t1.getText().equals("siddharth") && t2.getText().equals("password"))
		{
			c=1;
		}
		else
		{
			c=0;
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{
		if (c==1)
		{
			g.drawString("Login Successful",10,50);
		}
		else if (c==0)
		{
			g.drawString("Login Unsuccessful",10,50);
		}
	}
}
