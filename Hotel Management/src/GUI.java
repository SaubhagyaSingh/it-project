import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import com.toedter.calendar.JDayChooser;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.sql.*;

public class GUI {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	DefaultTableModel model =  new DefaultTableModel();  
	/**
	 * Launch the application.
	 * 
	 */
	public void updateTable()
	{
		conn = Hoteldata.connectDB();
		if (conn!=null)
		{
			String sql = ("select the following Customer_id,Firstname,surname,Address,Postcode,Mobile_no,email,gender,idproof,room no,DOB,Check in date,Check out date,Room type");
		
		
		try 
		{
		pst=conn.prepareStatement(sql);
		rs=pst.executeQuery();
		Object[] columnData= new Object[16];
		while(rs.next())
		{
		columnData[0]=rs.getString("Customerid");
		columnData[1]=rs.getString("FirstName");
		columnData[2]=rs.getString("Surname");
		columnData[3]=rs.getString("Address");
		columnData[4]=rs.getString("Postcode");
		columnData[5]=rs.getString("MobileNo");
		columnData[6]=rs.getString("Email");
		columnData[7]=rs.getString("Gender");
		columnData[8]=rs.getString("IDproof");
		columnData[9]=rs.getString("Room.no");
		columnData[10]=rs.getString("DOB");
		columnData[11]=rs.getString("Check in date");
		columnData[12]=rs.getString("Checkout date");
		columnData[13]=rs.getString("Room type");
		}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,"connection error");

		
		}	
		}
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
		updateTable();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1470, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, -15, 552, 574);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 199, 46);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(249, 22, 293, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 39, 199, 46);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(249, 52, 293, 24);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 68, 199, 46);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(249, 79, 293, 24);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Postcode");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 125, 199, 46);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(249, 136, 293, 24);
		panel.add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No.");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 153, 199, 46);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(249, 164, 293, 24);
		panel.add(textField_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 96, 199, 46);
		panel.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(249, 107, 293, 24);
		panel.add(textField_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 182, 199, 46);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(249, 193, 293, 24);
		panel.add(textField_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Gender");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_1.setBounds(10, 285, 199, 46);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Room No.");
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_2.setBounds(10, 342, 199, 46);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Id proof");
		lblNewLabel_6_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_3.setBounds(10, 314, 199, 46);
		panel.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("Room Type");
		lblNewLabel_6_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_4.setBounds(10, 456, 199, 46);
		panel.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("Date of Birth");
		lblNewLabel_6_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_5.setBounds(10, 370, 199, 46);
		panel.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("Check in Date");
		lblNewLabel_6_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_6.setBounds(10, 399, 199, 46);
		panel.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("Check out Date");
		lblNewLabel_6_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6_7.setBounds(10, 427, 199, 46);
		panel.add(lblNewLabel_6_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(249, 470, 293, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setBounds(249, 356, 293, 22);
		panel.add(comboBox_1_3);
		
		JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setBounds(249, 299, 293, 22);
		panel.add(comboBox_1_4);
		
		JComboBox comboBox_1_4_1 = new JComboBox();
		comboBox_1_4_1.setBounds(249, 328, 293, 22);
		panel.add(comboBox_1_4_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(249, 383, 293, 20);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(249, 414, 293, 20);
		panel.add(dateChooser_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(249, 445, 293, 20);
		panel.add(dateChooser_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 585, 1444, 176);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tax");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2_2.setBounds(35, 11, 199, 63);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Subtotal");
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_5_2.setBounds(35, 63, 199, 46);
		panel_1.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Total");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3_2.setBounds(35, 107, 199, 46);
		panel_1.add(lblNewLabel_3_2);
		
		textField_14 = new JTextField();
		textField_14.setBounds(263, 36, 199, 20);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(263, 80, 199, 20);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(263, 124, 199, 20);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(528, 35, 147, 109);
		panel_1.add(btnNewButton);
		
		JButton btnTotal = new JButton("Update");
		btnTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnTotal.setBounds(696, 32, 147, 109);
		panel_1.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnReset.setBounds(1058, 32, 147, 109);
		panel_1.add(btnReset);
		
		JButton btnQuery = new JButton("Query");
		btnQuery.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnQuery.setBounds(870, 32, 147, 109);
		panel_1.add(btnQuery);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnPrint.setBounds(1250, 32, 147, 109);
		panel_1.add(btnPrint);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(562, 0, 882, 574);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 872, 574);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Cust. ID", "First Name", "Sur Name", "Address", "Postcode", "Mobile No.", "Email", "Gender", "DOB", "Room No.", "ID proof", "Check in", "Checkout", "Room type"
			}
		));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(table);
	}
}
