package saharat.lab6;
public class Add {
	public static void main(String[] args){			
		cars car1 = new cars("1","nisan",9000000);
		cars car2 = new cars("2","toyota",55000000);
		cars car3 = new cars("3","kawasaki",900000);
		

		ArrayListPQ pq = new ArrayListPQ();
		pq.enqueue(car3);
		pq.enqueue(car1);
		pq.enqueue(car2);
		System.out.println(pq.toString());
		
		cars carPq = (cars)pq.peek();
		System.out.println(carPq);
		
		System.out.println(pq.dequeue());
		
		System.out.println(pq.toString());
		System.out.println(pq.peek());
	}
}

