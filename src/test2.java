import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class test2 extends JFrame implements ActionListener {

	private JPanel contentPane;
     Set<patient> m;
     Iterator<patient> po;
     JRadioButton rdbtnNewRadioButton_2 ,rdbtnNewRadioButton_3;

	public test2( Set<patient> lptest) {
		m=lptest;
	     po=m.iterator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel =new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblTestCovid = new JLabel("Test COVID_19");
		lblTestCovid.setFont(new Font("Tahoma", Font.BOLD, 17));
		
	
			
		JPanel panel_1 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(136)
							.addComponent(lblTestCovid))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblTestCovid)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addContainerGap())
		);
		while(po.hasNext())
		{
			JLabel lblNewLabel_1 = new JLabel(po.next().nom);
		
		JButton btnNewButton = new JButton("Patient Suivant");
		btnNewButton.addActionListener(this);
		
		
		
		 rdbtnNewRadioButton_2 = new JRadioButton("Positiv");
		
		 rdbtnNewRadioButton_3 = new JRadioButton("Negativ");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(141))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel_1)
					.addContainerGap(288, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_2))
					.addGap(88))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(rdbtnNewRadioButton_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(7)
					.addComponent(rdbtnNewRadioButton_3)
					.addGap(37)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Patient Suivant"))
		{
			String g=rdbtnNewRadioButton_2.getText();
			if(g==null)
			{
				System.out.println("negativ");
			}
			else
			{
				System.out.println("Positiv");
			}
		
		}
	}
}
