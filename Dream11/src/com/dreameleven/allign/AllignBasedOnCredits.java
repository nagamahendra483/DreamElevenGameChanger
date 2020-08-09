package com.dreameleven.allign;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.dream.sort.SortBasedOnCredits;
import com.dreameleven.playerscredits.PlayerCredits;
import com.dreameleven.read.ReadFromCSV;

public class AllignBasedOnCredits {
	public static int c=0;
	public static void print(ArrayList<String> al) {
		LinkedHashMap<String, Double> wkmap=PlayerCredits.wkList();
		LinkedHashMap<String, Double> batmap=PlayerCredits.batsMenList();
		LinkedHashMap<String, Double> allmap=PlayerCredits.allRounderList();
		LinkedHashMap<String, Double> bowmap=PlayerCredits.bowerList();
		ArrayList<String> cvcList=ReadFromCSV.readCVCList();
		int count=0;
		for(int i=0;i<al.size();i++) {
			LinkedHashMap<String, Double> wkmapt=new LinkedHashMap<String, Double>();
			LinkedHashMap<String, Double> batmapt=new LinkedHashMap<String, Double>();
			LinkedHashMap<String, Double> allmapt=new LinkedHashMap<String, Double>();
			LinkedHashMap<String, Double> bowmapt=new LinkedHashMap<String, Double>();

			String ref[]=al.get(i).split(",");
			
			for(String player:ref) {
				
				if(wkmap.containsKey(player)) {
					wkmapt.put(player,wkmap.get(player));
				}else if(batmap.containsKey(player)) {
					batmapt.put(player,batmap.get(player));
				}else if(allmap.containsKey(player)) {
					allmapt.put(player, allmap.get(player));
				}else if(bowmap.containsKey(player)) {
					bowmapt.put(player, bowmap.get(player));
				}else {
					System.out.println(player+"  team   "+(i+1));
				}
			}
			
			wkmapt=SortBasedOnCredits.sortByValue(wkmapt);
			batmapt=SortBasedOnCredits.sortByValue(batmapt);
			allmapt=SortBasedOnCredits.sortByValue(allmapt);
			bowmapt=SortBasedOnCredits.sortByValue(bowmapt);
			count++;
			c=0;
			String ar[]=cvcList.get(i).split(",");
			ArrayList<String> wk=display(wkmapt,ar[0],ar[1]);
			ArrayList<String> bat=display(batmapt,ar[0],ar[1]);
			ArrayList<String> all=display(allmapt,ar[0],ar[1]);
			ArrayList<String> bow=display(bowmapt,ar[0],ar[1]);
			
			
			
			
			System.out.print("Team"+count+"      ");
			System.out.print(wk+"      ");
			System.out.print(bat+"      ");
			System.out.print(all+"      ");
			System.out.print(bow+"      "+c+" players");
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	public static ArrayList<String> display(LinkedHashMap<String, Double> map,String cap,String vc) {
		
		ArrayList<String> al=new ArrayList<>();
		for (Map.Entry<String, Double> en : map.entrySet()) {
			 if(en.getKey().equals(cap)) {
				 al.add(en.getKey()+"(C) ");
			 }else if(en.getKey().equals(vc)) {
				 al.add(en.getKey()+"(VC) ");
			 }else {
				 al.add(en.getKey());
			 }
        }
		
		ArrayList<String> bl=new ArrayList<>();
		for(int i=al.size()-1;i>=0;i--) {
			bl.add(al.get(i));
		}
		c +=bl.size();
		return bl;
		
	}
}
