package classess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
  
  private JLabel index;
  private JTextfield taskName;
  private JButton done;

  private boolean checked;
  //constructor
  Task()
  {
    this.setPreferredSize(new Dimension(40,20));
    this.setBackground(Color.red);

    this.setLayout(new BorderLayout()):

      checked = false;

    index = new JLabel(**);
    index.setPreferredSize(new Dimension(20,20));
    index.setHorizontalAlignment(JLabel.CENTER);
    this.add(index,BorderLayout.WEST);

    taskName = new JTextfield("Your task here");
    taskName.setBorder(BorderFactory.createEmptyBorder());
    taskNmae.setBackground(Color.red);

    this.add(taskName,BorderLayout.CENTER);

    done = new JButton("done");
    done.setPreferredSize(new Dimension(40,20));
    done.setBorder(BorderFactory.createEmptyBorder());

    this.add(done,BorderLayout.EAST);
}
