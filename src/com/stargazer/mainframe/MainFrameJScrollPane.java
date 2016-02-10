package com.stargazer.mainframe;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

import com.stargazer.ui.util.ConsoleTextArea;

public class MainFrameJScrollPane extends JScrollPane{
	private static final long serialVersionUID = -5454456364291306581L;
	private class MainFrameJScrollPaneUI extends BasicScrollBarUI{
		private JScrollPane jScrollPane;
		public MainFrameJScrollPaneUI(JScrollPane jScrollPane) {
			this.jScrollPane = jScrollPane;
		}
		@Override
		protected void configureScrollBarColors() {
			trackColor = new java.awt.Color(12, 12, 38);
			thumbColor = new java.awt.Color(34, 66, 110);
		}
		@Override
		protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
			g.translate(thumbBounds.x, thumbBounds.y); 
			g.setColor(new java.awt.Color(34, 66, 110));
			g.drawRoundRect(0, 0, 10, thumbBounds.height-1, 5, 5); 
			Graphics2D g2 = (Graphics2D) g;
			RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.addRenderingHints(rh);
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f));
			g2.fillRoundRect(0, 0, 10, thumbBounds.height-1, 5, 5);
		}
		@Override
		protected JButton createIncreaseButton(int orientation) {
			JButton button = new JButton(new ImageIcon(System.getProperty("user.dir") + "/stargazerUIMiu/"+"down.png"));
			button.setBorder(null);
			return button;
		}
		@Override
		protected JButton createDecreaseButton(int orientation) {
			JButton button = new JButton(new ImageIcon(System.getProperty("user.dir") + "/stargazerUIMiu/"+"up.png"));
			button.setBorder(null);
			return button;
		}
	}
	public JScrollPane mainFrameJScrollPane(ConsoleTextArea consoleTextArea) {
		JScrollPane jScrollPane = new JScrollPane(consoleTextArea);
		jScrollPane.setOpaque(false);
		jScrollPane.getViewport().setOpaque(false);
		jScrollPane.getVerticalScrollBar().setUI(new MainFrameJScrollPaneUI(this));
		return jScrollPane;
	}
}
