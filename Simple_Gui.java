import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

     abstract class SIMPLE_GUI extends JFrame implements ActionListener
    {
        Frame f1;
        Button b1;
        TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
        Label lak,l1,l2,l3,l4,l5,l6,l7,l8,details;
        SIMPLE_GUI()
        {
            f1 = new Frame();
            //create a frame
            f1.setVisible(true);
            // create a component
            lak = new Label("PROJECT NAME");
            lak.setBounds(30,50,100,30);
            f1.add(lak);
            //Text field
            txt1 = new TextField();
            txt1.setBounds(130,50,200,30);
            // object call
            f1.add(txt1);
            f1.setLayout(null);
            //NULL

            l1 = new Label("YOUR NAME");
            l1.setBounds(30,90,100,30);
            f1.add(l1);
            //name ka text field
            txt2 = new TextField();
            txt2.setBounds(130,90,200,30);
            f1.add(txt2);
            f1.setLayout(null);

            l2 = new Label("ENTER ADDRESS:");
            l2.setBounds(20,130,100,30);
            f1.add(l2);
            //name ka text field
            txt3 = new TextField();
            txt3.setBounds(130,130,200,30);
            f1.add(txt3);
            f1.setLayout(null);

            l3 = new Label("CITY");
            l3.setBounds(30,170,100,30);
            f1.add(l3);
            //name ka text field
            txt4 = new TextField();
            txt4.setBounds(130,170,200,30);
            f1.add(txt4);
            f1.setLayout(null);

            l4 = new Label("STATE:");
            l4.setBounds(350,170,50,30);
            f1.add(l4);
            txt6 = new TextField();
            txt6.setBounds(350,170,200,30);
            f1.add(txt6);
            f1.setLayout(null);

            l5 = new Label("PINCODE");
            l5.setBounds(30,210,100,30);
            f1.add(l5);
            //name ka text field
            txt5 = new TextField();
            txt5.setBounds(130,210,200,30);
            f1.add(txt5);
            f1.setLayout(null);

            // create a component
            b1 = new Button("SUBMIT");
            b1.setBounds(150,270,100,30);
            f1.add(b1);
            b1.setBackground(Color.gray);

            details = new Label("Details:");
            details.setBounds(50, 300, 200, 30);
            f1.add(details);


            f1.setBounds(350,75,650,550);
            f1.setLayout(null);
            f1.setVisible(true);
        }
        public static void main(String[] args)
        {
            SIMPLE_GUI g = new SIMPLE_GUI() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            };
        }
    }

