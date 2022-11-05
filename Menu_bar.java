import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Menu_bar extends JFrame implements ActionListener {
    JFrame j1 = new JFrame();
    JMenuBar mb1 = new JMenuBar();
    JTextArea txt;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, select_all, open, save, newFile, exit, feedback, close;

    Menu_bar() {

        j1.setTitle("MENU-BAR");
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setVisible(true);
        j1.setLayout(null);
        j1.setBounds(300, 90, 750, 500);
        j1.setJMenuBar(mb1);

        file = new JMenu("FILE");
        file.setBounds(0, 0, 50, 30);
        j1.add(file);

        edit = new JMenu("EDIT");
        edit.setBounds(50, 0, 50, 30);
        j1.add(edit);

        help = new JMenu("HELP");
        help.setBounds(100, 0, 55, 30);
        j1.add(help);

        cut = new JMenuItem("CUT");
        cut.setBounds(0, 40, 40, 30);
        j1.add(cut);

        copy = new JMenuItem("COPY");
        copy.setBounds(50, 40, 45, 30);
        j1.add(copy);

        paste = new JMenuItem("PASTE");
        paste.setBounds(100, 40, 50, 30);
        j1.add(paste);

        select_all = new JMenuItem("SELECT_ALL");
        select_all.setBounds(160, 40, 90, 30);
        j1.add(select_all);

        open = new JMenuItem("OPEN");
        open.setBounds(260, 40, 50, 30);
        j1.add(open);

        save = new JMenuItem("SAVE");
        save.setBounds(320, 40, 50, 30);
        j1.add(save);

        newFile = new JMenuItem("NEWFILE");
        newFile.setBounds(380, 40, 70, 30);
        j1.add(newFile);

        feedback = new JMenuItem("FEEDBACK");
        feedback.setBounds(460, 40, 80, 30);
        j1.add(feedback);

        exit = new JMenuItem("EXIT");
        exit.setBounds(550, 40, 50, 30);
        j1.add(exit);

        close = new JMenuItem("CLOSE");
        close.setBounds(600, 40, 50, 30);
        j1.add(close);

        txt = new JTextArea();
        txt.setBounds(50, 80, 650, 380);
        j1.add(txt);
        txt.setBackground(Color.blue);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        select_all.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            txt.cut();
        }
        if (e.getSource() == copy) {
            txt.copy();
        }
        if (e.getSource() == paste) {
            txt.paste();
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        Menu_bar m = new Menu_bar() ;
    }
}
