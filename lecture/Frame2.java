package lecture;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Frame2 {

	Frame2(){
		JFrame f5 = new JFrame("DETAILS");
		f5.setSize(500, 500);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f5.setLayout(null);
		f5.setVisible(true);
		JTextField t1,t2,t3;
		JLabel l1,l2,l3,l4;
		l1=new JLabel("NAME:");
		l1.setBounds(10,100,100,30);
		t1=new JTextField(30);
		t1.setBounds(200,100,200,30);
		l2=new JLabel("PH.NUM:");
		l2.setBounds(10,150,200,30);
		t2=new JTextField(10);
		t2.setBounds(200,150,200,30);
		l3=new JLabel("NO.OF.TICKETS:");
		l3.setBounds(10,200,100,30);
		t3=new JTextField(2);
		t3.setBounds(200,200,200,30);
		l4=new JLabel("TOTAL COST OF TICKETS:");
		l4.setBounds(10,250,100,30);
		t1.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			String n = t1.getText();
		}
		});
		t2.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			String n = t1.getText();
		}
		});
		t3.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			String n = t1.getText();
		}
		});
		JButton x=new JButton("CONFIRM");
		x.setBounds(100,300,200,30);
		x.addActionListener(new ActionListener(){ 
		public void actionPerformed(ActionEvent e) {
			String s1 = t1.getText(),s2 = t2.getText(),s3 = t3.getText();
			new Write("Name : "+s1);
			new Write("\nMobile : "+s2);
			new Write("\nNumber of Tickets : "+s3+"\n");
			float f = Integer.parseInt(t3.getText())*100;
			JLabel i = new JLabel(Float.toString(f));
			i.setBounds(200,250,200,30);
			f5.add(i);
			JFrame  z = new JFrame("COnfirmation");
			z.setSize(300,300);
			JLabel l1 = new JLabel("Payable fair : Rs. "+f);
			z.add(l1);
			JLabel l2 = new JLabel("Thank You !!!!");
			z.add(l2);
			z.setLayout(new FlowLayout());
			z.setVisible(true);
		}
		});
		f5.add(l1);
		f5.add(t1);
		f5.add(l2);
		f5.add(t2);
		f5.add(l3);
		f5.add(t3);
		f5.add(l4);
		f5.add(x);
		f5.setVisible(true);	
	}
}
