package com.cashkaro.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgClass1 {

	@BeforeSuite
	public static void beforesuite(){
		System.out.println("TestNgClass1 Before Suite is printed");
	}
	
	@Parameters({ "TESTING" })
	@BeforeMethod
	public static void beforeMethod(String TESTINGParameter){
		System.out.println("TestNgClass1 Before method is printed");
		System.out.println("****************** "+TESTINGParameter);
	}
	
	@BeforeTest
	public static void beforeTest(){
		System.out.println("TestNgClass1 Before Test is printed");
		
	}
	
	@BeforeClass
	public static void beforeclass(){
		System.out.println("TestNgClass1 Before Class is printed");
	}
	
	@Test
	public static void test(){
		System.out.println("TestNgClass1 Test is printed");
	}
	
	@AfterMethod
	public static void AfterMethod(){
		System.out.println("TestNgClass1 After method is printed");
	}
	
	@AfterTest
	public static void AfterTest(){
		System.out.println("TestNgClass1 After Test is printed");
		
	}
	
	@AfterClass
	public static void Afterclass(){
		System.out.println("TestNgClass1 After Class is printed");
	}
	
	@AfterSuite
	public static void Aftersuite(){
		System.out.println("TestNgClass1 After Suite is printed");
	}
	
}
