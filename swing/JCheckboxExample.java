package swing;
import java.awt.*;
import javax.swing.*;
public class JCheckboxExample extends JFrame
{
  JCheckboxExample()
  {
	  JLabel lb=new JLabel("Course: ");
	  add(lb);
	  JCheckBox jcb=new JCheckBox("C");
	  add(jcb);
	  jcb=new JCheckBox("cpp");
	  add(jcb);
	  jcb=new JCheckBox("Java");
	  add(jcb);
	  jcb=new JCheckBox("python");
	  add(jcb);
	  setLayout(new FlowLayout());
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(400,400);
	  setVisible(true);
	  
  }
  public static void main(String[] args)
  {
	  JCheckboxExample jc=new JCheckboxExample();
  }
}
