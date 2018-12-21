package se.lexicon.falak.array_workshop;

import java.util.Arrays;

public class StringArraysdemo {
	public static void main(String[]args) {
		String[] names = new String[1];
		names=addToArray(names,"Danel");
		names=addToArray(names,"Falak");
		names=addToArray(names,"Matias");
		names=addToArray(names,"Victor");
		names=addToArray(names,"Simon");
		names=addToArray(names,"Maria");
		names=addToArray(names,"Magmod");
		names=addToArray(names,"Yamen");
		names=addToArray(names,"Mahmoud");
		names=addToArray(names,"Chungzhou");
		names=addToArray(names,"Sara");
		names=addToArray(names,"Emil");
		names=addToArray(names,"Theresia");
		names=addToArray(names,"Erik");
		names=addToArray(names,null);
		printStringArray(names);
		
	}

	public static String[]addToArray(String[] source, String toAdd)	{
		//
		boolean isAdded= false;
		for (int i = 0; i < source.length; i++){
			if (source[i] == null) {
				source [i]=toAdd;
				isAdded=true;
				break;
			}
		}
		if(isAdded == false) {
			source = expandArray(source);
			source[source.length-1] = toAdd;
		}
		return source;
	}
	
	public static void printStringArray(String[] toPrint) {
		for (String s : toPrint) {
			System.out.println(s);
		}
	}
	public static String[]expandArray(String[]source)	{
		//
		return Arrays.copyOf(source, source.length +1);
	}
}
