class ReplaceSpace
{
	public static void main(String[] args) {
		char ch='-';
		String str="ABC for trainig and Technology";
		str=str.replace(" ","-");
		System.out.println("String after replacing spaces with given character: ");  
        System.out.println(str);
	}
}