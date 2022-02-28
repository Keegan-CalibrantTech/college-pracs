package controllers;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import addPackage.AddCustomer;
import addPackage.AddProducts;
import deletePackage.DeleteCustomers;
import deletePackage.DeleteProducts;
import editPackage.EditCustomers;
import editPackage.EditProducts;
import loadPackage.Load;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setResizable(false);
		setBackground(Color.BLACK);
		connection = (Connection) SQLConnection.DBConnection();
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 291);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddCustomer load = new AddCustomer();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnAdd.setBounds(12, 38, 97, 25);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditCustomers load = new EditCustomers();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnEdit.setBounds(107, 38, 97, 25);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteCustomers load = new DeleteCustomers();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnDelete.setBounds(203, 38, 97, 25);
		contentPane.add(btnDelete);
		
		JButton btnView = new JButton("VIEW");
		btnView.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnView.setForeground(Color.BLACK);
		btnView.setBackground(Color.WHITE);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Load load = new Load();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnView.setBounds(299, 38, 97, 25);
		contentPane.add(btnView);
		
		JButton btnAdd2 = new JButton("ADD");
		btnAdd2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnAdd2.setBackground(Color.WHITE);
		btnAdd2.setForeground(Color.BLACK);
		btnAdd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddProducts load = new AddProducts();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnAdd2.setBounds(12, 103, 97, 25);
		contentPane.add(btnAdd2);
		
		JButton btnEdit2 = new JButton("EDIT");
		btnEdit2.setForeground(Color.BLACK);
		btnEdit2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnEdit2.setBackground(Color.WHITE);
		btnEdit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditProducts load = new EditProducts();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnEdit2.setBounds(107, 103, 97, 25);
		contentPane.add(btnEdit2);
		
		JButton btnDelete2 = new JButton("DELETE");
		btnDelete2.setForeground(Color.BLACK);
		btnDelete2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnDelete2.setBackground(Color.WHITE);
		btnDelete2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteProducts load = new DeleteProducts();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnDelete2.setBounds(203, 103, 97, 25);
		contentPane.add(btnDelete2);
		
		JButton btnView2 = new JButton("VIEW");
		btnView2.setForeground(Color.BLACK);
		btnView2.setBackground(Color.WHITE);
		btnView2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnView2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Load load = new Load();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnView2.setBounds(299, 103, 97, 25);
		contentPane.add(btnView2);
		
		JTextPane txtpnCustomer = new JTextPane();
		txtpnCustomer.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtpnCustomer.setForeground(Color.WHITE);
		txtpnCustomer.setBackground(Color.BLACK);
		txtpnCustomer.setEditable(false);
		txtpnCustomer.setText("CUSTOMER");
		txtpnCustomer.setBounds(12, 13, 72, 22);
		contentPane.add(txtpnCustomer);
		
		JTextPane txtpnProduct = new JTextPane();
		txtpnProduct.setBackground(Color.BLACK);
		txtpnProduct.setForeground(Color.WHITE);
		txtpnProduct.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtpnProduct.setEditable(false);
		txtpnProduct.setText("PRODUCT");
		txtpnProduct.setBounds(12, 80, 62, 22);
		contentPane.add(txtpnProduct);
		
		JButton btnOrder = new JButton("CONFIRM ORDER");
		btnOrder.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setBackground(Color.BLACK);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateOrderBill load = new CreateOrderBill();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnOrder.setBounds(12, 219, 192, 25);
		contentPane.add(btnOrder);
		
		JButton btnBack = new JButton("Log out");
		btnBack.setBackground(Color.BLACK);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login load = new Login();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnBack.setBounds(299, 219, 97, 25);
		contentPane.add(btnBack);
		
		JTextPane txtpnDelete = new JTextPane();
		txtpnDelete.setText("DELETE ALL");
		txtpnDelete.setForeground(Color.WHITE);
		txtpnDelete.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtpnDelete.setEditable(false);
		txtpnDelete.setBackground(Color.BLACK);
		txtpnDelete.setBounds(12, 143, 86, 22);
		contentPane.add(txtpnDelete);
		
		JButton btnDeleteC = new JButton("CUSTOMERS");
		btnDeleteC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
						String query2 = "delete from customer";
						PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2);
						pst2.execute();
						JOptionPane.showMessageDialog(null,"All customers deleted.");
						pst2.close();
					}catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid requests.");}
					
				}catch(Exception e1){e1.printStackTrace();}
				
			}
			
		});
		btnDeleteC.setForeground(Color.BLACK);
		btnDeleteC.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnDeleteC.setBackground(Color.WHITE);
		btnDeleteC.setBounds(12, 165, 124, 25);
		contentPane.add(btnDeleteC);
		
		JButton btnDeleteP = new JButton("PRODUCTS");
		btnDeleteP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
						String query2 = "delete from `product`";
						PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2);
						pst2.execute();
						JOptionPane.showMessageDialog(null,"All prodcuts deleted.");
						pst2.close();
					}catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid requests.");}
					
				}catch(Exception e1){e1.printStackTrace();}
				
			}
			
		});
		btnDeleteP.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnDeleteP.setBackground(Color.WHITE);
		btnDeleteP.setBounds(135, 165, 142, 25);
		contentPane.add(btnDeleteP);
		
		JButton btnDeleteO = new JButton("ORDERS");
		btnDeleteO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					try {
						String query2 = "delete from `order`";
						PreparedStatement pst2 = (PreparedStatement) connection.prepareStatement(query2);
						pst2.execute();
						JOptionPane.showMessageDialog(null,"All orders deleted.");
						pst2.close();
					}catch(Exception e2){JOptionPane.showMessageDialog(null,"Invalid requests.");}
					
				}catch(Exception e1){e1.printStackTrace();}
				
			}
			
		});
		btnDeleteO.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnDeleteO.setBackground(Color.WHITE);
		btnDeleteO.setBounds(272, 165, 124, 25);
		contentPane.add(btnDeleteO);
	}
}
