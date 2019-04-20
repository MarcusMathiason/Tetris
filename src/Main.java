import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		GridLayout layout = new GridLayout(20, 10);
		JFrame frame = new JFrame("Tetris");
		frame.setLayout(layout);
		System.out.println("Layout rows: " + layout.getRows());
		System.out.println("Layout cols: " + layout.getColumns());
		
		for(int i = 0; i < (layout.getRows()*layout.getColumns()); i++) {
			System.out.println("i: " + i);
			JLabel label = new JLabel();
			label.setPreferredSize(new Dimension(10, 20));
			label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			frame.add(label);
		}
		
		frame.setLayout(layout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
