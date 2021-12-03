import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuActionListener2 implements ActionListener {

	private BookFrame mainWindow = null;
	private JTable table = null;
	public MenuActionListener2(BookFrame mainWindow) {
		this.mainWindow = mainWindow;
		createTable();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("BookList.."))
		{
			System.out.println("BookList ok");
			
			DefaultTableModel model= (DefaultTableModel)table.getModel();
			model.setNumRows(0);
			Database.getInstance().insertJTablebook(model);
		}
	}
	
	private void createTable() {
		String []header = {"id", "isbn", "number", "authors", "title", "publisher", "book_date", "status", "regist_date"};
		DefaultTableModel model=new DefaultTableModel(header,0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		mainWindow.add(scroll);
	}
	
}
