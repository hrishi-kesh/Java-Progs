import java.util.Scanner;
class Demo2DArray
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][5];
	int i,j;
    for(i=0;i<a.length;i++)
    {
    	for(j=0;j<a[i].length;j++)
    	{
    		System.out.print("Enter the marks of student("+j+") present in class("+i+")");
    		a[i][j]=sc.nextInt();
    	}
    }
for(i=0;i<a.length;i++)	
{
	for(j=0;j<=a[i].length;j++)
	{
		System.out.println("The marks of the student("+j+") in class("+i+")==>"+a[i][j]);
	}
	}
}
}