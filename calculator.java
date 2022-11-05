import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CALCULATOR_JAVA extends Frame implements ActionListener {
    // declare objects
    // no jframe because we are not using swing
    Frame f = new Frame("CALCULATOR");
    Label l1, l2, l3, l0;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5;

    // defining the constructor
    CALCULATOR_JAVA() {
        l0 = new Label("GENERAL - CALCULATOR");
        l0.setBounds(200, 20, 150, 30);
        f.add(l0);

        l1 = new Label("ENTER FIRST NUMBER");
        l1.setBounds(30, 80, 160, 20);
        t1 = new TextField();
        t1.setBounds(200, 80, 120, 20);
        f.add(l1);
        f.add(t1);

        l2 = new Label("ENTER SECOND NUMBER");
        l2.setBounds(30, 110, 160, 20);
        t2 = new TextField();
        t2.setBounds(200, 110, 120, 20);
        f.add(l2);
        f.add(t2);

        b1 = new Button("ADD");
        b1.setBounds(40, 160, 100, 30);
        f.add(b1);

        b2 = new Button("SUBTRACT");
        b2.setBounds(150, 160, 100, 30);
        f.add(b2);

        b3 = new Button("MULTIPLY");
        b3.setBounds(260, 160, 100, 30);
        f.add(b3);

        b4 = new Button("DIVIDE");
        b4.setBounds(370, 160, 100, 30);
        f.add(b4);

        b5 = new Button("CANCEL");
        b5.setBounds(480, 160, 100, 30);
        f.add(b5);

        l3 = new Label("RESULT:");
        l3.setBounds(80, 230, 50, 20);
        t3 = new TextField();
        t3.setBounds(200, 230, 100, 20);
        f.add(l3);
        f.add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        // setDefaultcloseoperation is there only in Jframe package
        f.setBounds(250, 80, 700, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            t3.setText(String.valueOf(n1 + n2));
        }
        if (e.getSource() == b2) {
            t3.setText(String.valueOf(n1 - n2));
        }
        if (e.getSource() == b3) {
            t3.setText(String.valueOf(n1 * n2));
        }
        if (e.getSource() == b4) {
            t3.setText(String.valueOf(n1 / n2));
        }
        if (e.getSource() == b5) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new CALCULATOR_JAVA();
    }
}
