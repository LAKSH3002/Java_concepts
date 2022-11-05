import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 class student_form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;  // we have used 5 labels
    JTextField txt1,txt2,txt3; // we have used three text fields
    // for name , mobile number and email id
    JRadioButton rb1,rb2;
    // This is used to select any options from the given options
    JCheckBox b1,b2,b3;
    // Checkbox means to tick/check the box from the given options
    // either one or more than one options can be checked at once
    JComboBox cb;
    // to create a drop down
    JButton b;
    // to submit the response
    JTextArea area;

    student_form()
    {
        JFrame j = new JFrame("STUDENT FORM");
        j.setBounds(300,80,700,450);
        JLabel l1 = new JLabel("NAME :");
        l1.setBounds(20,20,80,30);
        txt1 = new JTextField();
        txt1.setBounds(100,20,150,30);
        j.add(l1);
        j.add(txt1);

        JLabel l2 = new JLabel("MOBILE.NO :");
        l2.setBounds(300,20,80,30);
        txt2 = new JTextField();
        txt2.setBounds(390,20,150,30);
        j.add(txt2); j.add(l2);

        JLabel l4 = new JLabel("EMAIL ID :");
        l4.setBounds(20,70,80,30);
        txt3 = new JTextField();
        txt3.setBounds(100,70,150,30);
        j.add(l4); j.add(txt3);

        JLabel l3 = new JLabel("GENDER :");
        l3.setBounds(20,120,80,30);
        rb1 = new JRadioButton("MALE");
        rb1.setBounds(100,120,60,30);
        rb2 = new JRadioButton("FEMALE");
        rb2.setBounds(180,120,100,30);

        JLabel l5 = new JLabel("AGE :");
        l5.setBounds(300,70,80,30);
        j.add(l5);

        String age[] = {"18","19","20","21","22"};
        cb = new JComboBox(age);
        cb.setBounds(400,70,90,20);
        j.add(cb);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        j.add(rb1);
        j.add(rb2);
        j.add(l3);

        JLabel l6 = new JLabel("HOBBIES :");
        l6.setBounds(20,175,100,20);
        j.add(l6);

        b1 = new JCheckBox("READING");
        b1.setBounds(100,175,100,20);
        b2 = new JCheckBox("SINGING");
        b2.setBounds(200,175,100,20);
        b3 = new JCheckBox("DANCING");
        b3.setBounds(300,175,100,20);
        j.add(b1);
        j.add(b2);
        j.add(b3);

        JButton b = new JButton("SUBMIT");
        b.setBounds(250,240,100,20);
        j.add(b);

        area = new JTextArea();
        area.setBounds(60,265,550,100);
        j.add(area);

        b.addActionListener(this);

         j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.getContentPane().setBackground(Color.lightGray);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name = txt1.getText();
        String mobile = txt2.getText();
        String gender = rb1.isSelected()?"MALE":rb2.isSelected()?"FEMALE":"--";
        String age = cb.getItemAt(cb.getSelectedIndex()).toString();
        String hobby="";
        if(b1.isBackgroundSet())
        {
            hobby = "READING";
        }
        if(b2.isSelected())
        {
            hobby = hobby+" "+"SINGING";
        }
        if(b3.isSelected())
        {
            hobby = hobby+ " "+ "DANCING";
        }
        area.setText("NAME "+name+"\n"+"MOBILE NUMBER "+mobile+"\n" +"GENDER: "+gender+"\n"+"AGE" +age+"\n"+"HOBBIES "+hobby);
    }
    public static void main(String[] args)
    {
         new student_form() ;
    }
}
