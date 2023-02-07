package com.example;

import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapSample {
	
	

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		Random rn = new Random();
		int key = 0;
		for(int i = 100 ; i<=115; i++){
			int r = rn.nextInt(100+1);
			tm.put(r, "Data "+r);
			key = r;
		}
		
		for (Entry<Integer, String> obj : tm.entrySet()) {
			System.out.println(obj.toString());
		}
		
		System.out.println("putIfAbsent Key " + tm.putIfAbsent(key, "Absent Data 9"));
		
		//First element
		System.out.println("First element " + tm.firstEntry());
		
		//Last element
		System.out.println("Last element " + tm.lastEntry());
		
		//Lower Key
		System.out.println("Lower Key " + tm.lowerKey(55));
		
		System.out.println("Lower Key " + tm.ceilingKey(key));
		
		System.out.println("Lower Key " + tm.ceilingEntry(key));
		
		
		
	}

}
