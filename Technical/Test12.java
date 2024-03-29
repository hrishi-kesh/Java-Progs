class Test12
{
	public static void main(String[] args)
   {
		String str="Hello World";
		int pos1=str.indexOf(str.charAt(str.length()-4));
		int pos2=str.lastIndexOf(str.charAt(pos1));
		str=str.substring(pos1,pos2);
		System.out.println(str);
	}
}