package Sample;

import java.util.Scanner;
//Find the Different 
public class plus_minus {
    public static void main(String[] args) {double negative=0;
 double positive=0;
 double zero=0;  
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int [] arr=new int[n];
 for(int m:arr)
 {
      m=scn.nextInt();
      if(m==0)
      {
            zero++;
       }
      else if(m<0)
     {
            negative++;
      }
     else if(m>0)
    {
          positive++;
     }
 }
 System.out.println("No of positive signature no divided by array size: "+positive/n);
 System.out.println("No of positive signature no divided by array size: "+negative/n);
 System.out.println("No of positive signature no divided by array size: "+zero/n);
   }
}
