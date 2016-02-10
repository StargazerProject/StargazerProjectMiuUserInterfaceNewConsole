package com.stargazer.mainframe;

import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -3720555214012386633L;

	public MainFrame() {
		((JPanel) this.getContentPane()).setOpaque(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/pisualcells" + "/ui/"+ "ban.png"));
	}
}
