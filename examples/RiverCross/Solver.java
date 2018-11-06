public class Solver 
{
	public static void main(String [] args) 
	{
		UniqueList queue = new UniqueList() ;
		UniqueList visited = new UniqueList() ;

		queue.add(new State()) ;

		while (queue.length() > 0) {
			State s = (State) queue.removeFirst() ;
			if (s.isDone() == true) {
				for (State p = s ; p != null ; ) {
					System.out.println(p) ;
					p = p.prev ;
				}
				System.exit(0) ;
			}
			visited.add(s) ;
			UniqueList nexts = s.nextStates() ;
			for (LinkedListIterator i = nexts.iterator() ; i.hasNext() ; ) {
				State s_next = (State) i.next() ;
				if (s_next.isValid() == false)
					continue ;
				if (visited.contains(s_next) == true)
					continue ;
				queue.add(s_next) ;
			}
		}
		System.out.println("No solution") ;
	}
}
