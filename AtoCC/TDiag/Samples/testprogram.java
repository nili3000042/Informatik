import java.awt.*;
import java.awt.event.*;

public class testprogram extends Frame implements ActionListener
{
  	String[] MyArgs;

	public static void main(String[] args)
	{
		new testprogram(args);
	}

	public testprogram(String[] args)
	{
		addWindowListener( new WindowAdapter ()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
			);
		MyArgs = args;
		setLocation(360,260);
		setSize(300,200);
		setResizable(false);
		setVisible(true);
	}
 
	public void paint(Graphics g)
	{
		g.drawString("Hello World!", 110, 110);
		if (MyArgs.length > 0) 
		{
  			g.drawString(MyArgs[0], 10, 140);
		}

	}

	public void actionPerformed(ActionEvent arg0) 
	{
	}
}
