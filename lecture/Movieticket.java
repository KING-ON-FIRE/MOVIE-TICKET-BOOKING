package lecture;
import javax.swing.*;
import java.awt.event.*;
public class Movieticket {
public static void main(String args[]) {
JFrame f = new JFrame("Welcome To online ticket booking"); 
JButton b1 = new JButton("Movies");
JLabel l = new JLabel("Click On The Button For More Info "); 
JFrame f1 = new JFrame("Movies");  
JButton b = new JButton("Back To Home");
JButton p = new JButton("Proceed");
JButton ex = new JButton("Exit");
f.add(b1);
f.add(ex);
f.add(l);
b1.setBounds(100, 150, 200, 50);
l.setBounds(100, 50, 200, 50);
ex.setBounds(120, 330, 100, 30);
f.setSize(500, 500);
 f.setLayout(null);
 f.setVisible(true);
ex.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) {
f.dispose();
}
});

b1.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e) {
f.dispose();
JButton a1 = new JButton("Hyper");
JButton a2 = new JButton("Syra");
JButton a3 = new JButton("96");
f1.setSize(500, 500);
 f1.setLayout(null);
a1.setBounds(100, 50, 250, 50);
a2.setBounds(100, 100, 250, 50);
a3.setBounds(100, 150, 250, 50);
b.setBounds(100, 250, 100, 50);
f1.add(a1);
f1.add(a3);
f1.add(a2);
f1.add(b);
f1.add(p);
f1.setVisible(true);
b.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
f1.dispose();
f.setVisible(true);
}
});
a1.addActionListener(new ActionListener() 
{
 public void actionPerformed(ActionEvent e) 
{ 
f.dispose();
new Write("Movie : HYPER\n");
new Show();
}
});
a2.addActionListener(new ActionListener() 
{
 public void actionPerformed(ActionEvent e) 
{ 
f.dispose();
new Write("Movie : SYERA\n");
new Show();
}
});
a3.addActionListener(new ActionListener() 
{
 public void actionPerformed(ActionEvent e) 
{ 
f.dispose();
new Write("Movie : HYPER\n");
new Show();
}
});
}
});

}
}