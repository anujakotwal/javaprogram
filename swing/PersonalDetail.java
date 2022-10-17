package swing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;

public class PersonalDetail
{
	 String course[] = {"--Select--","BSc","BBA","BCA","BE"}; 	//list of name.
	 String engg[] = {"--Select--","Comp Sci","Mechanical","Civil","Electronics"}; 	//list of name.

	PersonalDetail()
	{
		JFrame fm=new JFrame();
		
		JLabel j=new JLabel("Personal Details");
		j.setBounds(100,0,200,20);
		fm.add(j);
		
		JLabel j1=new JLabel("Name");
		j1.setBounds(20,40,100,30);
		fm.add(j1);
		
		JTextField t1=new JTextField(20);
		t1.setBounds(130,40,150,30);
		fm.add(t1);
		
		JLabel j2=new JLabel("Email Id:");
		j2.setBounds(20,80,80,30);
		fm.add(j2);
		
		JTextField t2=new JTextField(20);
		t2.setBounds(130,80,150,30);
		fm.add(t2);
		
		JLabel j3=new JLabel("Password:");
		j3.setBounds(20,120,80,30);
		fm.add(j3);
		
		JTextField t3=new JTextField(20);
		t3.setBounds(130,120,150,30);
		fm.add(t3);
		
		JLabel j4=new JLabel("Gender:");
		j4.setBounds(20,160,80,30);
		fm.add(j4);
		
		JRadioButton jcb = new JRadioButton("Male"); 
		jcb.setBounds(130,160,80,30);
		fm.add(jcb); 		
		
		JRadioButton jcb1 = new JRadioButton("Female"); 
		jcb1.setBounds(230,160,80,30);
		fm.add(jcb1); 
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jcb);
		bg.add(jcb1);
		
		JLabel j5=new JLabel("Contact:");
		j5.setBounds(20,200,100,30);
		fm.add(j5);
		
		JTextField t5=new JTextField(20);
		t5.setBounds(130,200,150,30);
		fm.add(t5);
		
		JLabel jl=new JLabel("Educational Qualification");
		jl.setBounds(100,240,200,30);
		fm.add(jl);
		
		JLabel j6=new JLabel("Degree:");
		j6.setBounds(20,280,80,30);
		fm.add(j6);
		
		JComboBox jc = new JComboBox(course); 
		jc.setBounds(130,280,150,30);
		fm.add(jc); 

		JLabel j7=new JLabel("Specialization:");
		j7.setBounds(20,320,80,30);
		fm.add(j7);
		
		JComboBox jc1 = new JComboBox(engg);  
		jc1.setBounds(130,320,150,30);
		fm.add(jc1); 

		JLabel j8=new JLabel("Hobbies:");
		j8.setBounds(20,360,80,30);
		fm.add(j8);
		
		JCheckBox cb1 = new JCheckBox("Playing Chess"); 
		cb1.setBounds(130,360,110,30);
		fm.add(cb1); 
		 
		JCheckBox cb2 = new JCheckBox("Reading Books"); 		 
		cb2.setBounds(250,360,130,30);
		fm.add(cb2); 

		JLabel jl1=new JLabel("Address");
		jl1.setBounds(150,400,200,30);
		fm.add(jl1);
		
		JTextField t6=new JTextField(20);
		t6.setBounds(30,430,300,100);
		fm.add(t6);
		
		JLabel j9=new JLabel("Attach Resume:");
		j9.setBounds(20,530,150,30);
		fm.add(j9);
		
		JButton b=new JButton("Choose File");
		b.setBounds(130,540,120,15);
		fm.add(b);
		
		JButton b1=new JButton("Submit");
		b1.setBounds(100,570,150,30);
		fm.add(b1);
		
			
		fm.setLayout(null);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setSize(400,700);
		fm.setVisible(true);
		fm.getContentPane().setBackground(Color.PINK);

	
	}
	public static void main(String[] args) 
	{
		PersonalDetail pd=new PersonalDetail();

	}

}

