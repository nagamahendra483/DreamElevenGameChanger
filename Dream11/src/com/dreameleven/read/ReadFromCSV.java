package com.dreameleven.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromCSV {
	public static ArrayList<String> readContent() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\Teams.csv"));  
		String line;
		ArrayList<String> al=new ArrayList<String>();
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
			al.add(line.toLowerCase());
		} 
		br.close();
		return al;
	}
	
	public static ArrayList<String> playerList() {
		BufferedReader br;
		String line="";
		try {
			br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\PlayerList.csv"));
			line=br.readLine().toLowerCase();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		ArrayList<String> al=toList(line.split(","));
		return al;
	}
	
	private static ArrayList<String> toList(String[] split) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		for(String data:split) {
			al.add(data);
		}
		return al;
	}
	
	public static ArrayList<String> getCombinationsList()throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\Combinations.csv"));  
		String line=br.readLine().toLowerCase();
		br.close();
		ArrayList<String> al=toList(line.split(","));
		return al;
	}
	
	public static ArrayList<String> readPlayerCredits() {
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\PlayerCredits.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}
	public static ArrayList<String> readALLCredits() {
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\ALL.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}
	public static ArrayList<String> readWKCredits() {
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\WK.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}
	public static ArrayList<String> readBATCredits() {
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\BAT.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}
	
	public static ArrayList<String> readBOWCredits() {
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\BOW.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}

	public static ArrayList<String> readCVCList() {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Dream11\\PlayerDetails\\CVC.csv"));  
			String line;
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				al.add(line.toLowerCase());
			} 
			br.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return al;
	}
	
	
}
