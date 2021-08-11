package com.practice.geeksforgeeks;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class RockPaperScissor {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		while(T>0) {
			T--;
			String S= bf.readLine();
			char p1 = S.charAt(0);
			char p2 = S.charAt(1);
			
			System.out.println(p1);
			System.out.println(p2);
			
			if(p1=='R' && p2=='S')
				System.out.println("A");
			
			else if(p1=='S' && p2=='R')
				System.out.println("B");
			
			
			else if(p1=='S' && p2=='P')
				System.out.println("A");
			
			else if(p1=='P' && p2=='S')
				System.out.println("B");
			
			
			else if(p1=='P' && p2=='R')
				System.out.println("A");
			
			else if(p1=='R' && p2=='P')
				System.out.println("B");
			
			
			else if(p1=='R' && p2=='R')
				System.out.println("DRAW");
			
			else if(p1=='P' && p2=='P')
				System.out.println("DRAW");
			
			
			else if(p1=='S' && p2=='S')
				System.out.println("DRAW");
			
			
		}

	}

}
