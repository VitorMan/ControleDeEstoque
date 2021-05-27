package telas;

import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	public MainFrame(){
		setDefaultCloseOperation(3);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(640,480));
		setLocationRelativeTo(null);
	}
}
