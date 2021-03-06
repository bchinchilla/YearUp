import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField NameTextField;
	private JLabel AgeLabel;
	private JTextField AgeTextField;
	private JLabel StudentLabel;
	private static String s_whoAreYou = ("Who are you?");
	private static String s_clearMe = ("Clear Me!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
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
	public SimpleJavaGUI() {
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
		
		JLabel NameLabel = new JLabel("My Name is:");
		NameLabel.setBounds(52, 22, 91, 50);
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(NameLabel);
		
		NameTextField = new JTextField();
		NameTextField.setBounds(142, 22, 200, 50);
		frame.getContentPane().add(NameTextField);
		NameTextField.setColumns(10);
		
		AgeLabel = new JLabel("I Am:");
		AgeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AgeLabel.setBounds(96, 94, 47, 47);
		frame.getContentPane().add(AgeLabel);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(142, 91, 200, 50);
		frame.getContentPane().add(AgeTextField);
		AgeTextField.setColumns(10);
		
		StudentLabel = new JLabel("I am a student of Year Up!");
		StudentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StudentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		StudentLabel.setBounds(128, 162, 214, 33);
		frame.getContentPane().add(StudentLabel);
		
		JButton WhoButton = new JButton("Who are you?");
		WhoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (WhoButton.getText().equals(s_whoAreYou))
				{
					NameTextField.setText("Brian Chinchilla");
					AgeTextField.setText("20");
					WhoButton.setText(s_clearMe);
				}
				else if (WhoButton.getText().equals(s_clearMe))
				{
					NameTextField.setText("");
					AgeTextField.setText("");
					WhoButton.setText(s_whoAreYou);
				}
			}
		});
		WhoButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		WhoButton.setBounds(72, 206, 326, 33);
		frame.getContentPane().add(WhoButton);
	}
}
