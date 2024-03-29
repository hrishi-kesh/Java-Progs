class Demo
{
static int a,b,c;
int x,y,z;
static
{
	a=10;b=20;c=30;
}	
{
	x=9;y=99;z=999;
}
static void disp1()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
       void disp2()
       {
       	System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(z);
       }
}
class LaunchDemo
{
	public static void main(String[] args) {
		
		Demo.disp1();
		Demo d=new Demo();
	    d.disp2();
	}
}