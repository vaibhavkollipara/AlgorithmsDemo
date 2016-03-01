package com.algo;

public class LinkList {
	private Node rootNode;
	private Node currentNode;
	
	public void insert(Node node){
		if(rootNode==null){
		this.rootNode = node;
		}else{
			this.currentNode.next =node;
		}
		this.currentNode = node;		
	}
	
	public void delete(String name){
		if(this.rootNode.name==name){
			this.rootNode = this.rootNode.next;
		}else{
			Node temp = rootNode;
			while(temp.next!=null){
				if(temp.next.name==name){
					if(temp.next.next==null){
						temp.next=null;
					}else
						temp.next = temp.next.next;
					
					return;
				}
				temp=temp.next;
			}
		}
	}
	
	public void display(){
		if(this.rootNode==null){
			System.out.println("Exception :LinkList Empty");
		}else{
			Node temp = rootNode;
			while(temp!=null){
				System.out.println(temp.name);
				temp = temp.next;
			}
		}
	}

}
