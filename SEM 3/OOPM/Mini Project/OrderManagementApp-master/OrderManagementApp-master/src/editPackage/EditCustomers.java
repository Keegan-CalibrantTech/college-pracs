package editPackage;

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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EditCustomers extends JFrame {

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
					EditCustomers frame = new EditCustomers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTextField who;
	private JTextField textField_4;
	/**
	 * Create the frame.
	 */
	public EditCustomers() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("EDIT CUSTOMER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 262);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdjucator = new JLabel("idCustomer");
		lblIdjucator.setForeground(Color.WHITE);
		lblIdjucator.setBounds(26, 11, 71, 14);
		contentPane.add(lblIdjucator);
		
		JLabel lblNume = new JLabel("Name");
		lblNume.setForeground(Color.WHITE);
		lblNume.setBounds(26, 36, 59, 14);
		contentPane.add(lblNume);
		
		JLabel lblInaltime = new JLabel("Phone");
		lblInaltime.setForeground(Color.WHITE);
		lblInaltime.setBounds(26, 61, 59, 14);
		contentPane.add(lblInaltime);
		
		JLabel lblGreutate = new JLabel("E-Mail");
		lblGreutate.setForeground(Color.WHITE);
		lblGreutate.setBounds(26, 86, 59, 14);
		contentPane.add(lblGreutate);
		
		textField = new JTextField();
		textField.setBounds(109, 8, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 33, 134, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 58, 134, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 83, 134, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("EDIT ID");
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update customer set idCustomer = '" + textField.getText() + "'" +  " where `name` = '" + who.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField.getText().equals("") || who.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Customer was edited.");}
				
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setBounds(276, 6, 140, 25);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("EDIT NAME");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update customer set `name` = '" + textField_1.getText() + "'" +  " where `name` = '" + who.getText() + "'";
					String query1 = "update `order` set `CustomerName` = '" + textField_1.getText() + "'" +  " where `CustomerName` = '" + who.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					PreparedStatement pst1 = (PreparedStatement) connection.prepareStatement(query1);
					
					pst.execute();
					if (textField_1.getText().equals("") || who.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Customer was edited.");}
				
					pst.close();
					
					pst1.execute();
					pst1.close();
					
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_1.setBounds(276, 31, 140, 25);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("EDIT PHONE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update customer set phone = '" + textField_2.getText() + "'" +  " where `name` = '" + who.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField_2.getText().equals("") || who.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Customer was edited.");}
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_2.setBounds(276, 56, 140, 25);
		contentPane.add(btnNewButton_2);
	
	
		
		JButton btnNewButton_3 = new JButton("EDIT E-MAIL");
		btnNewButton_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update customer set `e-mail` = '" + textField_3.getText() + "'" +  " where `name` = '" + who.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField_3.getText().equals("") || who.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Customer was edited.");}
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_3.setBounds(276, 81, 140, 25);
		contentPane.add(btnNewButton_3);
		
		who = new JTextField();
		who.setBounds(109, 172, 134, 22);
		contentPane.add(who);
		who.setColumns(10);
		
		JLabel lblWho = new JLabel("Who?");
		lblWho.setForeground(Color.WHITE);
		lblWho.setBounds(26, 176, 59, 14);
		contentPane.add(lblWho);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(Color.BLACK);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu load = new MainMenu();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnBack.setBounds(276, 171, 140, 25);
		contentPane.add(btnBack);
		
		JButton btnEditProduct = new JButton("EDIT PRODUCT");
		btnEditProduct.setForeground(Color.WHITE);
		btnEditProduct.setBackground(Color.BLACK);
		btnEditProduct.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnEditProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update customer set `ProductName` = '" + textField_4.getText() + "'" +  " where `name` = '" + who.getText() + "'";
					String query1 = "update `order` set `ProductName` = '" + textField_4.getText() + "'" +  " where `CustomerName` = '" + who.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					PreparedStatement pst1 = (PreparedStatement) connection.prepareStatement(query1);
					
					pst.execute();
					if (textField_4.getText().equals("") || who.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Customer was edited.");}
					pst.close();
					
					pst1.execute();
					pst1.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnEditProduct.setBounds(276, 106, 140, 25);
		contentPane.add(btnEditProduct);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(109, 108, 134, 20);
		contentPane.add(textField_4);
		
		JLabel lblProdcut = new JLabel("Prodcut");
		lblProdcut.setForeground(Color.WHITE);
		lblProdcut.setBounds(26, 110, 59, 14);
		contentPane.add(lblProdcut);
		
	}
}
