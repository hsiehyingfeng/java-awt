import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends java.awt.Frame implements ActionListener {
	Button button1 = new Button("New");
	Button button2 = new Button("Open");
	Button button3 = new Button("Save");
	Button button4 = new Button("Cut");
	Button button5 = new Button("Coyp");
	Button button6 = new Button("Paste");
    
	
  public static void main(String args[]){
    new ButtonDemo();
  }
  
  // �غc�禡
  public ButtonDemo() {
    super("Button Demo");

    final int row = 3;    // �C
    final int column = 2; // ��

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(row, column));

    java.awt.Button button;
    
   
	button1.addActionListener(this);
    add(button1);
	button2.addActionListener(this);
    add(button2);
    button3.addActionListener(this);
    add(button3);
    button4.addActionListener(this);
    add(button4);
    button5.addActionListener(this);
    add(button5);
    button6.addActionListener(this);
    add(button6);
	
    // �]�w�������j�p
    this.setSize(200, 200);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // ��ܵ���
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	if(arg0.getSource().equals (button1))
	{
		System.out.println("�}�ҷs��");
	}
	
	if(arg0.getSource().equals (button2))
	{
		System.out.println("�}������");
	}
	
	if(arg0.getSource().equals (button3))
	{
		System.out.println("�s��");
	}
	
	if(arg0.getSource().equals (button4))
	{
		System.out.println("�ŤU");
	}
	
	if(arg0.getSource().equals (button5))
	{
		System.out.println("�ƻs");
	}
	
	if(arg0.getSource().equals (button6))
	{
		System.out.println("�K�W");
	}
	
}
  
  
}
