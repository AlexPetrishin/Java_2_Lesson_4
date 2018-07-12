package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingWind {

    public static void main(String[] args) {

        new FioWindow();
    }
}

class FioWindow extends JFrame {

    public JTextField jtfFirstName;
    private JTextField jtfMiddleName;
    private JTextField jtfLastName;

    public FioWindow() {

        setTitle("Input FIO");
        setBounds(300,300, 300, 250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new FlowLayout());

        JPanel bottomPanel = new JPanel();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setBackground(Color.darkGray);
        bottomPanel.setLayout(new FlowLayout());

        jtfFirstName = new JTextField();
        jtfFirstName.setEditable(false);
        centerPanel.add(jtfFirstName, BorderLayout.NORTH);
        jtfFirstName.setPreferredSize(new Dimension(300,28));
        JLabel jlFirstName = new JLabel("<html> <i>First name</i>");
        centerPanel.add(jlFirstName, BorderLayout.NORTH);

        jtfMiddleName = new JTextField();
        jtfMiddleName.setEditable(false);
        centerPanel.add(jtfMiddleName, BorderLayout.NORTH);
        jtfMiddleName.setPreferredSize(new Dimension(300,28));
        JLabel jlMiddleName = new JLabel("<html> <b>Middle name</b>");
        centerPanel.add(jlMiddleName, BorderLayout.NORTH);

        jtfLastName = new JTextField();
        jtfLastName.setEditable(false);
        centerPanel.add(jtfLastName, BorderLayout.NORTH);
        jtfLastName.setPreferredSize(new Dimension(300,28));
        JLabel jlLastName = new JLabel("<html> <font size = +2>Last name</font>");
        centerPanel.add(jlLastName, BorderLayout.NORTH);


        JButton jb = new JButton("Input Data");
        bottomPanel.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FioWindow fioWindow = new FioWindow();
                fioWindow.getParent();
                new SwingWindData (fioWindow);
            }
        });

        setVisible(true);
    }

    protected void setData(ArrayList<String> arrayData) {
        jtfFirstName.setText(arrayData.get(0));
        jtfMiddleName.setText(arrayData.get(1));
        jtfLastName.setText(arrayData.get(2));
    }
}
