class CountVowelConsonant//Imp prog
{
	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String str="This is a boy";
		str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        	{
        		vCount++;
        	}
        	else if(str.charAt(i)>'a'&&str.charAt(i)<'z')
        	{
        		cCount++;
        	}
        }
        System.out.println("number of vovels: "+vCount);
        System.out.println("number of consonants: "+cCount);
    }
}