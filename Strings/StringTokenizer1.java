import java.util.StringTokenizer;
class StringTokenizer1
{
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("ABC for training and technology");
		while(st.hasMoreTokens()==true)
		{
			System.out.println(st.nextToken());
		}
	}
}