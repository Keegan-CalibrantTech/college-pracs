package deletePackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controllers.MainMenu;
import controllers.SQLConnection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteProducts extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProducts frame = new DeleteProducts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	/**
	 * Create the frame.
	 */
	public DeleteProducts() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("DELETE PRODUCT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 130);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNume = new JLabel("Name");
		lblNume.setForeground(Color.WHITE);
		lblNume.setBounds(26, 36, 59, 14);
		contentPane.add(lblNume);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 33, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "delete from product where `name` ='" + textField_1.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
				
					pst.execute();
					
					
					if (textField_1.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Product is removed.");}
				
					
					pst.close();
					
					}catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
					
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBounds(229, 31, 107, 25);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnBack.setBackground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu load = new MainMenu();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnBack.setBounds(352, 31, 97, 25);
		contentPane.add(btnBack);
		
	}
}
