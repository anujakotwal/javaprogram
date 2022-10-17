package string;

public class frequency 
{
public static void main(String[] args)
{
	String str="anuja kotwal";
	int[] frequency= new int[str.length()];
	int i,j;
	char String[]=str.toCharArray();
	
	for(i=0;i<str.length();i++)
	{
		frequency[i]=1;
	
	
	for(j=i+1;j<str.length();j++)
	{
		if(String[i]==String[j])
		{
			frequency[i]++; 
	String[j]='0';
}
}
	}
System.out.println("character and their corresponding frequency");
for(i = 0; i <frequency.length; i++) 
{  
    if(String[i]!= ' ' && String[i]!= '0')  
        System.out.println(String[i] + "_" + frequency[i]);  
}
}
}

