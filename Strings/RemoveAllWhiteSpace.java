class RemoveAllWhiteSpace
{
	public static void main(String[] args) {
		String str="This is a boy";
		str=str.replaceAll("\\s+","");
		System.out.println(str);
	}
}