package loadPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controllers.MainMenu;
import controllers.SQLConnection;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Load extends JFrame {

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
					Load frame = new Load();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    Connection connection = null;
    private JPanel panel;
    private JTable table;
    private JScrollPane scrollPane;
    private JButton LoadProducts;
	/**
	 * Create the frame.
	 */
	public Load() {
		setTitle("VIEW");
		connection = (Connection) SQLConnection.DBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 538);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(415, 291, -362, -208);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLoadCustomers = new JButton("Load Customers");
		btnLoadCustomers.setForeground(Color.WHITE);
		btnLoadCustomers.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnLoadCustomers.setBackground(Color.BLACK);
		btnLoadCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{	
				String query = "select * from Customer order by idCustomer";
				PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}catch(Exception e1){e1.printStackTrace();}
		}
		}	);
		btnLoadCustomers.setBounds(268, 38, 162, 23);
		contentPane.add(btnLoadCustomers);
		
		table = new JTable();
		table.setBounds(46, 30, 558, 369);
		contentPane.add(table);
		
		scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(74, 92, 569, 329);
		contentPane.add(scrollPane);
		
		LoadProducts = new JButton("Load Products");
		LoadProducts.setFont(new Font("Monospaced", Font.PLAIN, 13));
		LoadProducts.setForeground(Color.WHITE);
		LoadProducts.setBackground(Color.BLACK);
		LoadProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{	
				
				String query = "select * from Product order by idProduct";
				PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}catch(Exception e1){e1.printStackTrace();}
		}
		}	);
		LoadProducts.setBounds(459, 38, 139, 23);
		contentPane.add(LoadProducts);
		
		JButton LoadOrders = new JButton("Load Orders");
		LoadOrders.setFont(new Font("Monospaced", Font.PLAIN, 13));
		LoadOrders.setForeground(Color.WHITE);
		LoadOrders.setBackground(Color.BLACK);
		LoadOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{	
				
				String query = "select * from `Order` order by idOrder";
				
				PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			}catch(Exception e1){e1.printStackTrace();}
		}
		}	);
		LoadOrders.setBounds(104, 37, 139, 25);
		contentPane.add(LoadOrders);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLACK);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu load = new MainMenu();
	             load.setVisible(true);
	             dispose();
			}
		});
		btnBack.setBounds(551, 434, 97, 25);
		contentPane.add(btnBack);
	}
	
}
