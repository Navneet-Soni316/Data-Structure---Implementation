import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	class Node{
		Node nextLink;
		Node prevLink;
		int data;
	}
	private Node first;
	private JTextField Element1;
	private JTextField Element2;
	private JTextField DisplayBox;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedList = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblDoublyLinkedList.setForeground(new Color(0, 100, 0));
		lblDoublyLinkedList.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDoublyLinkedList.setBounds(78, 33, 304, 19);
		contentPane.add(lblDoublyLinkedList);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(128, 0, 0));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterAnElement.setBounds(25, 71, 144, 17);
		contentPane.add(lblEnterAnElement);
		
		JLabel label = new JLabel("ENTER AN ELEMENT");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(25, 100, 144, 17);
		contentPane.add(label);
		
		Element1 = new JTextField();
		Element1.setBounds(181, 69, 87, 22);
		contentPane.add(Element1);
		Element1.setColumns(10);
		
		Element2 = new JTextField();
		Element2.setColumns(10);
		Element2.setBounds(181, 98, 87, 22);
		contentPane.add(Element2);
		
		JButton btnNewButton = new JButton("INSERT FRONT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//INSERTING AN ELEMENT AT THE FRONT
				Node nNode=new Node();
				nNode.nextLink=null;
				nNode.prevLink=null;
				int ele=Integer.valueOf(Element1.getText());
				nNode.data=ele;
				if(first==null) {
					first=nNode;
				}
				else {
					nNode.nextLink=first;
					first.prevLink=nNode;
					first=nNode;
				}
				Element1.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(285, 68, 141, 25);
		contentPane.add(btnNewButton);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Inserting the element at rear end
				Node nNode=new Node();
				nNode.nextLink=null;
				nNode.prevLink=null;
				int ele=Integer.valueOf(Element2.getText());
				nNode.data=ele;
				if(first==null) {
					first=nNode;
				}
				else {
					Node temp=first;
					while(temp.nextLink!=null) {
						temp=temp.nextLink;
					}
					temp.nextLink=nNode;
					nNode.prevLink=temp.nextLink;
				}
				Element2.setText("");
			}
			
		});
		btnInsertRear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInsertRear.setForeground(new Color(0, 0, 255));
		btnInsertRear.setBounds(285, 97, 141, 25);
		contentPane.add(btnInsertRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETING THE ELEMENT FROM THE FRONT
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSSIBLE");
				}
				else if(first.nextLink==null){
					JOptionPane.showMessageDialog(contentPane, "THE DELETED ELEMENT IS "+ first.data);
					first=null;
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "THE DELETED ELEMENT IS "+ first.data);
					first=first.nextLink;
					first.prevLink=null;
				}
			}
		});
		btnDeleteFront.setForeground(Color.BLUE);
		btnDeleteFront.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDeleteFront.setBounds(159, 133, 141, 25);
		contentPane.add(btnDeleteFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETING THE ELEMENT FROM THE REAR
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSSIBLE");
				}
				else if(first.nextLink==null){
					JOptionPane.showMessageDialog(contentPane, "THE DELETED ELEMENT IS "+ first.data);
					first=null;
					
				}
				else {
					Node temp=first;
					while(temp.nextLink.nextLink!=null) {
						temp=temp.nextLink;
					}
					JOptionPane.showMessageDialog(contentPane, "THE DELETED ELEMENT IS "+ temp.nextLink.data);
					temp.nextLink=null;
				}
			}
		});
		btnDeleteRear.setForeground(Color.BLUE);
		btnDeleteRear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDeleteRear.setBounds(159, 163, 141, 25);
		contentPane.add(btnDeleteRear);
		
		DisplayBox = new JTextField();
		DisplayBox.setBounds(25, 218, 395, 22);
		contentPane.add(DisplayBox);
		DisplayBox.setColumns(10);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DISPLAY NOT POSSSIBLE");
				}
				else if(first.nextLink==null) {
					msg=msg+" "+first.data;
				}
				else {
					Node temp=first;
					
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextLink;
					}
				}
				DisplayBox.setText(msg);
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDisplay.setBounds(159, 192, 141, 25);
		contentPane.add(btnDisplay);
	}
}
