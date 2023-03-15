package project2;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

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
		setBounds(100, 100, 450, 300);

	}

}
