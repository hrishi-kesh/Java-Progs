/*
********************
**       ***      **
* *     * * *    * *
*  *   *  *  *  *  *
*   * *   *   **   *
*    *    *   **   *
*   * *   *  *  *  *
*  *   *  * *    * *
* *     * **      **
**       **        *
********************
**      * **      **
* *    *  * *    * *
*  *  *   *  *  *  *
*   **    *   **   *
*   **    *   **   *
*  *  *   *  *  *  *
* *    *  * *    * *
**      * **      **
********************
*/
import java.util.Scanner;
class PatternMaster
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	pattern(n);
	}
	static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||j==n/2||i==0
					||i==n-1||i==n/2||i==j||i+j==n-1
					||i+j==n/2||j-i==n/2||i+j==n+n/2-1||i-j==n/2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}