package awt;
import java.awt.*;
public class LabelExample 
{
 LabelExample()
 {
	 Frame fm=new Frame(); //creating a frame
	 Label lb=new Label("welcome to java graphic");//creating a label
	 fm.add(lb);//adding label to the frame
	 fm.setSize(300,300);//setting frame size
	 fm.setVisible(true);
 }
 public static void main(String[] ars)
 {
	 LabelExample l=new LabelExample();
 }
}
