package project2;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice1 frame = new Practice1();
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
	public Practice1() {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setTitle("Practice 1");
		setBounds(100, 100, 274, 243);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Notepad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//risky code
					//if code can affect or touch file system
					
					Runtime.getRuntime().exec("Notepad.exe");
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, e,"Error Occured",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(78, 38, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calculator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Runtime.getRuntime().exec("calc.exe");
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, e,"Error Occured",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(78, 79, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Restart PC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Runtime.getRuntime().exec("shutdown -r -t 10");
					JOptionPane.showMessageDialog(null, "Your System will restart in 10 seconds","Restart Initiated",JOptionPane.WARNING_MESSAGE);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, e,"Error Occured",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_2.setBounds(78, 127, 89, 23);
		getContentPane().add(btnNewButton_2);

	}
}
