import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField id2;
	private JTextField isbn2;
	private JTextField number2;
	private JTextField authors2;
	private JTextField title2;
	private JTextField publisher2;
	private JTextField book_date2;
	private JTextField status2;
	private JTextField regist_date2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddBook() {
		setTitle("GUI Test");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800, 500);
		setVisible(true);
		//화면 가운데 생성
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel id = new JLabel("id");
		id.setBounds(12, 10, 102, 33);
		contentPane.add(id);
		
		JLabel isbn = new JLabel("isbn");
		isbn.setBounds(12, 53, 102, 33);
		contentPane.add(isbn);
		
		JLabel number = new JLabel("number");
		number.setBounds(12, 96, 102, 33);
		contentPane.add(number);
		
		JLabel authors = new JLabel("authors");
		authors.setBounds(12, 139, 102, 33);
		contentPane.add(authors);
		
		JLabel title = new JLabel("title");
		title.setBounds(12, 182, 102, 33);
		contentPane.add(title);
		
		JLabel publisher = new JLabel("publisher");
		publisher.setBounds(12, 225, 102, 33);
		contentPane.add(publisher);
		
		JLabel book_date = new JLabel("book_date");
		book_date.setBounds(12, 268, 102, 33);
		contentPane.add(book_date);
		
		JLabel status = new JLabel("status");
		status.setBounds(12, 311, 102, 33);
		contentPane.add(status);
		
		JLabel regist_date = new JLabel("regist_date");
		regist_date.setBounds(12, 354, 102, 33);
		contentPane.add(regist_date);
		
		id2 = new JTextField();
		id2.setBounds(86, 16, 505, 27);
		contentPane.add(id2);
		id2.setColumns(10);
		
		isbn2 = new JTextField();
		isbn2.setColumns(10);
		isbn2.setBounds(86, 53, 505, 27);
		contentPane.add(isbn2);
		
		number2 = new JTextField();
		number2.setColumns(10);
		number2.setBounds(86, 96, 505, 27);
		contentPane.add(number2);
		
		authors2 = new JTextField();
		authors2.setColumns(10);
		authors2.setBounds(86, 139, 505, 27);
		contentPane.add(authors2);
		
		title2 = new JTextField();
		title2.setColumns(10);
		title2.setBounds(86, 182, 505, 27);
		contentPane.add(title2);
		
		publisher2 = new JTextField();
		publisher2.setColumns(10);
		publisher2.setBounds(86, 225, 505, 27);
		contentPane.add(publisher2);
		
		book_date2 = new JTextField();
		book_date2.setColumns(10);
		book_date2.setBounds(86, 268, 505, 27);
		contentPane.add(book_date2);
		
		status2 = new JTextField();
		status2.setColumns(10);
		status2.setBounds(86, 311, 505, 27);
		contentPane.add(status2);
		
		regist_date2 = new JTextField();
		regist_date2.setColumns(10);
		regist_date2.setBounds(86, 354, 505, 27);
		contentPane.add(regist_date2);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						
						if(id2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The id is empty");
							id2.requestFocus();
						}
						else if(isbn2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The isbn is empty");
							isbn2.requestFocus();
						}
						else if(number2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The number is empty");
							number2.requestFocus();
						}
						else if(authors2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The authors is empty");
							number2.requestFocus();
						}
						else if(title2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The title is empty");
							number2.requestFocus();
						}
						else if(publisher2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The publisher is empty");
							number2.requestFocus();
						}
						else if(book_date2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The book_date is empty");
							number2.requestFocus();
						}
						else if(status2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The status is empty");
							number2.requestFocus();
						}
						else if(regist_date2.getText().length() == 0) {
							JOptionPane.showMessageDialog(null, "The regist_date is empty");
							number2.requestFocus();
						}
						else
						{
							/* 데이터베이스에 같은 name이 있는지 체크합니다. */
							if( !Database.getInstance().checkid(id2.getText()) ) {
								/* 데이터베이스에 값을 입력합니다. */
								Database.getInstance().insertBookData(
										id2.getText(),
										isbn2.getText(),
										number2.getText(),
										authors2.getText(),
										title2.getText(),
										publisher2.getText(),
										book_date2.getText(),
										status2.getText(),
										regist_date2.getText());
								
								dispose();
							}
							else
							{
								JOptionPane.showMessageDialog(null, "The id exists");
								//만약 가입되어 있다면 메시지를 출력하고 name과 password 필드를 비워줍니다.
								id2.setText("");
								//name에 focus를 표시합니다.
								id2.requestFocus();
							}
						}
					}
				

			
		});
		btnNewButton.setBounds(404, 397, 187, 54);
		contentPane.add(btnNewButton);
	}
}
