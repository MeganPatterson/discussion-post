import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class CustomerOutput extends JFrame {

	private JPanel contentPane;
	private JTextField txtRetirementSavings;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerOutput frame = new CustomerOutput();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerOutput() {
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount of Savings");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 266, 215, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblYearsInRetirement = new JLabel("Years In Retirement");
		lblYearsInRetirement.setHorizontalAlignment(SwingConstants.CENTER);
		lblYearsInRetirement.setFont(new Font("Segoe UI Historic", Font.PLAIN, 21));
		lblYearsInRetirement.setForeground(new Color(0, 128, 128));
		lblYearsInRetirement.setBounds(536, 564, 196, 20);
		contentPane.add(lblYearsInRetirement);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(51, 204, 51));
		panel.setFont(new Font("Ink Free", Font.BOLD, 20));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 51)));
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(230, 106, 786, 463);
		contentPane.add(panel);
		
		txtRetirementSavings = new JTextField();
		txtRetirementSavings.setBackground(new Color(153, 204, 204));
		txtRetirementSavings.setHorizontalAlignment(SwingConstants.CENTER);
		txtRetirementSavings.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRetirementSavings.setText("Retirement Savings");
		txtRetirementSavings.setBounds(426, 44, 359, 46);
		contentPane.add(txtRetirementSavings);
		txtRetirementSavings.setColumns(10);
	}
}
