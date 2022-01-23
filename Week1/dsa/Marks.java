package com.revature.dsa;

import java.util.*;

public class Marks {

	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<>();
		score.add(89);
		score.add(78);
		score.add(99);
		score.add(76);
		score.add(77);
		score.add(67);
		score.add(99);
		score.add(98);
		score.add(90);
		
		score.add(8, 78);
		
		Iterator it = score.listIterator(0);
		while(it.hasNext()) {
			Integer a = (Integer) it.next();
			if(a>100)
				System.out.println("Some entered value is more than 100");
			System.out.print(a+" ");
			
		}
		System.out.println();
		
		System.out.println("The score at index 5 : "+score.get(5));
		System.out.println("The score at index 7 : "+score.get(7));
		
		
		/*
		 * for(int i=0; i<al.size(); i++) { if(al.get(i)>100) {
		 * System.out.println("The score is above 100 at position " + i); } else {
		 * continue; } }
		 */
		

	}

}
