package com.dreameleven.main;

import java.util.ArrayList;

import com.dreameleven.CommonPlayerStats;
import com.dreameleven.PlayerStats;
import com.dreameleven.allign.AllignBasedOnCredits;
import com.dreameleven.checkequal.TeamsEqual;
import com.dreameleven.read.ReadFromCSV;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/**
			 * it reads the teams
			 */
			ArrayList<String> al = ReadFromCSV.readContent();
			
			
			/**
			 * it will search for common teams teams present or not
			 */
			TeamsEqual.displaySameTeams(al);
			
			
			/**
			 * it display how many times players present in teams
			 */
			//PlayerStats.playerStats(al);
			
			
			/**
			 * it will return same number of teams members in common.
			 */
			//CommonPlayerStats.numberOfteam(al);
			
			
			/**
			 * counts the credits & display remaining credits for team
			 */
			//CommonPlayerStats.remainingcredits(al);
			
			
			/**
			 * it aligns based on credits
			 */
			AllignBasedOnCredits.print(al);
			
			/**
			 * it will display combinations.
			 */
			//ArrayList<String> combinationsList=ReadFromCSV.getCombinationsList();
			//combinationsDisplay(combinationsList);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void combinationsDisplay(ArrayList<String> combinationsList) {
		// TODO Auto-generated method stub
		//int count=1;
		for(int i=0;i<combinationsList.size();i++) {
			for(int j=i+1;j<combinationsList.size();j++) {
					System.out.println(combinationsList.get(i)+" "+combinationsList.get(j));
			}
		}
		
	}

	

}
