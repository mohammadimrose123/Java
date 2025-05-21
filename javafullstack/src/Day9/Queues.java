package Day9;
//Inserting  & deleting Elements in the Queue using methods of queue
import java.util.*;
public class Queues {
	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(45);//Adding Elements in the Queue
		q1.offer(78);
		q1.offer(78);
		System.out.println(q1);
		q1.poll();//Removing Elements in the Queue
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}

}
