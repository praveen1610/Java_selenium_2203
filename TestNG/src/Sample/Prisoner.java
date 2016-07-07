package Sample;

import java.util.Scanner;

public class Prisoner {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t;
    t=sc.nextInt();

    for(int i=1;i<=t;i++) {
       int noOfPrisoners, mnoOfSweets, startid;
       noOfPrisoners = sc.nextInt();
       mnoOfSweets = sc.nextInt();
       startid = sc.nextInt();
       startid = startid - 1;
        while (mnoOfSweets > 0) {
            if (startid > noOfPrisoners) {
                startid = 1;
            }
            mnoOfSweets--;
            startid = startid + 1;
        }
        System.out.println(startid);
    }
}
}
