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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField Element;
	private JTextField displayBox;
	private int queue[];
	private int rear=-1,front=0;
	private int length;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(46, 139, 87));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(167, 31, 196, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE :");
		lblEnterQueueSize.setForeground(new Color(165, 42, 42));
		lblEnterQueueSize.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterQueueSize.setBounds(43, 67, 148, 17);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setForeground(new Color(245, 245, 245));
		size.setBackground(new Color(255, 255, 255));
		size.setBounds(215, 65, 108, 22);
		contentPane.add(size);
		size.setColumns(10);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setForeground(new Color(165, 42, 42));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterAnElement.setBounds(43, 113, 153, 17);
		contentPane.add(lblEnterAnElement);
		
		Element = new JTextField();
		Element.setForeground(new Color(245, 245, 245));
		Element.setBackground(new Color(255, 255, 255));
		Element.setBounds(215, 111, 116, 22);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Creating Queue
				length=Integer.valueOf(size.getText());
				queue=new int[length];
				String msg="THE QUEUE OF LENGTH "+length+" HAS BEEN CREATED";
				JOptionPane.showMessageDialog(contentPane, msg);// used to display on the content pane
				
				
			}
		});
		btnNewButton.setBounds(353, 64, 121, 25);
		contentPane.add(btnNewButton);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Displaying the queue element 
				if(rear==-1 || front>rear){
					JOptionPane.showMessageDialog(contentPane, "DISPLAY IS  NOT POSSIBLE" );
				}else {
					String msg=" ";
					for (int i = 0; i < queue.length; i++) {
		
//						JOptionPane.showMessageDialog(contentPane, msg+=queue[i]+" ");
						displayBox.setText(msg+=queue[i]+" ");
						
					}
				}
			}
		});
		btnDisplay.setBounds(210, 186, 121, 25);
		contentPane.add(btnDisplay);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//deleting th elements from the queue
				if(rear==-1 || front>rear) {
					JOptionPane.showMessageDialog(contentPane, "DELETION NOT POSSIBLE");
				}	
				else {
						JOptionPane.showMessageDialog(contentPane, "THE ELEMENT DELETED IS "+queue[front]);
						front++;
					}
				}
				
			}
		);
		btnDelete.setBounds(215, 146, 121, 25);
		contentPane.add(btnDelete);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//for inserting an elemnt into the queue
				if(rear==length-1) {
				
					JOptionPane.showMessageDialog(contentPane, "INSERTION NOT POSSIBLE");
					
				}
				else {
					int ele=Integer.valueOf(Element.getText());
					++rear;
					queue[rear]=ele;
					String msg="THE ELEMENT INSERTED AT LOCATION "+rear+" IS "+ele;
					JOptionPane.showMessageDialog(contentPane, msg);
					Element.setText("");
				}
				
				
			}
		});
		btnInsert.setBounds(353, 110, 121, 25);
		contentPane.add(btnInsert);
		
		displayBox = new JTextField();
		displayBox.setBackground(new Color(46, 139, 87));
		displayBox.setForeground(new Color(255, 255, 255));
		displayBox.setBounds(44, 243, 431, 22);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}

}
