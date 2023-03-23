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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField Element1;
	private JTextField Element2;
	private JTextField DisplayBox;
	class Node{
		int data;
		Node link;
		
	}
	private Node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSingly = new JLabel(" SINGLY LINKED LIST DATA STRUCTURE");
		lblSingly.setForeground(new Color(0, 128, 128));
		lblSingly.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblSingly.setBounds(120, 38, 272, 20);
		contentPane.add(lblSingly);
		
		JLabel Element = new JLabel("ENTER AN ELEMENT :");
		Element.setForeground(new Color(165, 42, 42));
		Element.setFont(new Font("Tahoma", Font.BOLD, 13));
		Element.setBounds(44, 79, 127, 16);
		contentPane.add(Element);
		
		Element1 = new JTextField();
		Element1.setBounds(198, 79, 116, 22);
		contentPane.add(Element1);
		Element1.setColumns(10);
		
		JLabel label = new JLabel("ENTER AN ELEMENT :");
		label.setForeground(new Color(165, 42, 42));
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(44, 123, 127, 16);
		contentPane.add(label);
		
		Element2 = new JTextField();
		Element2.setColumns(10);
		Element2.setBounds(198, 120, 116, 22);
		contentPane.add(Element2);
		
		JButton btnInsertRear = new JButton("INSERT REAR");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Inserting am elemnt at the rear end
				Node temp;
			int ele=Integer.valueOf(Element1.getText());
			Node nNode =new Node();
			nNode.data=ele;
			nNode.link=null;
			if(first==null) {
				first=nNode;
			}
			else {
				 temp=first;
				while(temp.link!=null) {
					temp=temp.link;
				}
				temp.link=nNode;
			}
			Element1.setText("");
			}
		});
		btnInsertRear.setBounds(342, 78, 111, 25);
		contentPane.add(btnInsertRear);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Inserting the  element at the front
				Node nNode =new Node();
				int ele=Integer.valueOf(Element2.getText());
				nNode.data=ele;
				nNode.link=null;
				if(first==null) {
					first=nNode;
				}
				else {
					nNode.link=first;
					first=nNode;
				}
				
				Element2.setText("");
				
			}
			
		});
		btnInsertFront.setBounds(352, 119, 119, 25);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Deletin g fro Rear
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DELETION IS NOT POSSIBLE");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "THE ELEMENT DELETED IS "+ first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "THE ELEMENT DELETED IS "+ temp.link.data);
					temp.link=null;
				}
				
			}
		});
		btnDeleteRear.setBounds(208, 155, 111, 25);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Deleting from front
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DELETION IS NOT POSSIBLE");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, " THE ELEMENT DELETED IS "+first.data  );
					first=null;
				}
				else {
					first=first.link;
				}
			}
		});
		btnDeleteFront.setBounds(208, 193, 119, 25);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Displaying the element
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "DISPLAY IS NOT POSSIBLE");
				}
				else if(first.link==null) {
					msg=msg+" "+first.data;
				}
				else {
					Node temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
				}
				DisplayBox.setText(msg);
			}
		});
		btnDisplay.setBounds(217, 230, 97, 25);
		contentPane.add(btnDisplay);
		
		DisplayBox = new JTextField();
		DisplayBox.setForeground(Color.WHITE);
		DisplayBox.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		DisplayBox.setBackground(Color.DARK_GRAY);
		DisplayBox.setBounds(61, 268, 374, 32);
		contentPane.add(DisplayBox);
		DisplayBox.setColumns(10);
	}
}
