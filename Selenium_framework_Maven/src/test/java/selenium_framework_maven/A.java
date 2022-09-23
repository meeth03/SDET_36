package selenium_framework_maven;

public class A {
	public void m1(String a) {
		System.out.println("method");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println(" object method");
	}

	public static void main(String []args )
	{
	A t=new A();
	t.m1("java");
	t.m1(new StringBuffer());
	t.m1(null);
	
	
	}	
}

