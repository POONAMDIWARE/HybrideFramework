package com.test;

import java.util.List;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listener.MyListener;
import com.pages.DashboardPage;
import com.pages.LoginPage;
@Listeners(MyListener.class)
public class LoginTest extends BaseClass{
	
	LoginPage lp=null;
	DashboardPage dp =null;
	
	@BeforeSuite
	public void setup() {
		
		intilization();
		reportInit();
		lp = new LoginPage(driver);
	}
	@Test
	public void test01() {
		dp= lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
	}
	@Test
	public void test02() {
		List<String>courses = dp.getAllCourses();
		System.out.println(courses);	
	}
	@Test
	public void test03()
	{
		throw new SkipException("Testcase skipped");
	}
	
	@Test
	public void test04()
	{
		throw new SkipException("Testcase skipped");
	}
	

}
