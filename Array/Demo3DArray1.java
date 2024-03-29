import java.util.Scanner;
class Demo3DArray1
{
	public static void main(String[] args) {
		int a[][][]=new int[2][][];
		a[0]=new int[3][];
		a[1]=new int[2][];
		a[0][0]=new int[5];
		a[0][1]=new int[7];
		a[0][2]=new int[6];
		a[1][0]=new int[8];
		a[1][1]=new int[9];
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++)
	    	{
	    		for(int k=0;k<a[i][j].length;k++)
	    		{
	    			System.out.print("Enter the marks of student("+k+") in class("+j+") belongs to school("+i+")");
	    			a[i][j][k]=sc.nextInt();
	    		}
	    	}
	    }
	   for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++)
	    	{
	    		for(int k=0;k<a[i][j].length;k++)
	    		{
	    			System.out.print("The marks of student("+k+") in class("+j+") belongs to school("+i+")==>"+a[i][j][k]);
	    			}
	    			}
	    			} 
	    		
	   
	}
}