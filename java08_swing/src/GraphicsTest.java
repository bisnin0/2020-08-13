import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame {

	

	public GraphicsTest() {
		super("�׸� �׸���");

		MyCanvas canvas = new MyCanvas(); //����Ŭ�������� ��ӹ޾Ƽ� ��ü����
		add(canvas);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawString("���ڿ� �׸���", 100, 100);
		}
		
	}

	public static void main(String[] args) {
		new GraphicsTest();
	}

}
