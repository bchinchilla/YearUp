import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;


public class MyFirstApplication {

	private JFrame frame;
	private JTextField NameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstApplication window = new MyFirstApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton NameButton = new JButton("Click Me");
		NameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameTextField.setText("Button was Clicked");
			}
		});
		NameButton.setToolTipText("Java is Fun");
		NameButton.setBounds(171, 147, 89, 23);
		frame.getContentPane().add(NameButton);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		NameTextField.setForeground(Color.RED);
		NameTextField.setText("Start");
		NameTextField.setBounds(103, 88, 226, 48);
		frame.getContentPane().add(NameTextField);
		NameTextField.setColumns(10);
	}
}
