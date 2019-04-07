import java.awt.*;
import java.awt.event.*;
public class test1 extends java.awt.Frame implements
		MouseWheelListener
		{
	
	 public static void main(String[] args) {
		    new test1();
		  }
	 
	 public test1() {
		    super("test1");

		    this.addMouseWheelListener(this);    
		  
		    // 設定視窗的大小
		    this.setSize(new Dimension(200, 200));

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
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("滑鼠移動如同UP和DOWN");
		
	}
	 
		}