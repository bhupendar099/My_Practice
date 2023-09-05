package Apna_College;

import java.util.Stack;

public class reverse_stack { 
	  static class Node{
		  int data;
		  Node next;
		  Node(int data){
			  this.data=data;
			  this.next=null;
		  }
		
	  }
	  
			
	  static class stack{
		  static  Node head=null;
		  
		    public static boolean isEmpty() {
		    	return head==null;
		    	
		    }
		    public static void push( int data) {
		    	 Node newNode =new Node(data);
		    			
		    			if(isEmpty()) {
		    				head=newNode;
		    			}
		    	 newNode.next=head;
		    	head=newNode;
		    }
		    public static int pop() {
		    	if(isEmpty()) {
		    		return -1;
		    	}
		    	 int top= head.data;
		    	 head=head.next;
		    	 return top;
		    }
		    public static int peek() {
		    	if(isEmpty()) {
		    		return -1;
		    		
		    	}
		    	return head.data;
		    }
	  }
	  
	  public  static void pushatBottom(Stack<Integer> s, int data) {
		  if(s.isEmpty()) {
			  s.push(data);
			  return;
		  }
		 int top= s.pop();
		 pushatBottom(s,data);
		 s.push(top);
	}
	  public static void reversStack(Stack<Integer>s) {
		  if(s.isEmpty()) {
			  return;
		  }
		  int top=s.pop();
		  reversStack (s);
		  pushatBottom(s,top);
	  }
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			Stack<Integer> s= new Stack<>();
			
			
			s.push(5);
			s.push(4);
			s.push(4);
			s.push(2);
			
			 pushatBottom(s,9);
			 reversStack (s);
			while(!s.isEmpty()) {
				
				System.out.println(s.peek());
				s.pop();
			}
	  }
}


	
	

	

	
	
		
	
	

	
		
		
		  
		
		

	


