/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonah.stacksqueues;

import java.security.InvalidParameterException;

/**
 *
 * @author jonah
 */
public class Stack {
	
	private Integer[] values;
	private int size;
	private int index = 0;
	
	public Stack(int _size) {
		if(_size < 1) {
			throw new RuntimeException("The size of the Stack must be greater than 0");
		}
		this.values = new Integer[_size];
		this.size = _size;
	}
	
	public void push(int value) {
		if(index == size-1) {
			throw new RuntimeException("Stack overflow error");
		}
		else {
			this.values[index] = value;
			index++;
		}
	}
	
	public int pop(){
		int popped_value = this.values[this.index];
		this.values[this.index] = 0;
		index--;
		return popped_value;
	}
	
	public int getSize() {return this.size;}
	public int getFree() {return this.size -
								this.index;}
	public int getHead() {
		if (index < 1) throw new RuntimeException("There are no values in the stack");
		return this.values[index];
	}
	// more functions here
	
}
