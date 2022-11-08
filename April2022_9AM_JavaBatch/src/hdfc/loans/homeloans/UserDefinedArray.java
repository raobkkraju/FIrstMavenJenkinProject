package hdfc.loans.homeloans;

public class UserDefinedArray 
{
	int sno;
	String sname;
	
	public UserDefinedArray(int sno, String sname)
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() 
	{
		return "UserDefinedArray [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		UserDefinedArray s = new UserDefinedArray(1744, "sai");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		System.out.println(s);
		
		
		UserDefinedArray s1 = new UserDefinedArray(1, "sai1");
		UserDefinedArray s2 = new UserDefinedArray(2, "sai2");
		UserDefinedArray s3 = new UserDefinedArray(3, "sai3");
		UserDefinedArray s4 = new UserDefinedArray(4, "sai4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		UserDefinedArray[] st = new UserDefinedArray[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(UserDefinedArray p:st)
		{
			System.out.println(p);
		}
	}

}
