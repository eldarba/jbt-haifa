package j.guiListeners;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App2 {

	public static void main(String[] args) {

		JFrame fr = new JFrame("My App"); // window
		fr.setLayout(null); // absolute layout
		fr.setBounds(100, 100, 600, 300); // location and dimensions
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x button function

		JButton bt = new JButton("Click"); // button
		bt.setBounds(100, 100, 150, 25); // location and dimensions
		fr.add(bt); // add button to window

		// register the button to a listener with lambda expression
		bt.addActionListener(e -> {
			JButton button = (JButton) e.getSource();
			System.out.println("button clicked: " + button.getText());
		});

		// paint everything
		fr.setVisible(true);
	}

}
