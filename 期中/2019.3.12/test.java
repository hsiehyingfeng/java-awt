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

		    // �]�w�������j�p
		    this.setSize(new Dimension(200, 200));

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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("�b����W����ƹ�����é즲");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("�b����W���ʷƹ�");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���U������ƹ�");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("�ƹ����m����W");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("�ƹ����}����");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���U�ƹ�����");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("����ƹ�����");
	}
	 
	 
}	 
