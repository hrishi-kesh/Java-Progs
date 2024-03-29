class String4
{

void stringEquals()
{
	String s1="RAMA";
	String s2="SITA";
	String s3=s1+s2;
	String s4=s1+s2;
	if(s3.equals(s4))
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
	String s2="SITA";
	String s3=s1+s2;
	String s4=s1+s2;
	if(s3==s4)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
}
	public static void main(String[] args) {
	 
	String4 s=new String4();
s.stringEquals();
s.stringRef();

	}
}