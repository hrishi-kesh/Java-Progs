class Heart
{
	int hr;
	Heart(int hr)
	{
		this.hr=hr;
	}
	int getHeartBeat()
	{
		return hr;
	}
}
class Brain
{
	int iq;
	Brain(int iq)
	{
		this.iq=iq;
	}
	int getIq()
	{
		return iq;
	}
}
class Bike
{
	int milage;
    Bike(int milage)
    {
    	this.milage=milage;
    }
    int getMilage()
    {
    	return milage;
    }
}
class Book
{
	int pg_no;
	Book(int pg_no)
	{
		this.pg_no=pg_no;
	}
	int getPgNo()
	{
		return pg_no;
	}
}
class Student
{
	Heart h=new Heart(72);
	Brain br=new Brain(100);
	void hasA(Bike b)
	{
		System.out.println(b.getMilage());
	}
	void hasA(Book bk)
	{
		System.out.println(bk.getPgNo());
	}
}
class LaunchStudent
{
	public static void main(String[] args) {
		Student s=new Student();
		Bike b=new Bike(40);
		Book bk=new Book(100);
		System.out.println(s.h.getHeartBeat());
		System.out.println(s.br.getIq());
		System.out.println(b.getMilage());
		System.out.println(bk.getPgNo());
		s.hasA(b);
		s.hasA(bk);
	}
}