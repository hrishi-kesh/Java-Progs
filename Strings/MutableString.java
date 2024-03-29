class MutableString
{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.append("SITA");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append(" is a good girl");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append("she is good wife of rama");
		System.out.println(s);
		System.out.println(s.capacity());
	}
} 