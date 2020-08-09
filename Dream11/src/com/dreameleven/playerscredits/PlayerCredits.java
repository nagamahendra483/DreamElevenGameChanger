package com.dreameleven.playerscredits;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.dreameleven.read.ReadFromCSV;

public class PlayerCredits {
	public static LinkedHashMap<String, Double> getPlayerCredits() {
		LinkedHashMap<String,Double> map=new LinkedHashMap<>();
		ArrayList<String> al=ReadFromCSV.readPlayerCredits();
		for(String data:al) {
			String ar[]=data.split(",");
			map.put(ar[0],Double.parseDouble(ar[1]));
		}		
		return map;
	}
	
	public static LinkedHashMap<String, Double> wkList() {
		LinkedHashMap<String,Double> map=new LinkedHashMap<>();
		ArrayList<String> al=ReadFromCSV.readWKCredits();
		for(String data:al) {
			String ar[]=data.split(",");
			map.put(ar[0],Double.parseDouble(ar[1]));
		}		
		return map;
	}
	
	public static LinkedHashMap<String, Double> batsMenList() {
		LinkedHashMap<String,Double> map=new LinkedHashMap<>();
		ArrayList<String> al=ReadFromCSV.readBATCredits();
		for(String data:al) {
			String ar[]=data.split(",");
			map.put(ar[0],Double.parseDouble(ar[1]));
		}		
		return map;
	}
	
	public static LinkedHashMap<String, Double> allRounderList() {
		LinkedHashMap<String,Double> map=new LinkedHashMap<>();
		ArrayList<String> al=ReadFromCSV.readALLCredits();
		for(String data:al) {
			String ar[]=data.split(",");
			map.put(ar[0],Double.parseDouble(ar[1]));
		}		
		return map;
	}
	
	public static LinkedHashMap<String, Double> bowerList() {
		LinkedHashMap<String,Double> map=new LinkedHashMap<>();
		ArrayList<String> al=ReadFromCSV.readBOWCredits();
		for(String data:al) {
			String ar[]=data.split(",");
			map.put(ar[0],Double.parseDouble(ar[1]));
		}		
		return map;
	}
	

	
}
