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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField Element;
	private JTextField displayBox;
    private int stack[];
    private int top=-1;
    private int size1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDataStructure = new JLabel("Stack Data Structure");
		lblStackDataStructure.setForeground(Color.ORANGE);
		lblStackDataStructure.setFont(new Font("Algerian", Font.BOLD, 14));
		lblStackDataStructure.setBounds(166, 24, 187, 19);
		contentPane.add(lblStackDataStructure);
		
		JLabel lblEnterTheStack = new JLabel("Enter the Stack size");
		lblEnterTheStack.setForeground(new Color(139, 0, 0));
		lblEnterTheStack.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterTheStack.setBounds(64, 66, 148, 19);
		contentPane.add(lblEnterTheStack);
		
		size = new JTextField();
		size.setBounds(237, 63, 57, 22);
		contentPane.add(size);
		size.setColumns(10);
		
		JButton btnCreate = new JButton("Create Stack");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//creaating stack
				int len=Integer.valueOf(size.getText());
				stack=new int[len];
				size1=len;
				JOptionPane.showMessageDialog(contentPane, "THE STACK OF SIZE "+len+" HAS BEEN CREATED");
				
			}
		});
		btnCreate.setForeground(new Color(0, 0, 205));
		btnCreate.setBackground(new Color(218, 165, 32));
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreate.setBounds(319, 63, 121, 25);
		contentPane.add(btnCreate);
		
		JLabel lblEnterAnElement = new JLabel("Enter An Element");
		lblEnterAnElement.setForeground(new Color(139, 0, 0));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterAnElement.setBounds(74, 110, 148, 19);
		contentPane.add(lblEnterAnElement);
		
		Element = new JTextField();
		Element.setBounds(237, 109, 83, 22);
		contentPane.add(Element);
		Element.setColumns(10);
		
		JButton btnPush = new JButton("Push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pushing the element into the Stack
				if(top==size1-1) {
					JOptionPane.showMessageDialog(contentPane, "PUSH NOT POSSIBLE YOUR STACK IS FULL");
				}
				else {
					int ele=Integer.valueOf(Element.getText());
					++top;
					stack[top]=ele;
					JOptionPane.showMessageDialog(contentPane, "THE ELEMENT PUSHED IS "+ele );
				   Element.setText("");	
					
				}
				
			}
		});
		btnPush.setForeground(new Color(0, 0, 255));
		btnPush.setBackground(new Color(210, 105, 30));
		btnPush.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPush.setBounds(329, 108, 97, 25);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("Pop");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//For poping/deleting the element
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "POP IS NOT POSSIBLE");
				}
				else {
					
					JOptionPane.showMessageDialog(contentPane,"THE POPPED ELEMENT IS "+stack[top]);
					--top;
				}
				
			}
		});
		btnPop.setForeground(new Color(0, 0, 255));
		btnPop.setBackground(new Color(184, 134, 11));
		btnPop.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPop.setBounds(223, 157, 97, 25);
		contentPane.add(btnPop);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//For displaying the stack
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "DISPLAY IS NOT POSSIBLE");
				}
				else {
					String msg="";
					for (int i = top; i>=0; i--) {
						displayBox.setText(msg+=stack[i]+" ");
						
					}
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 0, 255));
		btnDisplay.setBackground(new Color(184, 134, 11));
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDisplay.setBounds(223, 195, 97, 25);
		contentPane.add(btnDisplay);
		
		displayBox = new JTextField();
		displayBox.setForeground(new Color(240, 230, 140));
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		displayBox.setBackground(new Color(205, 92, 92));
		displayBox.setBounds(29, 257, 446, 22);

contentPane.add(displayBox);
		displayBox.setColumns(10);
	}
}
