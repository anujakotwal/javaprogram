package awt;
import java.awt.*;
public class ButtonExample extends Frame
{
ButtonExample()
{
	Button btn=new Button("Hello world");
	add(btn);
	setTitle("Spark");
	setLayout(new FlowLayout());
	setSize(400,500);
	setVisible(true);
}
public static void main(String[] args)
{
	ButtonExample b1=new ButtonExample();
}
}
