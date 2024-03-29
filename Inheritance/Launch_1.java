class You
{
    private int acc_no;
    private int pass_wd;
You()
{
 acc_no=1111;
 pass_wd=2222;
}
}
class Friend extends You
{
	void change_detail()
	{
		acc_no=8888;
		pass_wd=9999;
	}
	void disp()
	{
		System.out.println(acc_no);
		System.out.println(pass_wd);
	}
}
class Launch
{
	public static void main(String[] args) {
		Friend f1=new Friend();
		f1.change_detail();
		f1.disp();
	}
}