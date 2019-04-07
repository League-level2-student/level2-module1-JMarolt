package intro_to_array_lists;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuestBook {

		public void actionPerformed(ActionListener e) {
		//ActionListener l = new ActionListener();
		JFrame f = new JFrame();
		JButton j1 = new JButton();
		j1.setBounds(150, 250, 100, 100);
		j1.setText("Add");
		JButton j2 = new JButton();
		j2.setText("View");
		j2.setBounds(400, 250, 100, 100);
		f.setSize(600, 600);
		f.setVisible(true);
		f.add(j1);
		f.add(j2);
		j1.addActionListener(e);
		}


	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
