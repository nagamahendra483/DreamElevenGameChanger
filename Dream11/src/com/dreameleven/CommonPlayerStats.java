package com.dreameleven;

import java.util.ArrayList;
import java.util.LinkedHashMap;


import com.dreameleven.checkequal.TeamsEqual;
import com.dreameleven.playerscredits.PlayerCredits;

public class CommonPlayerStats {
	public static void numberOfteam(ArrayList<String> al) {
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				int count=checkCount(TeamsEqual.toList(al.get(i).split(",")),TeamsEqual.toList(al.get(j).split(",")));
				if(count>=10) {
					System.out.println((i+1)+" is same  "+(j+1)+" with "+count+" players");
				}
			}
			
		}
	}
	
	private static int checkCount(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
		// TODO Auto-generated method stub
		int count=0;
		for(String data:arrayList) {
			if(arrayList2.contains(data)) {
				count++;
			}
		}
		return count;
	}

	public static void remainingcredits(ArrayList<String> al) {
		LinkedHashMap<String, Double> map=PlayerCredits.getPlayerCredits();
		int count=0;
		
			for(int i=0;i<al.size();i++) {
				double credits=100;
				int tplayer=0;
				String ref[]=al.get(i).split(",");
				for(String player:ref) {
					player=player.trim();
					if(map.containsKey(player)) {
						credits -=map.get(player);
						tplayer++;
					}else {
						System.out.println("Not in list "+player+" in team "+(i+1));
					}
				}
				count++;
				System.out.println("T"+count+" players "+tplayer+" remaining credits "+credits);
				
			}
			System.out.println("Total Players "+count);
		
		
	}
	
	
	
	
}
