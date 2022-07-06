package utilpack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(5);
		s.push(2);
		s.push(9);
		s.push(4);
		s.push(8);
		System.out.println("Element in stack:"+s);
		Integer element=s.pop();
		System.out.println("Remove element:"+element);
		System.out.println("After Remove element:"+s);
		Integer Element=s.peek();	
		System.out.println("Element at top:"+Element);
		System.out.println("Stack:"+s);
		
	}
}
