public class StrList
{
	StrListNode first = null ;
	StrListNode last = null ;
	int nNode = 0 ;

	public StrList()
	{
	}

	public int length()
	{
		return nNode ;
	}

	public boolean add(String data)
	{
		if (last == null) {
			first = new StrListNode(data) ;
			last = first ;
		}
		else {
			last.addNext(data) ;
		}
		nNode += 1 ;

		return true ;
	}

	public boolean removeFirst(String data)
	{
		StrListNode prev = null ;
		for (StrListNode i = first ; i != null ; i = i.next) {
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


	public StrListIterator iterator() 
	{
		return new StrListIterator(first) ;
	}

	public String toString() 
	{
		String r = "<" ;
		StrListIterator i ;
		for (i = iterator() ; i.hasNext() ; ) {
			String data = i.next() ;
			r = r + data + (i.hasNext() ? "," : ">") ;
		}
		return r ;
	}
}
