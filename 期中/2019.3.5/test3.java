import java.awt.*;
import java.awt.event.*;

public class test3 extends java.awt.Frame {

  public static void main(String args[]){
    new test3();
  }
  
  // 建構函式
  public test3() {
    super("Grid Layout Demo");
    
	final int row =3;
	final int column =4;
    setLayout(new GridLayout(row,column)); 
    
    Button button1 = new Button("(0,0)");
    Button button2 = new Button("(0,1)");
    Button button3 = new Button("(0,2)");
	Button button4 = new Button("(1,0)");
    Button button5 = new Button("(1,1)");
    Button button6 = new Button("(1,2)");
    Button button7 = new Button("(2,0)");
    Button button8 = new Button("(2,1)");
    Button button9 = new Button("(2,2)");
    Button button10 = new Button("(3,0)");
    Button button11 = new Button("(3,1)");
    Button button12 = new Button("(3,2)");
	
    add(button1);
    add(button2);
    add(button3);
    add(button4);
	add(button5);
    add(button6);
    add(button7);
    add(button8);
	add(button9);
    add(button10);
    add(button11);
    add(button12);

    // 設定視窗的大小
    this.setSize(300, 100);

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
}