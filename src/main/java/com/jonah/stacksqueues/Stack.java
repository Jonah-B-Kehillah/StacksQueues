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
	public int size;
	private int index;
	
	public Stack(int _size) {
		if(_size < 1) {
			throw new InvalidParameterException("The size of the Stack must be greater than 0");
		}
		this.values = new Integer[_size];
		this.size = _size;
	}
	
	public void push(int value) {
		
	}
	public int pop(int index){
		return 0;
	}
	
}
