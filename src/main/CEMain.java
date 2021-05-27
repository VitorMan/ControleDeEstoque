package main;

import java.awt.Dimension;
import java.awt.event.*;

import telas.*;

public class CEMain{	
	private static TelaDeControle TdC = new TelaDeControle();
	private static MainFrame mf = new MainFrame();
	private static void addActions(){
		TdC.pd = new Produtos();
		TdC.bt[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TdC.pd.getParent() == null) {//.equals("telas.TelaDeControle[,0,0,1366x768,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=1366,height=768]]")) {
					TdC.add(TdC.pd);
					TdC.pd.setVisible(true);
					Dimension MfD = new Dimension(mf.getSize());
					mf.setSize(MfD.width -1,  MfD.height -1 );
					mf.setSize(MfD);
					TdC.pd.visible = true;
				}
			}
		});
	}
	public static void main(String args[]) {
//      abre a tela de login
		Login login = new Login();
		login.btn.addActionListener(new ActionListener() {
// 		clicou fechou
			public void actionPerformed(ActionEvent e) {
				login.jf.dispose();
				mf.add(TdC);
				mf.setVisible(true);
			}
		});
// 		seja feliz no MainFrame
		addActions();
	}
}
