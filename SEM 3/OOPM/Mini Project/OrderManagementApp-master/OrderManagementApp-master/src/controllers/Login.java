package controllers;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JButton btnExit;
	/**
	 * Create the frame.
	 */
	public Login() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("ORDER MANAGEMENT APLICATION - POPA BOGDAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 123);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(480, 51, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
	
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				try{	
					
					String query = "select username from `security`;";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
					ResultSet rs = pst.executeQuery();
					rs.next();
					String rez= rs.getString("username");
					pst.close();
					
					String query2 = "select `password` from `security`;";
					PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2,Statement.RETURN_GENERATED_KEYS);
					ResultSet rs2 = pst2.executeQuery();
					rs2.next();
					String rez2= rs2.getString("password");
					pst2.close();
					
					if (username.getText().equals(rez) && passwordField.getText().equals(rez2)){
						MainMenu load = new MainMenu();
			             load.setVisible(true);
			             dispose();
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Username or Password are incorrect.");
					}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		contentPane.add(btnNewButton);
		
		username = new JTextField();
		username.setBounds(248, 13, 116, 22);
		contentPane.add(username);
		username.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setEditable(false);
		txtUsername.setText("Username");
		txtUsername.setBounds(179, 13, 70, 22);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setEditable(false);
		txtPassword.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setBackground(Color.BLACK);
		txtPassword.setColumns(10);
		txtPassword.setBounds(179, 48, 70, 22);
		contentPane.add(txtPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(248, 48, 116, 22);
		contentPane.add(passwordField);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					dispose();
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(0, 51, 97, 25);
		contentPane.add(btnExit);
	}
}
