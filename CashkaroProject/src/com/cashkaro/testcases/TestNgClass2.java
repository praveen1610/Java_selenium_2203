package com.cashkaro.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class TestNgClass2 {

		@BeforeMethod
		public static void beforeMethod(){
			System.out.println("TestNgClass2 Before method is printed");
		}
		@BeforeSuite
		public static void beforesuite(){
			System.out.println("TestNgClass2 Before Suite is printed");
		}
		
		@BeforeTest
		public static void beforeTest(){
			System.out.println("TestNgClass2 Before Test is printed");
			
		}
		
		@BeforeClass
		public static void beforeclass(){
			System.out.println("TestNgClass2 Before Class is printed");
		}
		
		@Test
		public static void test(){
			System.out.println("TestNgClass2 Test is printed");
		}
		
		@AfterMethod
		public static void AfterMethod(){
			System.out.println("TestNgClass2 After method is printed");
		}
		
		@AfterTest
		public static void AfterTest(){
			System.out.println("TestNgClass2  After Test is printed");
			
		}
		
		@AfterClass
		public static void Afterclass(){
			System.out.println("TestNgClass2 After Class is printed");
		}
		
		@AfterSuite
		public static void Aftersuite(){
			System.out.println("TestNgClass2 After Suite is printed");
		}
		
		
	}

