package com.stargazer.mainframe;

import java.io.IOException;

import javax.swing.UnsupportedLookAndFeelException;

public class MainFrameUIStart {
	public MainFrameUIStart() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, UnsupportedLookAndFeelException {
		System.out.println(System.getProperty("user.dir") + "/stargazerUIMiu/"+"BackGround.png");
	    String file = System.getProperty("user.dir") + "/stargazerUIMiu/"+"BackGround.png";
		StargazerMainFrame stargazerMainFrame = new StargazerMainFrame(file,System.getProperty("user.dir") + "/stargazerUIMiu/"+"logo.png");
		stargazerMainFrame.setVisible(true);
	}
	public static void main(String[] args) {
		try {
			MainFrameUIStart m = new MainFrameUIStart();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
