package telas;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;

public class Login extends JPanel{
	/** 
	 */
	private static final long serialVersionUID = 1L;
	/** 
	 */
	private JLabel[] lbl;
	private JTextField txt;
	public JButton btn;
	private JPasswordField pass;
	public JFrame jf;
	public Login(){
		this.setPreferredSize(new Dimension(200,200));
		this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.black, Color.black));
		/////
		jf = new JFrame();
		jf.setSize(250,250);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		/////
		ImageIcon us = new ImageIcon("src\\telas\\Imagens\\User.png");
		lbl = new JLabel[3];
		lbl[2] = new JLabel(us, JLabel.CENTER);
		lbl[2].setPreferredSize(new Dimension(200,100));
		add(lbl[2]);
		/////
		lbl[0] = new JLabel("Usuário");	
		lbl[0].setPreferredSize(new Dimension(45,20));
		add(lbl[0]);
		txt = new JTextField();
		txt.setPreferredSize(new Dimension(100,20));
		add(txt);
		lbl[1] = new JLabel("senha");
		lbl[1].setPreferredSize(new Dimension(45,20));
		add(lbl[1]);
		pass = new JPasswordField();
		pass.setPreferredSize(new Dimension(100,20));
		add(pass);
		btn = new JButton("Logar");
		btn.setPreferredSize(new Dimension(70,20));
		add(btn);
		jf.add(this);
		jf.setVisible(true);
	}
}
