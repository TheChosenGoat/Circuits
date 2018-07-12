import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel implements Runnable, ActionListener, MouseListener, MouseMotionListener {
private JFrame frame;
private static int xBounds = 500;
private static int yBounds = 500;


	public void bootUp() {
		System.out.println("bootup");

		this.setPreferredSize(new Dimension(xBounds, yBounds));
		this.setBackground(new Color(14, 122, 52));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		//		lowerPanel.setPreferredSize(new Dimension(xBounds, 72));

		frame= new JFrame();
		frame.setTitle("Circuits");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(xBounds, yBounds);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/4-this.getSize().width/4, dim.height/4-this.getSize().height/4);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.add(this);
		





	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main");
		Board board = new Board();
		board.bootUp();
		Thread t1= new Thread(board);
		t1.start();
	}
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
