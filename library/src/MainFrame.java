import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI Test");
		setSize(800, 500);
		
		createMenu();
		
		setVisible(true);
		//화면 가운데 생성
		setLocationRelativeTo(null);
	}
	
	private void createMenu() {
		/* Menu를 만듭니다. */
		JMenuBar mb = new JMenuBar();
		JMenu personMenu = new JMenu("Person");
		JMenuItem loginMenuItem = new JMenuItem("Log-in ...");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginWindows();
			}
		});
		JMenuItem logoutMenuItem = new JMenuItem("Log-out ...");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogResult = JOptionPane.showConfirmDialog (null, 
						"Would you like to cancel?",
						"Warning",
						JOptionPane.YES_NO_OPTION);
				if(dialogResult == JOptionPane.YES_OPTION){
					dispose();
					new LoginWindows();
					System.out.println("cancel");
				}
			}
		});
		personMenu.add(loginMenuItem);
		personMenu.add(logoutMenuItem);
		
		JMenu memberMenu = new JMenu("Members");
		JMenuItem membersMenuItem = new JMenuItem("Members ...");
		memberMenu.add(membersMenuItem);
		
		mb.add(personMenu);
		mb.add(memberMenu);
		
		MenuActionListener menuListener = new MenuActionListener(this);
		membersMenuItem.addActionListener(menuListener);
		setJMenuBar(mb);
		
		JMenu bookMenu = new JMenu("book");
		mb.add(bookMenu);
		
		JMenuItem AddBookMenuItem = new JMenuItem("AddBook");
		AddBookMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddBook();
			}
		});
		bookMenu.add(AddBookMenuItem);
		
		JMenuItem BookListMenuItem = new JMenuItem("BookList");
		BookListMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookFrame();
			}
		});
		bookMenu.add(BookListMenuItem);
	}
}
