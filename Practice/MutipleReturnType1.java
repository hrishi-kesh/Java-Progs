import java.util.Arrays;
import java.util.List;
class MutipleReturnType1
{
	public static List<Object> getDetails()
	{
		String name="Ryan";
		int age=25;
		char gender='M';
		long income=100000;
		return Arrays.asList(name, age, gender, income);
	} 
public static void main(String[] args) {
	List<Object> list=getDetails();
	System.out.println(list);
}
}