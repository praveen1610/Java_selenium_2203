package Core_Java_samples;

import java.util.Scanner;

public class String_formating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            for(int j=0; j<15; j++)
                {
                if(s1.length()<15)
                    {
                    s1=s1+" ";
                }
                else {break;}
            }
            System.out.println(s1+""+String.format("%03d",x));
        }
        System.out.println("================================");
	}

}

/*
Input:
java 100
cpp 65
python 50

Expected Output:
================================
java           100 
cpp            065 
python         050 
================================
*/