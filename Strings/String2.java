class String2
{

void stringEquals()
{
	String s1=new String("SUBHU");
	String s2=new String("SUBHU");
	if(s1.equals(s2))
	{
		System.out.println("Strings are equal");
	}	
	else
	{
		System.out.println("Strings are not equal");
	}
}
void stringRef()
{
	String s1=new String("RAMA");
	String s2=new String("RAMA");
	if(s1==s2)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
}
	public static void main(String[] args) {
	 
	String2 s=new String2();
s.stringEquals();
s.stringRef();

	}
}