import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;

public class ajoutcritere extends JFrame implements ActionListener {
	static listPatients h=null;
	int i=0;
	private JPanel contentPane;
	patient pat;
	JCheckBox chckbxNewCheckBox,chckbxNewCheckBox_1,chckbxNewCheckBox_2,chckbxNewCheckBox_3,chckbxNewCheckBox_4,chckbxNewCheckBox_5,chckbxNewCheckBox_6,chckbxNewCheckBox_7,chckbxNewCheckBox_8,chckbxNewCheckBox_9;
	public ajoutcritere(patient p) {
		pat=p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		 chckbxNewCheckBox = new JCheckBox("Arrivée de l'étranger");
		
	     chckbxNewCheckBox_1 = new JCheckBox("Contact avec une personne positive");
		
		 chckbxNewCheckBox_2 = new JCheckBox("Température élevée");
		
		 chckbxNewCheckBox_3 = new JCheckBox("Toux séche");
		
         chckbxNewCheckBox_4 = new JCheckBox("Difficulté respiratoire");
		
		 chckbxNewCheckBox_5 = new JCheckBox("Trouble digestifs");
		
		 chckbxNewCheckBox_6 = new JCheckBox("Mal de gorge");
		
		 chckbxNewCheckBox_7 = new JCheckBox("Maux de tête");
		
		 chckbxNewCheckBox_8 = new JCheckBox("Courbatures et douleurs");
		
		chckbxNewCheckBox_9 = new JCheckBox("Fatigue générale");
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(this);
		
		JButton btnRetour = new JButton("Ajouter Patient");
		btnRetour.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox_4)
						.addComponent(chckbxNewCheckBox_3)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(chckbxNewCheckBox_8)
							.addComponent(chckbxNewCheckBox_7)
							.addComponent(chckbxNewCheckBox_6)
							.addComponent(chckbxNewCheckBox_5)
							.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE)
							.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(chckbxNewCheckBox_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRetour, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
						.addComponent(btnSuivant, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
					.addGap(65))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_1)
							.addGap(3)
							.addComponent(chckbxNewCheckBox_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxNewCheckBox_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_5)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_7)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox_8))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(110)
							.addComponent(btnSuivant)
							.addGap(18)
							.addComponent(btnRetour)))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Suivant"))
		{
			if(chckbxNewCheckBox.isSelected())
			{
			
				 String c=chckbxNewCheckBox.getText();
				 pat.addcritere(c);
			}
			if(chckbxNewCheckBox_1.isSelected())
			{
				String c1=chckbxNewCheckBox_1.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_2.isSelected())
			{
				String c2=chckbxNewCheckBox_2.getText();
				 pat.addcritere(c2);
			}
			if(chckbxNewCheckBox_3.isSelected())
			{
				String c1=chckbxNewCheckBox_3.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_4.isSelected())
			{
				String c1=chckbxNewCheckBox_4.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_5.isSelected())
			{
				String c1=chckbxNewCheckBox_5.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_6.isSelected())
			{
				String c1=chckbxNewCheckBox_6.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_7.isSelected())
			{
				String c1=chckbxNewCheckBox_7.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_8.isSelected())
			{
				String c1=chckbxNewCheckBox_8.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_9.isSelected())
			{
				String c1=chckbxNewCheckBox_9.getText();
				 pat.addcritere(c1);
			}
		
		    if(h==null)
		    	{
		    	h=new listPatients();
		    	h.addPatient(pat);
		    	}
		    else if(h!=null)
		    {
		    	h.addPatient(pat);
		    }
		    test p=new test(h);
		    p.show();
		   }
		if(e.getActionCommand().equals("Ajouter Patient"))
		{
			if(chckbxNewCheckBox.isSelected())
			{
				
				 String c=chckbxNewCheckBox.getText();
				 pat.addcritere(c);
			}
			if(chckbxNewCheckBox_1.isSelected())
			{
				String c1=chckbxNewCheckBox_1.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_2.isSelected())
			{
				String c2=chckbxNewCheckBox_2.getText();
				 pat.addcritere(c2);
			}
			if(chckbxNewCheckBox_3.isSelected())
			{
				String c1=chckbxNewCheckBox_3.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_4.isSelected())
			{
				String c1=chckbxNewCheckBox_4.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_5.isSelected())
			{
				String c1=chckbxNewCheckBox_5.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_6.isSelected())
			{
				String c1=chckbxNewCheckBox_6.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_7.isSelected())
			{
				String c1=chckbxNewCheckBox_7.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_8.isSelected())
			{
				String c1=chckbxNewCheckBox_8.getText();
				 pat.addcritere(c1);
			}
			if(chckbxNewCheckBox_9.isSelected())
			{
				String c1=chckbxNewCheckBox_9.getText();
				 pat.addcritere(c1);
			}
			 if(h==null)
		    	{
		    	
		    	h=new listPatients();
		    	h.addPatient(pat);
		    	}
		    else if(h!=null)
		    {
		    	h.addPatient(pat);
		    }
			ajoutpatient h=new ajoutpatient();
			h.show();
		}
		
	}
}
