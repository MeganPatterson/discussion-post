import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class graph extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main (String[] args) {
		new graph ().setVisible(true);
		
	}
	// creates the results box 
	private graph () {
		super ("Retirement");
		setSize(600,600); // resolution/ size setting 
		setResizable (false); // can also make it true to be resizable 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout (new BorderLayout());
		
		JButton button = new JButton ("Remaining Money"); // adds a button for the user to press
		JButton button2 = new JButton ("Years in Retirement");
		JButton button3 = new JButton ("Graph");
		
		add(button, BorderLayout.WEST);
		add (button2, BorderLayout.SOUTH);
		add (button3, BorderLayout.CENTER);
		
		
		
		
	}
}
