package Core_Java_samples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class String_DuplicatesInSentence_FreshDesk {
	public static void main(String args[]){
		String a= "There are multiple way to iterate, traverse or loop through Map, HashMap or TreeMap in Java and we all familiar of either all of those or some of those. But to my surprise one of my friends was asked in his interview (he has more than 6 years of experience in java programming) to write code for getting values from hashmap or TreeMap in Java with at least 4 ways. Just like me he also surprised on this question but written it. I don't know why exactly some one ask this kind of java interview question to a relatively senior java programmer. Though my closest guess is to verify that whether he is still hands on with coding in java. Anyway that gives me idea to write this Java tutorial and here is multiple ways to traverse, iterate or loop on a Map in Java, so remember this because you may also ask this question J.";
		String[] b = a.split(",|\\.| ");
		HashMap<String, Integer> inputmap = new HashMap<String, Integer>();
		for(int i = 0; i<b.length; i++){
			if(!inputmap.containsKey(b[i])){
				inputmap.put(b[i], 1);
			}else{
				inputmap.put(b[i], inputmap.get(b[i])+1);
			}			
		}
		//Iteration with forloop
//		for(String key:inputmap.keySet()){
//			System.out.println("Word: " +key+" Values: "+inputmap.get(key));
//		}
		
		//Iteration using keySet
		Set<String> KeySet = inputmap.keySet();
		Iterator<String> KeySetIterator = KeySet.iterator();
		while(KeySetIterator.hasNext()){
			String Keys = KeySetIterator.next();
			
			System.out.println("Word: "+Keys+" Values: " +inputmap.get(Keys));
			
		}
	}


}
