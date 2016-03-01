package com.algo;

import java.util.Random;

public class ArrayStructure {
private int[] arraylist = new int[50];
private int arraysize = 10;

public void generatRandArray(){
	Random rand = new Random();
	for(int i=0;i<arraysize;i++){
		arraylist[i] = rand.nextInt(20);
	}
}

public void deleteIndex(int delIndex){
	if(delIndex<arraysize){
		for(int i=delIndex;i<arraysize;i++){
			arraylist[i]=arraylist[i+1];
		}
		arraysize--;
	}
}

public void binarySearch(int element){
	int low = 0;
	int high = arraysize-1;
	int mid;
	boolean found = false;
	while(low<=high){
		mid = (low+high)/2;
		if(arraylist[mid]==element){
			System.out.println("Element found at index : "+mid);
			found = true;
			break;
		}else{
			if(arraylist[mid]<element){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
	}
	if(!found){
		System.out.println("Element not found...");
	}
}

public void bubbleSort(){
	for(int i=arraysize-1;i>0;i--){
		for(int j=0;j<i;j++){
			if(arraylist[j]>arraylist[j+1])
				swap(j,j+1);
			//displayArray();
		}
	}
}

public void swap(int indexOne,int indexTwo){
	int temp =arraylist[indexTwo];
	arraylist[indexTwo] = arraylist[indexOne];
	arraylist[indexOne] = temp;
}

public void displayArray(){
	System.out.println();
	for(int i=0;i<arraysize;i++){
		System.out.print("-----");
	}
	System.out.println();
	System.out.print("|");
	for(int i=0; i< arraysize;i++){
		System.out.printf("%2d | ",i);
	}
	System.out.println();
	System.out.print("|");
	for(int i=0; i< arraysize;i++){
		System.out.printf("%2d | ",arraylist[i]);
	}
	System.out.println();
	for(int i=0;i<arraysize;i++){
		System.out.print("-----");
	}
	System.out.println();
}

}
