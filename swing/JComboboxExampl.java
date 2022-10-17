package swing;
import java.awt.*;
import javax.swing.*;
public class JComboboxExampl extends JFrame 
{
   String name[] = {"Ashwini","raj","sanket","anuja","akshay"};//list of name
   public JComboboxExampl()
   {
	   JComboBox jc=new JComboBox(name);//initializing combo box with
	   
	   add(jc);//adding Jcombobox to frame
	   setLayout(new FlowLayout());
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setSize(400,400);
	   setVisible(true);
   }
   public static void main(String[] args)
   {
	   new JComboboxExampl();
   }
}
