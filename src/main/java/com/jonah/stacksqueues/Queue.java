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
public class Queue {
	
	private Integer[] values;
	private int size;
	private int index = 0;
	
	public void enqueue(int value) {
		
	}
	public int dequeue() {
		if(this.index<1) {
			throw new RuntimeException("Queue underflow error");
		}
		int dq_value = this.values[0];
		
		for(int i = 0; i < this.index-1; i++) { this.values[i] = this.values[i+1]; }
		this.values[this.index] = 0;
		this.index--;
		
		return dq_value;
	}
	
}
