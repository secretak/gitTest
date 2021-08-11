package com.practice.geeksforgeeks;

public class DeleteAlternateCharacters {
	public static void main(String[] args) {
		String S = "GeeksforGeeks";
		StringBuffer s =new StringBuffer();
        for(int i=0; i<S.length();i+=2 ){
            s.append(S.charAt(i));
        }
        //return s.toString();
        System.out.println(s);
	}

}
