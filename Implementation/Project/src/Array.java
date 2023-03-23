import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertPos;
	private JTextField deletePos;
	private JTextField displayBox;
	private int []arr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayDataStructure = new JLabel("Array Data Structure");
		lblArrayDataStructure.setForeground(Color.WHITE);
		lblArrayDataStructure.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblArrayDataStructure.setBounds(166, 40, 164, 22);
		contentPane.add(lblArrayDataStructure);
		
		JLabel lblEnterTheLength = new JLabel("ENTER THE LENGTH");
		lblEnterTheLength.setForeground(Color.WHITE);
		lblEnterTheLength.setFont(new Font("Constantia", Font.BOLD, 13));
		lblEnterTheLength.setBounds(18, 81, 131, 17);
		contentPane.add(lblEnterTheLength);
		
		length = new JTextField();
		length.setBounds(166, 77, 116, 22);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnCreate = new JButton("Create Array");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for creating an array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="ARRAY OF LENGTH "+len+ " HAS BEEN CREATED";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnCreate.setBounds(315, 76, 105, 25);
		contentPane.add(btnCreate);
		
		JLabel lblInsertIntegerElement = new JLabel("INSERT INTEGER ELEMENTS");
		lblInsertIntegerElement.setForeground(Color.WHITE);
		lblInsertIntegerElement.setBackground(Color.WHITE);
		lblInsertIntegerElement.setFont(new Font("Constantia", Font.BOLD, 13));
		lblInsertIntegerElement.setBounds(12, 116, 180, 17);
		contentPane.add(lblInsertIntegerElement);
		
		element = new JTextField();
		element.setBounds(192, 112, 62, 22);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblInsertPos = new JLabel("INSERT AT");
		lblInsertPos.setFont(new Font("Constantia", Font.BOLD, 13));
		lblInsertPos.setForeground(Color.WHITE);
		lblInsertPos.setBounds(259, 116, 67, 17);
		contentPane.add(lblInsertPos);
		
		insertPos = new JTextField();
		insertPos.setBounds(338, 112, 44, 22);
		contentPane.add(insertPos);
		insertPos.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for inserting into an array
				int ele=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertPos.getText());
				arr[pos]=ele;
				String msg="THE ELEMENT " + ele+" INSERTED AT POSITION "+ pos;
				JOptionPane.showMessageDialog(contentPane, msg);
				element.setText("");
				insertPos.setText("");
				
			}
		});
		btnInsert.setBounds(394, 111, 65, 25);
		contentPane.add(btnInsert);
		
		JLabel lblDeleteFromPos = new JLabel("DELETE FROM POSITION");
		lblDeleteFromPos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDeleteFromPos.setForeground(Color.WHITE);
		lblDeleteFromPos.setBounds(22, 146, 146, 16);
		contentPane.add(lblDeleteFromPos);
		
		deletePos = new JTextField();
		deletePos.setBounds(192, 146, 44, 22);
		contentPane.add(deletePos);
		deletePos.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for deleting elements from an array
				int pos=Integer.valueOf(deletePos.getText());
				arr[pos]=0;
				String msg="THE DELETED ELEMENT FROM POSITION "+pos+" IS "+arr[pos];
				JOptionPane.showMessageDialog(contentPane, msg);
				deletePos.setText("");
			}
			
		});
		btnDelete.setBounds(259, 142, 97, 25);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for displaying an array
				String msg="";
				for (int i = 0; i < arr.length; i++) {
					msg+=" "+arr[i];
					
				}
				displayBox.setText(msg);
			}
		});
		btnDisplay.setBounds(185, 181, 97, 25);
		contentPane.add(btnDisplay);
		
		displayBox = new JTextField();
		displayBox.setBounds(57, 219, 363, 22);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
		
		
	}
}
