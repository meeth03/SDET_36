package selenium_framework_maven;

import org.testng.annotations.Test;

public class DemoTest3{
	@Test
	public void demoTest() {
		System.out.println("Test1");
}
	@Test
	public void demoTestt1() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println("------->BROWSER"+BROWSER);
		
		
		System.out.println("Test2");
	}
	@Test
	public void demoTest2() {
		System.out.println("Test3");
		System.out.println("Test4");
		
	}


}
