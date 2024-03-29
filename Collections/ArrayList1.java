import java.util.*;
class ArrayList1
{
	public static void main(String[] args) 
	{
		ArrayList <String> list=new ArrayList <String> ();
		list.add("ravi");
		list.add("suresh");
		list.add("dinesh");
		list.add("ravi");
		for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i));	
		}
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}