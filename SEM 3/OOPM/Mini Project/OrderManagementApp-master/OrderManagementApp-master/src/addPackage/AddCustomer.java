package addPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controllers.MainMenu;
import controllers.SQLConnection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AddCustomer extends JFrame {

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
					AddCustomer frame = new AddCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JButton btnBack;
	private JTextField textField_4;
	/**
	 * Create the frame.
	 */
	public AddCustomer() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("ADD CUSTOMER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 220);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdjucator = new JLabel("idCustomer");
		lblIdjucator.setForeground(Color.BLACK);
		lblIdjucator.setBounds(26, 11, 86, 14);
		contentPane.add(lblIdjucator);
		
		JLabel lblNume = new JLabel("Name");
		lblNume.setForeground(Color.BLACK);
		lblNume.setBounds(26, 36, 59, 14);
		contentPane.add(lblNume);
		
		JLabel lblInaltime = new JLabel("Phone");
		lblInaltime.setForeground(Color.BLACK);
		lblInaltime.setBounds(26, 61, 59, 14);
		contentPane.add(lblInaltime);
		
		JLabel lblGreutate = new JLabel("E-Mail");
		lblGreutate.setForeground(Color.BLACK);
		lblGreutate.setBounds(26, 86, 59, 14);
		contentPane.add(lblGreutate);
		
		textField = new JTextField();
		textField.setBounds(105, 8, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 33, 116, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 58, 116, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 83, 116, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
					String query = "insert into Customer values (?,?,?,?,?)";
					String query1 = "insert into `Order` values " + "(" + textField.getText() + ",'" + textField_1.getText() + "','" + textField_4.getText()+"')";
					String query2 = "update product set `store` = store-1 where `NAME` = '" + textField_4.getText() + "'";
					
					
					PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
					PreparedStatement pst1 = (PreparedStatement) connection.prepareStatement(query1);
					PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2);
				
					
					pst.setString(1,textField.getText());
					pst.setString(2,textField_1.getText());
					pst.setString(3,textField_2.getText());
					pst.setString(4,textField_3.getText());
					pst.setString(5,textField_4.getText()); //product adaugat
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Customer added.");
					pst.close();
					
					pst1.execute();
					pst1.close();
					
					pst2.execute();
					pst2.close();
					
					
					String query3 ="select store from product where `NAME` = '" + textField_4.getText() + "'";
					PreparedStatement pst3 = (PreparedStatement) connection.prepareStatement(query3,Statement.RETURN_GENERATED_KEYS);
					ResultSet rs = pst3.executeQuery();
					rs.next();
					int numar= rs.getInt("store");
					if (numar<0){
						JOptionPane.showMessageDialog(null,"Empty stock.");
						String query4 = "update product set `store` = 0 where `NAME` = '" + textField_4.getText() + "'";
						PreparedStatement pst4 = (PreparedStatement) connection.prepareStatement(query4);
						pst4.execute();
						pst4.close();
					}
					else {
					JOptionPane.showMessageDialog(null,numar + " " + textField_4.getText() + " remains.");}
			    	pst3.close();
			    	
			    	
					} catch(Exception e2){ JOptionPane.showMessageDialog(null,"Invalid request."); }
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBounds(26, 142, 86, 23);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("BACK");
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
		btnBack.setBounds(227, 142, 86, 23);
		contentPane.add(btnBack);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(105, 110, 116, 20);
		contentPane.add(textField_4);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setForeground(Color.BLACK);
		lblProduct.setBounds(26, 113, 59, 14);
		contentPane.add(lblProduct);
		
		
		
	}
}
