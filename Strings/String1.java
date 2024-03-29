class String1
{

void stringEquals()
{
	String s1="RAMA";
	 String s2="RAMA";
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
	 String s2="RAMA";
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
	 
	String1 s=new String1();
s.stringEquals();
s.stringRef();

	}
}