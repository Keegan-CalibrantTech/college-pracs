package addPackage;

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

public class AddProducts extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProducts frame = new AddProducts();
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
	public AddProducts() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("ADD PRODUCT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 194);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdjucator = new JLabel("idProduct");
		lblIdjucator.setForeground(Color.BLACK);
		lblIdjucator.setBounds(26, 11, 59, 14);
		contentPane.add(lblIdjucator);
		
		JLabel lblNume = new JLabel("Name");
		lblNume.setForeground(Color.BLACK);
		lblNume.setBounds(26, 36, 59, 14);
		contentPane.add(lblNume);
		
		JLabel lblInaltime = new JLabel("Price");
		lblInaltime.setForeground(Color.BLACK);
		lblInaltime.setBounds(26, 61, 59, 14);
		contentPane.add(lblInaltime);
		
		JLabel lblGreutate = new JLabel("Store");
		lblGreutate.setForeground(Color.BLACK);
		lblGreutate.setBounds(26, 86, 59, 14);
		contentPane.add(lblGreutate);
		
		textField = new JTextField();
		textField.setBounds(97, 8, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 33, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 58, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 83, 124, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "insert into Product values (?,?,?,?)";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					pst.setString(1,textField.getText());
					pst.setString(2,textField_1.getText());
					pst.setString(3,textField_2.getText());
					pst.setString(4,textField_3.getText());
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Product added.");
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBounds(26, 116, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLACK);
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu load = new MainMenu();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnBack.setBounds(225, 116, 97, 25);
		contentPane.add(btnBack);
		
	}
}
