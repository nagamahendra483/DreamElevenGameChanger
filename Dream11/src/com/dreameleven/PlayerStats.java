package com.dreameleven;

import java.util.ArrayList;

import com.dreameleven.read.ReadFromCSV;

public class PlayerStats {
	
	public static void playerStats(ArrayList<String> al) {
		ArrayList<String> playersList=ReadFromCSV.playerList();
		for(String player:playersList) {
			printHisStats(player,al);
		}
	}

	private static void printHisStats(String player, ArrayList<String> al) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(int i=0;i<al.size();i++) {
			if(check(al.get(i).split(","),player)) {
				count++;
			}
		}
		System.out.println(player+" is in "+count+ " teams");
	}

	public static boolean check(String[] split, String player) {
		// TODO Auto-generated method stub
		for(String data:split) {
			if(data.equalsIgnoreCase(player)) {
				return true;
			}
		}
		return false;
	}
}
