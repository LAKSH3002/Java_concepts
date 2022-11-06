import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  // swing package has been used in menu_bar , therefore JFrame
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
        j1.setBackground(Color.gray);
        j1.setJMenuBar(mb1);

        file = new JMenu("FILE");
        file.setBounds(0, 0, 50, 30);
        mb1.add(file);

        edit = new JMenu("EDIT");
        edit.setBounds(50, 0, 50, 30);
        mb1.add(edit);

        help = new JMenu("HELP");
        help.setBounds(100, 0, 55, 30);
        mb1.add(help);

        cut = new JMenuItem("CUT");
        edit.add(cut);

        copy = new JMenuItem("COPY");
        edit.add(copy);

        paste = new JMenuItem("PASTE");
        edit.add(paste);

        select_all = new JMenuItem("SELECT_ALL");
        edit.add(select_all);

        open = new JMenuItem("OPEN");
        file.add(open);

        save = new JMenuItem("SAVE");
        file.add(save);

        newFile = new JMenuItem("NEWFILE");
        file.add(newFile);

        feedback = new JMenuItem("FEEDBACK");
        help.add(feedback);

        exit = new JMenuItem("EXIT");
        help.add(exit);

        close = new JMenuItem("CLOSE");
        file.add(close);

        txt = new JTextArea();
        txt.setBounds(00, 0, 750, 450);
        txt.setBackground(Color.gray);
        txt.setForeground(Color.white);
        j1.add(txt);

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
