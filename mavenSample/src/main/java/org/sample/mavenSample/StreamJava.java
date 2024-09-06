package org.sample.mavenSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamJava {
	//tack one string array and starting "A" later names
	//@Test
	public void regular() {
	    String[] names = {"Abijeeh","Don","Alekhya","Adam","Ram"};
		List<String> nameList =  Arrays.asList(names);
		int[] i = new int[5];
		ArrayList<String> a = new ArrayList<String>();
		int count=0;
		for (int j = 0; j < nameList.size(); j++) {
			if (nameList.get(j).startsWith("A")) {
				System.out.println(nameList.get(j));
				count++;
			}
		}
		System.out.println("total count  : "+count);
	}
	
	//@Test
	public  void streamFilrer() {
		 String[] names = {"Abijeeh","Don","Alekhya","Adam","Ram"};
		 List<String> namesList =Arrays.asList(names);
		 long c = namesList.stream().filter(s->s.startsWith("A")).count();
		 System.out.println(c);
		 
		 //we take array list using streams
		long m= Stream.of("Abijeeh","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("m")).count();
		System.out.println(m);
		
		//inside the string list we have to print more then 4 latters of a string 
		namesList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//inside the string list we have to print more then 4 latters of a string names and print first one 
		namesList.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	}

	@Test
	public void streamMap() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Gani");
		name.add("Ganga");
		name.add("Raja");
		name.add("Ravi");
		name.add("Suresh");
		name.add("Praveen");
		name.add("Nikhil");
		ArrayList<String> name2 = name;  
		System.out.println("boolean list");
		System.out.println(name2);
		name.stream().filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//shoted list
		Stream.of("ga","gb","a","a","v","d","c").distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("start with R nad less then 5 letters");
		String[] na ={"ravi","pramodh","prabhas","chiru","ram cheran","ntr"};
		List<String> name1 =Arrays.asList(na);
		name1.stream().filter(s-> s.startsWith("r")).filter(s-> s.length()<5).forEach(s->System.out.println(s));
		
		// marge two deffrent lists with using streams
		System.out.println("marge two defferent lists");
		Stream<String> newStream= Stream.concat(name.stream(), name1.stream());
		newStream.sorted().forEach(ga->System.out.println(ga));
		
		//the list contains particular object or not
		System.out.println(name.contains("Suresh"));
		
		//to check  contains one object elements to match another object
		System.out.println("to check  contains one object elements to match another object ");
		System.out.println(name.containsAll(name2));
		
		//using streams and check the particular element present inthe list or not
		boolean a = name.stream().anyMatch(s->s.equalsIgnoreCase("Gani"));
		System.out.println(a);
		Assert.assertTrue(a);
		//fach the list names starting with "g"
		List<String> ls = name.stream().filter(s->s.startsWith("G")).sorted().limit(1).map(s->s.toUpperCase()).collect(Collectors.toList());    
		System.out.println(ls.get(0));
		
	}
}
