package Sample;
import java.util.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Palindrome {
	
	private static final boolean True = false;

	@BeforeMethod
	public void beforemethodtest(){
		System.out.println("Bfeore Method claoss");
	}
	
	@AfterMethod
	public void Aftermethodtest(){
		System.out.println("After Method claoss");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Bfeore test claoss");
	}
	
	@AfterTest
	public void Aftertest(){
		System.out.println("After test claoss");
	}
	
	
	@Test (priority= 1, enabled = true, groups = {"sanity","regression"})
	public void test(){
		System.out.println("Testing method");
	}
	

	
	@Test (groups = {"sanity"})
	public void dependsonmethodtest(){
		System.out.println("Testing method depends on method ");
		System.out.println("Talindorome Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test (priority= 2,groups = {"regression"})
	public void palindromne()
	  {
		System.out.println("Inside palindrom and regression group");
	  }
	}