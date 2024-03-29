class PrintEvenOdd
{
	    public static void generateEven (int N)
		{
			int even=0;
			while(even<N)
			{
				even=even+2;
				System.out.print(even+" ");
			}
		}
		public static void generateOdd (int N)
		{
			int odd=1;
			while(odd<N)
			{
				odd=odd+2;
				System.out.print(odd+" ");
			}
		}
		public static void main(String[] args) 
	{
		int N;
			System.out.println("The even nos. are:- ");
			generateEven(100);
			System.out.println("The odd nos. are:- ");
			generateOdd(100);
	}
}