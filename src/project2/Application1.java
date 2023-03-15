package project2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application1 {

	private JFrame frmApplication;
	private final JDesktopPane desktopPane = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application1 window = new Application1();
					window.frmApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application1() {
		
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplication = new JFrame();
		frmApplication.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmApplication.setTitle("New Application");
		frmApplication.setBounds(100, 100, 500, 297);
		frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplication.getContentPane().setLayout(null);
		
		desktopPane.setBounds(0, 41, 1346, 621);
		frmApplication.getContentPane().add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		frmApplication.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Activities");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Activity 1");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Activity 2");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Development");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Production");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Others");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Practice 1");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Call JInternalFrame
				Practice1 p1 = new Practice1();
				desktopPane.add(p1);
				p1.show();
				
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Practice 2");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Practice2 p2 = new Practice2();
				desktopPane.add(p2);
				p2.show();
				
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);
	}
}
