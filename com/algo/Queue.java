package com.algo;

import java.util.Arrays;

public class Queue {
	private String[] qArray;
	private int qSize;
	private int front,rear;
	private int numberOfElements;
	
	public Queue(int qSize){
		this.qSize = qSize;
		qArray = new String[this.qSize];
		front=rear=-1;
		numberOfElements=0;
		Arrays.fill(qArray, "-1");
	}
	
	public void insert(String input){
		if(rear+1<qSize){
			rear++;
			numberOfElements++;
			qArray[rear]=input;	
			System.out.println(input+" added to queue");
		}else{
			System.out.println("Exception : Queue Full");
		}
	}
	
	public String retrieve(){
		String out="-1";
		if(front+1<=rear){
			front++;
			out=qArray[front];
			qArray[front]="-1";
			numberOfElements--;
		}else{
			System.out.println("Exception : Queue Empty");
		}
		return out;
	}

}
