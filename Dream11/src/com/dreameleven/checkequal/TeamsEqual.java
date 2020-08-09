package com.dreameleven.checkequal;

import java.util.ArrayList;
import java.util.Collections;

public class TeamsEqual {
	public static void displaySameTeams(ArrayList<String> al) {
		for(int j=0;j<al.size();j++) {
        	for(int k=j+1;k<al.size();k++) {
        		ArrayList<String> first=toList(al.get(j).split(","));
        		ArrayList<String> second=toList(al.get(k).split(","));
        		if(equal(first,second)) {
        			System.out.println((j+1)+" is same as "+(k+1));
        		}
        	}
        }
	}
	
	private static boolean equal(ArrayList<String> first, ArrayList<String> second) {
		int count=0;
		for(int i=0;i<first.size();i++) {
			String s1=first.get(i).trim().toLowerCase();
			String s2=second.get(i).trim().toLowerCase();
			if(s1.equals(s2)) {
				count++;
			}
		}
		if(count==11) {
			return true;
		}
		return false;
	}

	public static ArrayList<String> toList(String[] split) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		for(String data:split) {
			al.add(data);
		}
		Collections.sort(al);
		return al;
	}
}
