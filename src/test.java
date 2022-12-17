import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;

public class test extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	listPatients k;
	 public test() {
		   
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			
			JLabel lblEntrerLeNombre = new JLabel(" Enter le nombre de patient a tester ");
			lblEntrerLeNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
			
			textField = new JTextField();
			textField.setColumns(10);
			
			JButton btnSuivant = new JButton("Suivant");
			btnSuivant.addActionListener(this);
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap(65, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addComponent(lblEntrerLeNombre, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
								.addGap(19))
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addGap(145))
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addComponent(btnSuivant, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addGap(169))))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(25)
						.addComponent(lblEntrerLeNombre)
						.addGap(45)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
						.addComponent(btnSuivant)
						.addGap(56))
			);
			panel.setLayout(gl_panel);
		}

	    public test(listPatients l) {
	    k=l;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblEntrerLeNombre = new JLabel(" Enter le nombre de patient a tester ");
		lblEntrerLeNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblEntrerLeNombre, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
							.addGap(19))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(145))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnSuivant, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(169))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblEntrerLeNombre)
					.addGap(45)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
					.addComponent(btnSuivant)
					.addGap(56))
		);
		panel.setLayout(gl_panel);
	}


		@Override
		public void actionPerformed(ActionEvent e) {
	            if(e.getActionCommand().equals("Suivant"))
	            {
	            	int nbr=Integer.parseInt(textField.getText());
	            	Set<patient>lptest = k.ToBeTested(3);  
	            	test2 m=new test2(lptest);
	            	m.show();
	            }
			
		}
}
