package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import model.Admin;
import model.Hotel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class login {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login( ) 
	{
		Admin admin = new Admin("User","Pass");
		Hotel motel = new Hotel("5 Star Motel", "1234 Kings St, San Diego, CA, 92137", "(525) 231 - 1387", 5, 16, 100);
		initialize(admin,motel);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Admin admin, Hotel hotel) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(74, 80, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(74, 133, 100, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(245, 75, 130, 26);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(245, 128, 130, 26);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(admin.getPass().equals(tf2.getText()) && admin.getUser().equals(tf1.getText()))
				{
					JOptionPane.showMessageDialog(null, "Login Successful");
					
					
			        new View(hotel);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password. Try Again.");
				}
			}
		});
		btnNewButton.setBounds(173, 193, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
