package app_junit_examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	@Test
	public void test1()
	{

		System.out.println("FROM TEST1");
	}
	@Test
public void test2(){

	System.out.println("from test2");
}
@Before
	public void beforeTest()
	{
		System.out.println("before test");
	}
@After
  public void somo ()
  {
	  System.out.println("SOMU");
  }
@BeforeClass
public static void tom()
{
	System.out.println("tom");
	}
@AfterClass
public static void toms()
{
	System.out.println("from somu");}

}
