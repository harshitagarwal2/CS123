import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<html>
<applet code="N1_AWT_Concepts.class" height=500 width=500>
</applet>
</html>
*/

public class N1_AWT_Concepts extends Applet implements ItemListener, ActionListener
{
	TextField t1, t2;
	CheckboxGroup cg;
	Checkbox c1, c2, c3;
	boolean check;
	
	public void init()
	{
		cg = new CheckboxGroup();
		c1=new Checkbox ("Palindrome",cg,false);
		c2=new Checkbox ("Length",cg,false);
		c3=new Checkbox ("Change case",cg,false);
		t1=new TextField (20);
		t2=new TextField (20);
		add(t1);
		add(t2);
		add(c1);
		add(c2);
		add(c3);
		t1.addActionListener(this);
		t2.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public boolean palindrome(String ss)
	{
		String ss2="";
		for (int i=ss.length()-1; i>=0; i--)
		{
			ss2+=ss.charAt(i);
		}
		
		if (ss.equals(ss2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public String changeCase(String ss)
	{
		char arr[]=ss.toCharArray();
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>='a' && arr[i]<='z')
			{
				arr[i]-=32;
			}
			else if (arr[i]>='A' && arr[i]<='Z')
			{
				arr[i]+=32;
			}
		}
		String ss2="";		
		for (int i=0; i<arr.length; i++)
		{
			ss2+=arr[i];
		}
		return ss2;
	}

	
	public void paint(Graphics g)
	{
		String s=t1.getText();
		if (cg.getSelectedCheckbox().getLabel().equals("Palindrome"))
		{
			boolean b=palindrome(s);
			if (b==true)
			{
			t2.setText("Palindrome");
			}
			else if (b==false)
			{
			t2.setText("Not Palindrome");
			}
		}
		else if (cg.getSelectedCheckbox().getLabel().equals("Length"))
		{
			int l=s.length();
			String s2=Integer.toString(l);	
			t2.setText(s2);
		}
		else if (cg.getSelectedCheckbox().getLabel().equals("Change case"))
		{	
			String s3=changeCase(s);
			t2.setText(s3);
		}
	}	
}
