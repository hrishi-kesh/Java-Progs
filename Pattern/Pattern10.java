/* OUTPUT

 *********
  *******
   *****
    ***
     *
         */
class Pattern10
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=11-2*i;k>=1;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}