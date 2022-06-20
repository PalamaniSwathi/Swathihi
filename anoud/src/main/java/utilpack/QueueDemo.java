package utilpack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<Integer>();
		//Add elements to the Queue
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		System.out.println("Element in Queue:"+q1);
		//remove first element from the Queue
		System.out.println("Element removed from the queue:"+q1.remove());
		//returns head of the queue
		System.out.println("Head of the queue:"+q1.element());
		//remove and returns the head
		System.out.println("Poll():Returned Head of the queue:"+q1.poll());
		//returns head of the queue
		System.out.println("peek():Head of the queue:"+q1.peek());
		//print the contents of the queue
		System.out.println("Final Queue:"+q1);
	}

}
