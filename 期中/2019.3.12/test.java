import java.awt.*;
import java.awt.event.*;
public class test extends java.awt.Frame implements
		MouseListener,
		MouseMotionListener{
	
	 public static void main(String[] args) {
		    new test();
		  }
	 
	 public test() {
		    super("test");

		    this.addMouseListener(this);    
		    this.addMouseMotionListener(this);    

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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("在物件上按住滑鼠按鍵並拖曳");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("在物件上移動滑鼠");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("按下並釋放滑鼠");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("滑鼠移置物件上");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("滑鼠離開物件");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("按下滑鼠按鍵");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("釋放滑鼠按鍵");
	}
	 
	 
}	 
