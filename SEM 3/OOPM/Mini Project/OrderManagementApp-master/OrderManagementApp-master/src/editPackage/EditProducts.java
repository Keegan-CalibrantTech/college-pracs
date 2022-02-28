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

public class EditProducts extends JFrame {

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
					EditProducts frame = new EditProducts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTextField which;
	/**
	 * Create the frame.
	 */
	public EditProducts() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("EDIT PRODUCT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 221);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdjucator = new JLabel("idProduct");
		lblIdjucator.setForeground(Color.WHITE);
		lblIdjucator.setBounds(26, 11, 70, 14);
		contentPane.add(lblIdjucator);
		
		JLabel lblNume = new JLabel("Name");
		lblNume.setForeground(Color.WHITE);
		lblNume.setBounds(26, 36, 59, 14);
		contentPane.add(lblNume);
		
		JLabel lblInaltime = new JLabel("Price");
		lblInaltime.setForeground(Color.WHITE);
		lblInaltime.setBounds(26, 61, 59, 14);
		contentPane.add(lblInaltime);
		
		JLabel lblGreutate = new JLabel("Store");
		lblGreutate.setForeground(Color.WHITE);
		lblGreutate.setBounds(26, 86, 59, 14);
		contentPane.add(lblGreutate);
		
		textField = new JTextField();
		textField.setBounds(108, 8, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 33, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 58, 137, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 83, 137, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("EDIT ID");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update product set idProduct = '" + textField.getText() + "'" +  " where `name` = '" + which.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField.getText().equals("") || which.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Product was edited.");}
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setBounds(288, 6, 116, 25);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("EDIT NAME");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update product set `name` = '" + textField_1.getText() + "'" +  " where `name` = '" + which.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField_1.getText().equals("") || which.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Product was edited.");}
					pst.close();
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_1.setBounds(288, 31, 116, 25);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("EDIT PRICE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update product set price = '" + textField_2.getText().toString() + "'" +  " where `name` = '" + which.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField_2.getText().equals("") || which.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Product was edited.");}
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_2.setBounds(288, 56, 116, 25);
		contentPane.add(btnNewButton_2);
	
	
		
		JButton btnNewButton_3 = new JButton("EDIT STORE");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "update product set store = '" + textField_3.getText().toString() + "'" +  " where `name` = '" + which.getText() + "'";
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					
					pst.execute();
					if (textField_3.getText().equals("") || which.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Invalid request.");
					}
					else {
					JOptionPane.showMessageDialog(null,"Product was edited.");}
					pst.close();
					} catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid request.");}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton_3.setBounds(288, 81, 116, 25);
		contentPane.add(btnNewButton_3);
		
		which = new JTextField();
		which.setBounds(111, 139, 116, 22);
		contentPane.add(which);
		which.setColumns(10);
		
		JLabel lblWhich = new JLabel("which?");
		lblWhich.setForeground(Color.WHITE);
		lblWhich.setBounds(26, 143, 59, 14);
		contentPane.add(lblWhich);
		
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
		btnBack.setBounds(288, 138, 116, 25);
		contentPane.add(btnBack);
		
	}
}
