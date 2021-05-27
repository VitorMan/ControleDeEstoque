package telas;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

@SuppressWarnings("serial")
public class Produtos extends JPanel{
	
	public JLabel rows;
	public JLabel Produto;
	public JLabel cod;
	public JLabel qtd;
	public boolean visible;
	
	public Produtos(){
		setPreferredSize(new Dimension(1360,20));
		setLayout(new FlowLayout(FlowLayout.LEADING,0,-1));
		///
		rows = new JLabel("#", JLabel.CENTER);
		rows.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		rows.setPreferredSize(new Dimension(30,20));
		add(rows);
		rows.setVisible(true);
		///
		Produto = new JLabel("Nome Do Produto", JLabel.CENTER);
		Produto.setPreferredSize(new Dimension(400,20));
		Produto.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		add(Produto);
		Produto.setVisible(true);
		///
		cod = new JLabel("cod. do Produto", JLabel.CENTER);
		cod.setPreferredSize(new Dimension(400,20));
		cod.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		add(cod);
		cod.setVisible(true);
		///
		qtd = new JLabel("qtd. em estoque", JLabel.CENTER);
		qtd.setPreferredSize(new Dimension(400,20));
		qtd.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		add(qtd);
		qtd.setVisible(true);
		visible = true;	
	}
	/*
	public static void main(String args[]){
		Produtos p = new Produtos();
		System.out.println(p.getParent());
	}*/
}
