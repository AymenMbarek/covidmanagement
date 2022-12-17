import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ajoutpatient extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public ajoutpatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNom = new JLabel("Nom");
		
		JLabel lblPrenom = new JLabel("Prenom");
		
		JLabel lblAge = new JLabel("Age");
		
		JLabel lblAjouterPatient = new JLabel("Ajouter patient");
		lblAjouterPatient.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblDelegation = new JLabel("Delegation");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(this);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(this);
			
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAge)
								.addComponent(lblDelegation)
								.addComponent(lblPrenom)
								.addComponent(lblNom))
							.addGap(4)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
								.addComponent(textField_2)
								.addComponent(textField_3)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(105)
							.addComponent(btnSuivant)
							.addGap(68)
							.addComponent(btnRetour))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(145)
							.addComponent(lblAjouterPatient)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(lblAjouterPatient)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNom))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(13))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblPrenom)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAge))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDelegation))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRetour)
						.addComponent(btnSuivant))
					.addGap(25))
		);
		panel.setLayout(gl_panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand().equals("Suivant"))
	{
		String nom=	textField.getText();
	    String prenom=textField_1.getText();
	    int age=Integer.parseInt(textField_2.getText());
	    String delegation=textField_3.getText();
	    
		patient p=new patient(nom,prenom,delegation,age);
		ajoutcritere g=new ajoutcritere(p);
		g.show();
	}
	if(e.getActionCommand().equals("Retour"))
	{
		testcov h=new testcov();
		h.show();
	}
		
	}
}
