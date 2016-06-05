package Core_Java_samples;

/*
Find the following in string "my brother is taller than me @1233334 . I always a short man , but smatter than him ."
find longest word
search and count the number of letters  "e" in the string
Extract the number of intergers in string
Extract no of doubles letter in string
extract no of words in string
identify the no of sentense in the string
*/

public class QuestionPaper {

	public static void main(String args[]){
		
		
		String s="my brother is taller than me @1233334 . I always a short man , but smatter than him .";
		String s1=s.replaceAll(" ", "");
		System.out.println("String without space: "+s1);
		
		String[] stk=s.split(" ");
		
		int len=0;
		int index=0;
		for(int i=0;i<stk.length;i++){
			int stlen=stk[i].length();
			if(stlen>len){
				len=stlen;
				index=i;
			}
		}
		System.out.println("Longest String is :"+stk[index]);
		
		int count=0;
		for(int i=0;i<s.length();i++){
			if('e'==s.charAt(i)){
				count++;
			}
		}
		System.out.println("Number of e cahracter is:"+count);
		
		int cntDigit=0;
		for(int i=0;i<s.length();i++){
			//if(((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)){
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				cntDigit++;
			}
		}
		System.out.println("Number of Integer in string:"+cntDigit);
		
		/*int wordcnt=0;
		for(int i=0;i<stk.length;i++){
			if(stk[i].length()==1 && ((int)stk[i].charAt(0)>=32&&(int)stk[i].charAt(0)<=47)){	
			}
			else{
				wordcnt++;
			}
		}
		
		System.out.println("Number of Word in String is "+wordcnt);*/
		System.out.println("Number of Word in String is "+(stk.length-3));
		
		
		String[] st=s.split("\\.");
		System.out.println("Number of Sentence :"+st.length);
		
		int doublecnt=0;
		 for(int i=0;i<s.length()-1;i++){
			 if(s.charAt(i+1)==s.charAt(i)){
				 	doublecnt++; 
			 }
		 }
		 System.out.println("Doubles count:"+doublecnt);
		
		
	}
	
	
}