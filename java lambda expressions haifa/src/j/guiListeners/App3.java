package j.guiListeners;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App3 {

	public static void main(String[] args) {

		JFrame fr = new JFrame("My App"); // window
		fr.setLayout(null); // absolute layout
		fr.setBounds(100, 100, 600, 300); // location and dimensions
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x button function

		JButton bt1 = new JButton("bt1"); // button
		bt1.setBounds(100, 100, 150, 25); // location and dimensions
		fr.add(bt1); // add button to window

		JButton bt2 = new JButton("bt2"); // button
		bt2.setBounds(300, 100, 150, 25); // location and dimensions
		fr.add(bt2); // add button to window

		ActionListener listener = e -> {
			JButton bt = (JButton) e.getSource();
			String btTxt = bt.getText();
			switch (btTxt) {
			case "bt1":
				System.out.println("button clicked");
				break;
			case "bt2":
				JOptionPane.showMessageDialog(bt, "button clicked");
				break;

			default:
				break;
			}
		};

		// register the button to a listener with lambda expression
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);

		// paint everything
		fr.setVisible(true);
	}

}
