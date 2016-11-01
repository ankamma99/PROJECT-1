import java.util.*;
public class arraydemo2 {
	public static void main(String args[]){
		
	
	int array1[][];
	array1 = new int[3][4];
	for(int i=0;i<3;i++)
		
	{
		for(int j=0;j<4;j++)
		{
		System.out.println("enter the array +i elements");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		array1[i][j]=n;
		}
		
	}
	
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
		System.out.println("the array elements");
			
	    System.out.println(""+array1[i][j]);
		}
	
	}
	
	
}
}