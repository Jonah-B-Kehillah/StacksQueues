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
public class StackQueueTest {
	public static void main(String[] args){
		
		int passes = 0;
		int fails  = 0;
		
		//unit tests start here
		
		//tesing class initialization
		try{
			Stack initTest1 = new Stack(3);
			passes++;
		} catch(RuntimeException err){
			fails++;
			print("initTest1 Failed");
		}
		try{
			Stack initTest2 = new Stack(18967);
			passes++;
		} catch(RuntimeException err){
			fails++;
			print("initTest2 Failed");
		}
		try{
			Stack initTest3 = new Stack(0);
			fails++;
			print("initTest3 Failed");
		} catch(RuntimeException err){
			passes++;
		}
		
		//testing size getting
		Stack sizeTest1 = new Stack(3);
		Stack sizeTest2 = new Stack(12);
		if(sizeTest1.getSize() == 3) passes++; else {
			fails++;
			print("sizeTest1 failed");
		}
		if(sizeTest2.getSize() == 12) passes++; else {
			fails++;
			print("sizeTest2 failed");
		}
		
		//testing pushing
		Stack pushTest1 = new Stack(3);
		Stack pushTest2 = new Stack(5);
		try{
			pushTest1.push(1);
			pushTest1.push(7);
			pushTest1.push(3);
			if(pushTest1.toString().equals("1 7 3")) passes++; else {
				print("pushTest1 failed, value mismatch");
				fails++;
			}
		} catch(RuntimeException err) {
			print("pushTest1 failed, pushing");
			fails++;
		}
		try{
			pushTest2.push(5);
			pushTest2.push(4);
			pushTest2.push(3);
			pushTest2.push(2);
			pushTest2.push(1);
			pushTest2.push(27);
			fails++; // if the test reaches here, 27 was erroniously added despite size limitations
		} catch(RuntimeException err) {
			passes++;
		}
		
		//testing multipush
		Stack multiPushTest = new Stack(3);
		try{
			multiPushTest.multiPush(new Integer[] {1,2,3});
			if(multiPushTest.toString().equals("1 2 3")) passes++; else {
				print("multiPush failed, value mismatch");
				fails++;
			}
		} catch(RuntimeException err) {
			fails++;
			print("multiPush failed, pushing");
		}
		// Since multiPush is otherwise just an implementation of push, only its unique functionality needs to be tested
		
		//testing pop
		Stack popTest1 = new Stack(3);
		popTest1.multiPush(new Integer[] {1,2,3});
		int x1 = 0;
		Stack popTest2 = new Stack(3);
		int x2 = 0;
		try{
			x1 += popTest1.pop();
			x1 += popTest1.pop();
			x1 += popTest1.pop();
			if(x1 == 6) passes++; else {
				print("popTest1 failed, value mismatch");
				fails++;
			}
		} catch(RuntimeException err) {
			fails++;
			print("popTest1 failed, popping");
		}
		try{
			popTest2.pop();
			fails++;
			print("popTest2 failed");
		} catch(RuntimeException err) {
			passes++;
		}
		
		Stack getTest1 = new Stack(2);
		getTest1.multiPush(new Integer[] {1,2});
		Stack getTest2 = new Stack(2);
		getTest2.push(1);
		Stack getTest3 = new Stack(2);
		//testing getFree
		try{if(getTest1.getFree() == 0) passes++; else {fails++; print("getFree1 failed");}}
		catch(RuntimeException err){fails++; print("getFree1 failed");}
		try{if(getTest2.getFree() == 1) passes++; else {fails++; print("getFree2 failed");}}
		catch(RuntimeException err){fails++; print("getFree2 failed");}
		try{if(getTest3.getFree() == 2) passes++; else {fails++; print("getFree3 failed");}}
		catch(RuntimeException err){fails++; print("getFree3 failed");}
		//testing getHead
		try{if(getTest1.getHead() == 2) passes++; else {fails++; print("getHead1 failed");}}
		catch(RuntimeException err){fails++; print("getHead1 failed");}
		try{if(getTest2.getHead() == 1) passes++; else {fails++; print("getHead2 failed");}}
		catch(RuntimeException err){fails++; print("getHead2 failed");}
		try{getTest3.getHead(); fails++; print("getHead3 failed");} catch(RuntimeException err) {passes++;}
		
		print(String.format("%d test(s) passed, %d test(s) failed", passes, fails));
		
	}
	
	private static void print(){
		System.out.println();
	}
	private static void print(String input){
		System.out.println(input);
	}
	
}
