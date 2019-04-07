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
  
  // 建構函式
  public ButtonDemo() {
    super("Button Demo");

    final int row = 3;    // 列
    final int column = 2; // 行

    // 定義 Layout Manager 為 GridLayout
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
	
    // 設定視窗的大小
    this.setSize(200, 200);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // 顯示視窗
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
		System.out.println("開啟新檔");
	}
	
	if(arg0.getSource().equals (button2))
	{
		System.out.println("開啟舊檔");
	}
	
	if(arg0.getSource().equals (button3))
	{
		System.out.println("存檔");
	}
	
	if(arg0.getSource().equals (button4))
	{
		System.out.println("剪下");
	}
	
	if(arg0.getSource().equals (button5))
	{
		System.out.println("複製");
	}
	
	if(arg0.getSource().equals (button6))
	{
		System.out.println("貼上");
	}
	
}
  
  
}
