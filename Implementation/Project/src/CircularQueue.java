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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField Element;
	private JTextField DisplayBox;
	private int circularQueue[];
	private int cqSize;
	private int front=0;
	private int rear=-1;
	private int count=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueDtatastructure = new JLabel("CIRCULAR  QUEUE DTATASTRUCTURE");
		lblCircularQueueDtatastructure.setForeground(new Color(220, 20, 60));
		lblCircularQueueDtatastructure.setFont(new Font("Algerian", Font.BOLD, 15));
		lblCircularQueueDtatastructure.setBounds(81, 26, 290, 20);
		contentPane.add(lblCircularQueueDtatastructure);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE");
		lblEnterQueueSize.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterQueueSize.setForeground(new Color(139, 69, 19));
		lblEnterQueueSize.setBounds(28, 59, 139, 17);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setBounds(179, 59, 69, 22);
		contentPane.add(size);
		size.setColumns(10);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterAnElement.setForeground(new Color(139, 69, 19));
		lblEnterAnElement.setBounds(28, 96, 144, 17);
		contentPane.add(lblEnterAnElement);
		
		Element = new JTextField();
		Element.setBounds(179, 94, 116, 22);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//creating circular Queue
				cqSize=Integer.valueOf(size.getText());
				circularQueue =new int[cqSize];
				JOptionPane.showMessageDialog(contentPane, "THJE CIRCULAR QUEUE OF SIZE " + cqSize+" HAS BEEN CREATED");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(267, 59, 143, 25);
		contentPane.add(btnNewButton);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Inserting an element in cq
				if(count==cqSize) {
					JOptionPane.showMessageDialog(contentPane, "INSERTION NOT POSSIBLE");
				}
				else {
					int ele=Integer.valueOf(Element.getText());
					rear=(rear+1)%cqSize;
					circularQueue[rear]=ele;
					++count;
					
				}
			Element.setText("");
			}
		});
		btnInsert.setForeground(new Color(0, 0, 255));
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInsert.setBounds(307, 92, 87, 25);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//deleting the elemnts circular queue
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, " DELETION NOT POSSIBLE" );
				}
				else{
					JOptionPane.showMessageDialog(contentPane, " THE DELETED ELEMENT IS "+ circularQueue[front]);
				    front=(front+1)  %cqSize;
				    --count;
				}
			}
		});
		btnDelete.setForeground(Color.BLUE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(179, 129, 87, 25);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// diplaying the element of an circular queue
				String msg="";
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "DISPLAY NOT POSSIBLE");
				}
				else {
					
					for (int i = 1; i <=count; i++) {
						msg=msg+" "+circularQueue[front];
						front=(front+1)%cqSize;	
						
					}
				}
			  DisplayBox.setText(msg);
				
			}
		});
		btnDisplay.setForeground(Color.BLUE);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDisplay.setBounds(179, 167, 95, 25);
		contentPane.add(btnDisplay);
		
		DisplayBox = new JTextField();
		DisplayBox.setBackground(new Color(192, 192, 192));
		DisplayBox.setForeground(new Color(128, 0, 0));
		DisplayBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		DisplayBox.setBounds(28, 206, 382, 22);
		contentPane.add(DisplayBox);
		DisplayBox.setColumns(10);
	}
}
