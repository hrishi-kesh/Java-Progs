class Mutable
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("sita");
		StringBuffer s2=new StringBuffer(s1.append("ravana"));
		System.out.println(s1);
        System.out.println(s2);
		StringBuffer s3=s1.append("ravana");
		System.out.println(s3);
		
	}
}