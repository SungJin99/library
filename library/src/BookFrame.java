import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class BookFrame extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public BookFrame() {
		setTitle("GUI Test");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800, 500);
		setVisible(true);
		//拳搁 啊款单 积己
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu book = new JMenu("book");
		menuBar.add(book);
		
		JMenuItem BookList = new JMenuItem("BookList..");
		book.add(BookList);
		MenuActionListener2 menuListener2 = new MenuActionListener2(this);
		BookList.addActionListener(menuListener2);
		setJMenuBar(menuBar);
		
	}
	

}
