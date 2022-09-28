package com.pack.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Demo
{
	
public static void main(String args[]) {
	
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(40);
		
		/*Using for loop*/
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		/*Using while loop*/
		
		int i=0;
		while(i<al.size()) {
			System.out.println(al.get(i));
			i++;
		}
		System.out.println();
		
		//Using for-each loop
		
		for(Integer k:al) {
			System.out.println(k);
		}
		
	}
	
	
		
	
	
}
		
		
		
}

	
	


	
	




	 
	 
