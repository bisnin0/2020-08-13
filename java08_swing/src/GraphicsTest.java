import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame {

	

	public GraphicsTest() {
		super("그림 그리기");

		MyCanvas canvas = new MyCanvas(); //내부클래스에서 상속받아서 객체생성
		add(canvas);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawString("문자열 그리기", 100, 100);
		}
		
	}

	public static void main(String[] args) {
		new GraphicsTest();
	}

}
