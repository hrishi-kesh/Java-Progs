class String3
{

void stringEquals()
{
	String s1="RAMA";
	String s2=new String("RAMA");
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
	String s1="RAMA";
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
	 
	String3 s=new String3();
s.stringEquals();
s.stringRef();

	}
}