import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class signup extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,bg;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b1,b2,b3;
    JComboBox cb1,cb2;
    void backPage() {
        JFrame f1 = new JFrame("NEXUS");

        f1.setSize(950, 650);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setForeground(Color.gray);
        f1.getContentPane().setBackground(Color.gray);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   void signup_page() {
        JFrame f2 = new JFrame("                                       SIGN UP PAGE");
        f2.setSize(750, 500);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        f2.getContentPane().setBackground(Color.blue);

       l1 = new JLabel("ENTER USERNAME");
       l1.setBounds(150,50,180,30);
       t1 = new JTextField();
       t1.setBounds(300,50,200,30);
      //  t1.setBackground(Color.gray);

       l2 = new JLabel("ENTER MAIL ID");
       l2.setBounds(150,90,150,30);
       t2 = new JTextField();
       t2.setBounds(300,90,200,30);
        // t2.setBackground(Color.gray);

       l3 = new JLabel("CONTACT NUMBER");
       l3.setBounds(150,130,150,30);
       t3 = new JTextField();
       t3.setBounds(300,130,200,30);
       // t3.setBackground(Color.gray);

       l4 = new JLabel("DEPARTMENT");
       l4.setBounds(150,170,150,30);
       String dep[] = {"IT","EXTC","COMPS","AIDS","CHEMCIAL"};
       cb1 = new JComboBox(dep);
       cb1.setBounds(300,170,90,30);
       f2.add(cb1);

       l5 = new JLabel("YEAR");
       l5.setBounds(150,210,100,30);
       String Y[] = {"FE","SE","TE","BE"};
       cb2 = new JComboBox(Y);
       cb2.setBounds(300,210,90,30);
       f2.add(cb2);

       l6 = new JLabel("CREATE PASSWORD");
       l6.setBounds(150,250,150,30);
       t4 = new JTextField();
       t4.setBounds(300,250,200,30);

       l7 = new JLabel("CONFIRM PASSWORD");
       l7.setBounds(150,290,150,30);
       t5 = new JTextField();
       t5.setBounds(300,290,200,30);

       b1 = new JButton("SIGN UP");
       b1.setBounds(200,400,100,20);
       b1.setBackground(Color.blue);
       f2.add(b1);

       f2.add(l1);
       f2.add(t1);
       f2.add(l2);
       f2.add(t2);
       f2.add(l3);
       f2.add(t3);
       f2.add(l4);
       f2.add(l5);
       f2.add(l6);
       f2.add(t4);
       f2.add(l7);
       f2.add(t5);
      // f2.add(l6);


       f2.getContentPane().setBackground(Color.lightGray);
       // ENTER USERNAME , MAIL ID , CONTACT NUMBER , DEPARTMENT , YEAR , SET PASSWORD , CONFIRM PASSWORD
        // SIGN UP
        // Already a nexus member? LOGIN

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

    signup l = new signup();
    l.backPage();
    l.signup_page();
    }
}

