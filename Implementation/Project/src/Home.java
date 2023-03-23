import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel LinkedList;
	private JTextField txtChooseADs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		LinkedList = new JPanel();
		LinkedList.setBackground(new Color(0, 0, 0));
		LinkedList.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(LinkedList);
		LinkedList.setLayout(null);
		
		txtChooseADs = new JTextField();
		txtChooseADs.setForeground(new Color(138, 43, 226));
		txtChooseADs.setFont(new Font("Algerian", Font.BOLD, 16));
		txtChooseADs.setText("Choose a ds");
		txtChooseADs.setBounds(157, 24, 116, 25);
		LinkedList.add(txtChooseADs);
		txtChooseADs.setColumns(10);
		
		JButton array = new JButton("Array");
		array.setForeground(new Color(128, 0, 0));
		array.setBackground(new Color(255, 255, 255));
		array.setFont(new Font("Tahoma", Font.BOLD, 14));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Array().setVisible(true);
			}
		});
		array.setBounds(12, 96, 97, 25);
		LinkedList.add(array);
		
		JButton Stack = new JButton("Stack");
		Stack.setForeground(new Color(128, 0, 0));
		Stack.setFont(new Font("Tahoma", Font.BOLD, 14));
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Stack.setBounds(323, 96, 97, 25);
		LinkedList.add(Stack);
		
		JButton btnLinkedlist = new JButton("SinglyLinkedList");
		btnLinkedlist.setForeground(new Color(178, 34, 34));
		btnLinkedlist.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SinglyLinkedList().setVisible(true);
			}
		});
		btnLinkedlist.setBounds(38, 142, 143, 25);
		LinkedList.add(btnLinkedlist);
		
		JButton Queue = new JButton("Queue");
		Queue.setForeground(new Color(128, 0, 0));
		Queue.setFont(new Font("Tahoma", Font.BOLD, 14));
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Queue q=new Queue();
				q.setVisible(true);
			}
		});
		Queue.setBounds(170, 180, 97, 25);
		LinkedList.add(Queue);
		
		JButton btnNewButton = new JButton("DoublyLinkedList");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(145, 96, 149, 25);
		LinkedList.add(btnNewButton);
		
		JButton btnCircularqueue = new JButton("CircularQueue");
		btnCircularqueue.setForeground(new Color(128, 0, 0));
		btnCircularqueue.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCircularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CircularQueue().setVisible(true);
				
			}
		});
		btnCircularqueue.setBounds(260, 134, 129, 25);
		LinkedList.add(btnCircularqueue);
	}
}
