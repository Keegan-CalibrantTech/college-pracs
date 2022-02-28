package controllers;

import java.awt.EventQueue;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controllers.MainMenu;
import controllers.SQLConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateOrderBill extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_order;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateOrderBill frame = new CreateOrderBill();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTextField txtName;
	/**
	 * Create the frame.
	 */
	public CreateOrderBill() {
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("ADD PRODUCT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 167);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_order = new JTextField();
		textField_order.setBounds(181, 13, 136, 20);
		contentPane.add(textField_order);
		textField_order.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE PDF BILL & SEND E-MAIL");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Document document = new Document();
				try{	
					try {
						String query = "select `ProductName` from customer where `name` = '" + textField_order.getText() +"'";
						PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
						ResultSet rs = pst.executeQuery();
						rs.next();
						String rez= rs.getString("ProductName");
						pst.close();
						
						String query1 = "select `price` from `product` where `Name` = '" + rez +"'";
						PreparedStatement pst1 = (PreparedStatement) connection.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS);
						ResultSet rs1 = pst1.executeQuery();
						rs1.next();
						String rez1= rs1.getString("price");
						pst1.close();
						
						String query2 = "select `idOrder` from `order` where `CustomerName`  = '" + textField_order.getText() +"'";
						PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2,Statement.RETURN_GENERATED_KEYS);
						ResultSet rs2 = pst2.executeQuery();
						rs2.next();
						String rez2= rs2.getString("idOrder");
						pst2.close();
						
						String query5 = "select `E-Mail` from customer where `name` = '" + textField_order.getText() +"'";
						PreparedStatement pst5 = (PreparedStatement) connection.prepareStatement(query5,Statement.RETURN_GENERATED_KEYS);
						ResultSet rs5 = pst5.executeQuery();
						rs5.next();
						String rez5= rs5.getString("E-Mail");
						pst5.close();
						
						String query3 = "delete from `order` where `CustomerName`  = '" + textField_order.getText() +"'";
						PreparedStatement pst3 = (PreparedStatement) connection.prepareStatement(query3,Statement.RETURN_GENERATED_KEYS);
						pst3.execute();
						pst3.close();
						
						String query4 = "delete from `customer` where `Name`  = '" + textField_order.getText() +"'";
						PreparedStatement pst4 = (PreparedStatement) connection.prepareStatement(query4,Statement.RETURN_GENERATED_KEYS);
						pst4.execute();
						pst4.close();
						
						
						PdfWriter.getInstance(document, new FileOutputStream(textField_order.getText()+"Bill.pdf"));
						document.open();
						Paragraph paragraph = new Paragraph();
						paragraph.add("ORDER BILL\nOrder: " + rez2 + ",\nProdcut: " + rez + ",\nPrice: " + rez1 + " lei,\nName: " + textField_order.getText() + ".");
						document.add(paragraph);
						document.close();
						JOptionPane.showMessageDialog(null,"Order complete.");
						
						
						final String username = "bogdi.cedra@gmail.com"; // enter your mail id
						final String password = "he21cedra21eh";// enter ur password

						Properties props = new Properties();
						props.put("mail.smtp.auth", "true");
						props.put("mail.smtp.starttls.enable", "true");
						props.put("mail.smtp.host", "smtp.gmail.com");
						props.put("mail.smtp.port", "587");

						Session session = Session.getInstance(props,
						  new javax.mail.Authenticator() {
							protected PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication(username, password);
							}
						  });

						try {

							Message message = new MimeMessage(session);
							message.setFrom(new InternetAddress("bogdi.cedra@gmail.com")); // same email id
							message.setRecipients(Message.RecipientType.TO,
								InternetAddress.parse(rez5));// whome u have to send mails that person id
							message.setSubject("ORDER BILL");
							message.setText("ORDER BILL\nOrder: " + rez2 + ",\nProdcut: " + rez + ",\nPrice: " + rez1 + " lei,\nName: " + textField_order.getText() + ".");

							Transport.send(message);
							
							JOptionPane.showMessageDialog(null,"Sent.");

						} catch (MessagingException e) {
							throw new RuntimeException(e);
						}
					
					} catch(Exception e2){
						JOptionPane.showMessageDialog(null,"Invalid request.");
						}
				}catch(Exception e1){e1.printStackTrace();}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnNewButton.setBounds(32, 48, 285, 23);
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
		btnBack.setBounds(100, 84, 136, 23);
		contentPane.add(btnBack);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtName.setForeground(Color.WHITE);
		txtName.setBackground(Color.BLACK);
		txtName.setText("Customer's Name");
		txtName.setEditable(false);
		txtName.setBounds(32, 12, 137, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
	}
}
