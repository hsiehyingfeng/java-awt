import java.awt.*;
public class test3
{
	public static void main (String args[])
	{
		test frame=new test();
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	
}
class test extends java.awt.Frame
{
	public test()
	{
		this.setTitle("Hello MCU ITE");
	}
}