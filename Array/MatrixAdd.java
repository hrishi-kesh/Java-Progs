import java.util.Scanner;
class MatrixAdd
{
	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter rows and column of matrix");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("Enter all elements of matrix a ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Enter all elements of matrix b ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			b[i][j]=sc.nextInt();
		    }
		}
        System.out.println("The sum of the matrix a and b is ");
        for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
		    }
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}