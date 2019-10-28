package lecture;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Show {

	Show(){
		JLabel c=new JLabel("SHOW TIMINGS");
		JCheckBox c1 = new JCheckBox("2:00pm to 5:00pm && seat availability 40");
		JCheckBox c2 = new JCheckBox("6:00pm to 8:00pm && seat availability 60");
		JCheckBox c3 = new JCheckBox("9:00pm to 12:00pm && seat availability 36");
		JButton p = new JButton("Proceed");
		JButton b = new JButton("Back To Home");
		JLabel c4 = new JLabel(" cost of each ticket is 100");
		JFrame f2 = new JFrame("Hyper");
		f2.setSize(500, 500); 
		f2.setLayout(null);
		f2.setVisible(true);
		c.setBounds(100,15,250,50);
		c1.setBounds(100, 50, 250, 50);
		c2.setBounds(100, 100, 250, 50);
		c3.setBounds(100, 150, 250, 50);
		c4.setBounds(100, 200, 250, 50);
		p.setBounds(300,250,100,50);
		c1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				new Write("Time :"+"2:00pm to 5:00pm\n");
			}
		});
		c2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				new Write("Time :"+"6:00pm to 8:00pm\n");
			}
		});
		c3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				new Write("Time :"+"9:00pm to 12:00pm\n");
			}
		});
		f2.add(c);
		f2.add(c1);
		f2.add(c2);
		f2.add(c3);
		f2.add(c4);
		f2.add(b);
		f2.add(p);
		b.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		f2.dispose();
		}
		});
		p.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		f2.dispose();
		new Frame2();
		}
		});
	}
}