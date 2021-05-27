package telas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class TelaDeControle extends JPanel{
	
	public Produtos pd;
	private JMenuBar menu;
	public JButton[] bt = new JButton[10];
	public String str[] = {"Produtos","op��o 1","op��o 2", "op��o 3", "op��o 4", "op��o 5", "op��o 6", "op��o 7", "op��o 8", "op��o 9"};
	
	public TelaDeControle() {

		setPreferredSize(new Dimension(1366,768));
		setLayout(new FlowLayout(FlowLayout.CENTER,0,-1));
		menu = new JMenuBar();
		
		menu.setPreferredSize(new Dimension(1366,50));
		this.add(menu);
		menu.setLayout(new FlowLayout());
		//////
		for(int n =0; n<bt.length;n++) {
			bt[n] = new JButton();
			menu.add(bt[n]);
			bt[n].setPreferredSize(new Dimension(130,40));
			bt[n].setText(str[n]);
			if(n>0) {
				bt[n].setEnabled(false);
			}
		}
		setBackground(Color.RED);
	}
}