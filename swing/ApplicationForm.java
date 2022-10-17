package swing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;

public class ApplicationForm 
{
	String gen[]= {"-Select-","Male","Female"};
	
	ApplicationForm()
	{
		JFrame fm=new JFrame();
		
		JLabel j=new JLabel("Application Form");
		j.setBounds(0,0,200,30);
		fm.add(j);
		
		JLabel j1=new JLabel(" First Name:");
		j1.setBounds(20,40,100,30);
		fm.add(j1);
		
		JTextField t1=new JTextField(20);
		t1.setBounds(100,40,150,30);
		fm.add(t1);
		
		JLabel j2=new JLabel("Last Name:");
		j2.setBounds(270,40,80,30);
		fm.add(j2);
		
		JTextField t2=new JTextField(20);
		t2.setBounds(340,40,150,30);
		fm.add(t2);
		
		JLabel j3=new JLabel("Date Of Birth:");
		j3.setBounds(20,90,80,30);
		fm.add(j3);
		
		JTextField t3=new JTextField(2);
		t3.setBounds(100,90,150,30);
		fm.add(t3);
		
		JLabel j4=new JLabel("Age:");
		j4.setBounds(270,90,80,30);
		fm.add(j4);
		
		JTextField t4=new JTextField(20);
		t4.setBounds(310,90,150,30);
		fm.add(t4);
		
		JLabel j5=new JLabel("Gender:");
		j5.setBounds(20,140,100,30);
		fm.add(j5);
		
		JComboBox jc = new JComboBox(gen);  
		jc.setBounds(100,140,150,30);
		fm.add(jc);
		
		JLabel j6=new JLabel("Email Address:");
		j6.setBounds(270,140,120,30);
		fm.add(j6);
		
		JTextField t6=new JTextField(20);
		t6.setBounds(370,140,150,30);
		fm.add(t6);
		
		JLabel j7=new JLabel("Position Available:");
		j7.setBounds(20,190,120,30);
		fm.add(j7);
		
		JRadioButton jcb = new JRadioButton("Junior Developer"); 
		jcb.setBounds(130,190,130,30);
		fm.add(jcb); 		
		
		JRadioButton jcb1 = new JRadioButton("Mid-level Developer"); 
		jcb1.setBounds(260,190,140,30);
		fm.add(jcb1); 
		
		JRadioButton jcb2 = new JRadioButton("Senior Developer"); 
		jcb2.setBounds(400,190,130,30);
		fm.add(jcb2); 	
		
		JLabel j8=new JLabel("Programming Language:");
		j8.setBounds(20,240,150,30);
		fm.add(j8);
		
		JCheckBox cb1 = new JCheckBox("Java"); 
		cb1.setBounds(170,240,60,30);
		fm.add(cb1); 
		 
		JCheckBox cb2 = new JCheckBox("JavaScript"); 		 
		cb2.setBounds(230,240,90,30);
		fm.add(cb2); 
		
		JCheckBox cb3 = new JCheckBox("Python"); 
		cb3.setBounds(320,240,110,30);
		fm.add(cb3); 
		
		JLabel j9=new JLabel(" Password:");
		j9.setBounds(20,290,100,30);
		fm.add(j9);
		
		JTextField t9=new JTextField(20);
		t9.setBounds(100,290,150,30);
		fm.add(t9);
		
		JLabel j10=new JLabel("Confirm Password:");
		j10.setBounds(270,290,120,30);
		fm.add(j10);
		
		JTextField t10=new JTextField(20);
		t10.setBounds(390,290,150,30);
		fm.add(t10);
		
		JButton b=new JButton("Submit");
		b.setBounds(20,340,80,30);
		fm.add(b);
		
		JButton b1=new JButton("Reset");
		b1.setBounds(120,340,80,30);
		fm.add(b1);
		
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jcb);
		bg.add(jcb1);
		bg.add(jcb2);

		
		fm.setLayout(null);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setSize(700,500);
		fm.setVisible(true);		
	}
	public static void main(String[] args) 
	{
		ApplicationForm af=new ApplicationForm();

	}

}

