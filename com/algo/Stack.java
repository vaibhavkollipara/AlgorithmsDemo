package com.algo;

import java.util.Arrays;

public class Stack {
	private int[] stackArray;
	private int stackSize;
	private int stackTop;
	
	public Stack(int stackSize){
		this.stackSize = stackSize;
		stackArray = new int[stackSize];
		stackTop=-1;
		Arrays.fill(stackArray, -1);
	}
	
	public void push(int input){
		if(stackTop+1<stackSize){
			stackTop++;
			stackArray[stackTop]=input;
			System.out.println(input+" Added to stack");			
		}else{
			System.out.println("Exception : Stack Full");
		}
	}
	
	public int pop(){
		int out=-1;
		if(stackTop>-1){
			out = stackArray[stackTop];
			stackArray[stackTop]=-1;
			stackTop--;
		}else{
			System.out.println("Exception : Stack Empty");
		}
		return out;
	}
	
	public int peek(){
		if(stackTop>-1){
			return stackArray[stackTop];
		}else{
			System.out.println("Exception : Stack Empty");
			return -1;
		}
	}
	
	public boolean isFull(){
		if(stackTop== stackSize-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty(){
		if(stackTop== -1)
			return true;
		else
			return false;
	}

}
