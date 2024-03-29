import java.util.Arrays;

class MutipleReturnType
{
	public static Object[] getDetails()
	{
		String name="Ryan";
		int age=25;
		char gender='M';
		long income=100000;
		return new Object[] {name, age,gender, income};
	}
	public static void main(String[] args) 
	{
		Object[] obj=getDetails();
		System.out.println(Arrays.toString(obj));
	}
}