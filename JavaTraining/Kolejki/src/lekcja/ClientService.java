package lekcja;

import java.util.LinkedList;
import java.util.Queue;

public class ClientService {
	public static void main(String[] args) {
		Queue<Client>clientQueue = new LinkedList<>();
		
		clientQueue.offer(new Client("grażynka"));
		clientQueue.offer(new Client("kokokoko"));
		clientQueue.offer(new Client("tutututtu"));
		clientQueue.offer(new Client("dumbo"));
		
		System.out.println("Peek " + clientQueue.peek());
		System.out.println("Peek2 " + clientQueue.peek());
		
		System.out.println("Poll "+ clientQueue.poll());
		System.out.println("Poll2 "+ clientQueue.poll());
		
		System.out.println();
		System.out.println("Stan kolejki " + clientQueue);
		System.out.println("Peek " + clientQueue.peek());
		System.out.println("Stan kolejki " + clientQueue);
		System.out.println("Poll " + clientQueue.poll());
		System.out.println("Stan kolejki: " + clientQueue);
	}
}
