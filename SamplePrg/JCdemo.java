import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCdemo extends JFrame implements ItemListener
{
     JTextField jtf;
     JCheckBox jcb1,jcb2;
     public JCdemo()
     {
           setLayout(new FlowLayouy());
           jcb1=new JCheckbox("Swing Demos");
           jcb1.addItemListener(this);
           add(jcb1);
           jcb2=new JCheckbox("Java Demos");
           jcb2.addItemListener(this);
           add(jcb2);
           jtf=new JTextField(35);
           add(jtf);
           setSize(200,200);
           setVisible(true);
           setDefaultOperation(JFrame.EXIT_ON_CLOSE);
     }
     public void item/stateChnaged(ItemEvent ie)
     {
           String text=
