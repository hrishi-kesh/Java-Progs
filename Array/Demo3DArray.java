import java.util.Scanner;
class Demo3DArray
{
	public static void main(String[] args) {
	    int a[][][]=new int[2][3][5];
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