package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingWindData extends JFrame {

    public SwingWindData (final FioWindow parent) {
        setTitle("Data FIO");
        setBounds(400,250, 300, 300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new FlowLayout());

        JTextField jtfFirstNameData = new JTextField();
        JLabel jlFirstName = new JLabel("<html> <i>First name</i>");
        centerPanel.add(jlFirstName, BorderLayout.NORTH);
        jtfFirstNameData.setPreferredSize(new Dimension(300,28));
        centerPanel.add(jtfFirstNameData, BorderLayout.NORTH);

        JTextField jtfMiddleNameData = new JTextField();
        JLabel jlMiddleName = new JLabel("<html> <b>Middle name</b>");
        centerPanel.add(jlMiddleName, BorderLayout.NORTH);
        jtfMiddleNameData.setPreferredSize(new Dimension(300,28));
        centerPanel.add(jtfMiddleNameData, BorderLayout.NORTH);

        JTextField jtfLastNameData = new JTextField();
        JLabel jlLastName = new JLabel("<html> <font size = +2>Last name</font>");
        centerPanel.add(jlLastName, BorderLayout.NORTH);
        jtfLastNameData.setPreferredSize(new Dimension(300,28));
        centerPanel.add(jtfLastNameData, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setBackground(Color.BLUE);
        bottomPanel.setLayout(new FlowLayout());

        JButton jbSend = new JButton ("Send data");
        bottomPanel.add(jbSend);

        jbSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<String> arrayData = new ArrayList<String>();
                arrayData.add(jtfFirstNameData.getText());
                arrayData.add(jtfMiddleNameData.getText());
                arrayData.add(jtfLastNameData.getText());

                parent.setData(arrayData);

                setVisible(false);
            }
        });

        setVisible(true);
    }

}