/* OUTPUT
     *
    ***
   *****
  *******
 *********
 *********
 *********
 *********
 *********
         */
class Pattern11
{
public static void main(String[] args) {
	int i,j,k;
	for( i=1;i<=5;i++)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		for( k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=1;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=9;k++)
		{
			System.out.print("*");
		}
	System.out.println();
	}
}
}