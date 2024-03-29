import java.util.Scanner;
class MatrixMul
{
	public static void main(String[] args) {
		int i,j,k,m,n,p,q;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and column of matrix of matrix a");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter all elements of matrix a ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Enter rows and column of matrix of matrix b");
		p=sc.nextInt();
		q=sc.nextInt();
		int b[][]=new int[p][q];
		System.out.println("Enter all elements of matrix b ");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
			b[i][j]=sc.nextInt();
		    }
		}
		if(n!=p)
		{
			System.out.println("matrix mul is not possible");
		}
		int c[][]=new int[m][q];
        System.out.println("The mul of the matrix a and b is ");
        for(i=0;i<m;i++)
		{
			for(j=0;j<q;j++)
			{
			for(k=0;k<p;k++)
			{
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		    }
		    }
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<q;j++)
			{
			System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}