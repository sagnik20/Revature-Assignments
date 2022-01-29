 package com.revature.dsa;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Integer n=3;
		towerOfHanoi(n,'A','B','C');

	}
	static void towerOfHanoi(Integer n,char from,  char to, char extra) {
		if(n==1) {
			System.out.println("Move disk 1 from rod " +  from + " to rod " + to);
			return;
		}
		towerOfHanoi(n-1,from,extra,to);
		System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
		towerOfHanoi(n-1,extra,to,from);
	}

}
