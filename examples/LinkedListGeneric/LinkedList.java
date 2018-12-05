public class LinkedList<T>
{
	LinkedListNode<T> first = null ;
	LinkedListNode<T> last = null ;
	int nNode = 0 ;

	public int length()
	{
		return nNode ;
	}

	public boolean add(T data)
	{
		if (last == null) {
			first = new LinkedListNode<T>(data) ;
			last = first ;
		}
		else {
			last = last.addNext(data) ;
		}
		nNode += 1 ;

		return true ;
	}

	public boolean removeFirst(T data)
	{
		LinkedListNode<T> prev = null ;
		for (LinkedListNode<T> i = first ; i != null ; i = i.next) {
			if (data.equals(i.getData())) {
				if (i == first) 
					first = i.next ;
				if (i == last) {
					last = prev ;
					i.next = null ;
				}
				if (prev != null) 
					prev.next = i.next ;
				nNode -= 1 ;	
				return true ;
			}
			prev = i ;
		}
		return false ;
	}

	public void clear()
	{
		first = null ;
		last = null ;
		nNode = 0 ;
	}


	public LinkedListIterator<T> iterator() 
	{
		return new LinkedListIterator<T>(first) ;
	}

	public String toString() 
	{
		String r = "<" ;
		LinkedListIterator<T> i ;
		for (i = iterator() ; i.hasNext() ; ) {
			T data = i.next() ;
			r = r + data + (i.hasNext() ? "," : ">") ;
		}
		return r ;
	}
}
