/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonah.stacksqueues;

/**
 *
 * @author jonah
 */

import java.util.*;

public class StackQueueTest {
	
	private static final int power = 24;
	
	public static void main(String[] args){
		
		Stack stack = new Stack((int) Math.round(Math.pow(2, power)));
		print(Integer.toString(stack.getFree()));
		
		Date date = new Date();
		long time = date.getTime();
		
		for(int i = 0; i < (int) Math.round(Math.pow(2, power))-1; i++)
			stack.push(i);
		Date date2 = new Date();
		long time2 = date2.getTime();
		print(Long.toString((time2-time)));
		
		print(Integer.toString(stack.getFree()));
		
	}
	
	private static void print(){
		System.out.println();
	}
	private static void print(String input){
		System.out.println(input);
	}
	
}
